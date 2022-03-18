package onlineShop;

import TaxCharge.TaxCharge;

public class OnlineShop {
    public String getTax() {
        return tax;
    }
    public TaxCharge getTaxCharge() {
        return taxCharge;
    }
    public void setTax() {
        this.tax = taxCharge.ChargeTax();
    }
    public void setTaxCharge(TaxCharge taxCharge) {
        this.taxCharge = taxCharge;
    }
    private TaxCharge taxCharge;
    private String tax;
}
