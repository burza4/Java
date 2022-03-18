package onlineShop;

import TaxCharge.UK;

public class ShopUK extends OnlineShop {
    public ShopUK() {
        setTaxCharge(new UK());
        setTax();
    }
}
