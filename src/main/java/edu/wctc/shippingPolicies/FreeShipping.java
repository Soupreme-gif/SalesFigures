package edu.wctc.shippingPolicies;

import edu.wctc.interfaces.IShippingPolicy;
import edu.wctc.salesfigures.Sale;

public class FreeShipping implements IShippingPolicy {

    @Override
    public double applyShipping(double amount) {
        return 0.00;
    }
}
