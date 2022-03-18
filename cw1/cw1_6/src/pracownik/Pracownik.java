package pracownik;
import pracowac.Pracowac;
import spedzanieWolnegoCzasu.SpedzanieWolnegoCzasu;
import dojezdzac.Dojezdzac;

public abstract class Pracownik {
    public Pracownik(String zawod){
        this.zawod=zawod;
    }

    public Dojezdzac getDojezdzac() {
        return dojezdzac;
    }

    public Pracowac getPracowac() {
        return pracowac;
    }

    public SpedzanieWolnegoCzasu getSpedzanieWolnegoCzasu() {
        return spedzanieWolnegoCzasu;
    }

    public void setDojezdzac(Dojezdzac dojezdzac) {
        this.dojezdzac = dojezdzac;
    }

    public void setPracowac(Pracowac pracowac) {
        this.pracowac = pracowac;
    }

    public void setSpedzanieWolnegoCzasu(SpedzanieWolnegoCzasu spedzanieWolnegoCzasu) {
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }

    public String getZawod() {
        return zawod;
    }

    private Pracowac pracowac;
    private Dojezdzac dojezdzac;
    private SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    private String zawod;
}
