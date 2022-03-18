package TaxCharge;

public class Poland implements TaxCharge {
    @Override
    public String ChargeTax() {
        return "20%";
    }
}
