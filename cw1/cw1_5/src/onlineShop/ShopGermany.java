package onlineShop;

import TaxCharge.Germany;

public class ShopGermany extends OnlineShop {
    public ShopGermany() {
        setTaxCharge(new Germany());
        setTax();
    }
}