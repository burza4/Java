package pracownik;

import dojezdzac.Samochod;
import pracowac.NaprawaSamochodow;
import spedzanieWolnegoCzasu.Silownia;

public class Mechanik extends Pracownik{
    public Mechanik(String zawod) {
        super(zawod);
        setPracowac(new NaprawaSamochodow());
        setDojezdzac(new Samochod());
        setSpedzanieWolnegoCzasu(new Silownia());
    }
}
