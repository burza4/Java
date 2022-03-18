package onlineShop;

import TaxCharge.Poland;

public class ShopPoland extends OnlineShop {
    public ShopPoland(){
        setTaxCharge(new Poland());
        setTax();
    }
}
