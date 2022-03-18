package pracownik;

import dojezdzac.Samochod;
import pracowac.Leczenie;
import spedzanieWolnegoCzasu.LiteraturaPopularnoNaukowa;

public class Lekarz extends Pracownik{
    public Lekarz(String zawod) {
        super(zawod);
        setPracowac(new Leczenie());
        setDojezdzac(new Samochod());
        setSpedzanieWolnegoCzasu(new LiteraturaPopularnoNaukowa());
    }
}
