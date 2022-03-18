package TaxCharge;

public class UK implements TaxCharge {
    @Override
    public String ChargeTax() {
        return "30%";
    }
}
