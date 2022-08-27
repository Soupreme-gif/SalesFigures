package edu.wctc.shippingPolicies;

import edu.wctc.interfaces.IShippingPolicy;
import edu.wctc.salesfigures.Sale;

public class FreeShippingAfterAmountSpent implements IShippingPolicy {

    @Override
    public double applyShipping(double amount) {

        if(amount < 110.00)
        {
            return 0.00;
        }
        else
        {
            return 20.00;
        }

    }
}
