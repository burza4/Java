package TaxCharge;

public class Germany implements TaxCharge {
    @Override
    public String ChargeTax() {
        return "10%";
    }
}
