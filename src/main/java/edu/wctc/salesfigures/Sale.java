package edu.wctc.salesfigures;

import edu.wctc.interfaces.ISale;

public class Sale implements ISale {

    private String name;
    private String country;
    private double price;
    private double tax;
    private double shippingCost;

    public Sale(String name, String country, double price, double tax, double shippingCost)
    {
        this.name = name;
        this.country = country;
        this.price = price;
        this.tax = tax;
        this.shippingCost = shippingCost;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getTax() {
        return tax;
    }

    @Override
    public double getShippingCost() {
        return shippingCost;
    }

}
