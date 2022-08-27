package edu.wctc.salesfigures;

import edu.wctc.interfaces.IMessenger;
import edu.wctc.interfaces.ISale;
import edu.wctc.interfaces.ISalesReport;
import edu.wctc.interfaces.IShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class SalesManager {


    private ISalesReport salesReport;
    private IShippingPolicy shippingPolicy;
    private IMessenger messenger;
    private List<ISale> sales = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    @Autowired
    public SalesManager(ISalesReport salesReport, IShippingPolicy shippingPolicy, IMessenger messenger)
    {
        this.salesReport = salesReport;
        this.shippingPolicy = shippingPolicy;
        this.messenger = messenger;
    }

    public void displayMenu()
    {

        for(int i = 0; i < 20000; i++) {

            messenger.generateMessage("Choose an option in the menu");
            messenger.generateMessage("1: Add a sale");
            messenger.generateMessage("2: Generate a sales report");
            messenger.generateMessage("3 exit");


            String menuChoice = scan.nextLine();

            if (menuChoice.equals("1")) {
                addSaleToList();
            }
            else if (menuChoice.equals("2")) {
                salesReport.generateReport(sales);
            }
            else if (menuChoice.equals("3")) {
                messenger.generateMessage("app shutting down.");
                return;
            }
            else {
                messenger.generateMessage("Invalid choice please try again");
            }

        }


    }

    public void addSaleToList()
    {

        messenger.generateMessage("What is the Customers name?");
        String name = scan.nextLine();

        messenger.generateMessage("What Country was the purchase made in?");
        String country = scan.nextLine();

        messenger.generateMessage("What was the price?");
        String response  = scan.nextLine();
        double amount = Double.parseDouble(response);

        messenger.generateMessage("How much tax was paid?");
        String theTax  = scan.nextLine();
        double tax = Double.parseDouble(theTax);

        double shipping = shippingPolicy.applyShipping(amount);

        ISale newSale = new Sale(name, country, amount, tax, shipping);

        sales.add(newSale);

    }

}
