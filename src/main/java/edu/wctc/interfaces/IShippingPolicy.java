package edu.wctc.interfaces;

import edu.wctc.salesfigures.Sale;

public interface IShippingPolicy {
    double applyShipping(double amount);
}
