package edu.wctc.salesfigures;

import edu.wctc.interfaces.IMessenger;
import edu.wctc.interfaces.ISale;
import edu.wctc.interfaces.ISalesReport;

import java.util.List;

public class SalesReport implements ISalesReport {

    private ISale sale;
    @Override
    public void generateReport(List<ISale> salesList) {

        String space = " ";

        for(int i = 0; i < 20; i++) {
            space += " ";
        }

        if(salesList.isEmpty()) {

            System.out.println("There are not any sales yet.");

        }
        else {

            System.out.println("name" + space + "country" + space + "price" + space + "tax" + space + "shipping");

            for (int i = 0; i < salesList.size(); i++) {

                sale = salesList.get(i);

                System.out.println(sale.getName() + space + sale.getCountry() + space + sale.getPrice() + space +
                        sale.getTax() + space + sale.getShippingCost());
            }

        }

    }
}
