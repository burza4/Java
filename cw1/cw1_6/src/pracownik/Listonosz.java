package pracownik;

import dojezdzac.Rower;
import pracowac.RoznoszenieListow;
import spedzanieWolnegoCzasu.Silownia;

public class Listonosz extends Pracownik{
    public Listonosz(String zawod) {
        super(zawod);
        setPracowac(new RoznoszenieListow());
        setDojezdzac(new Rower());
        setSpedzanieWolnegoCzasu(new Silownia());
    }
}
