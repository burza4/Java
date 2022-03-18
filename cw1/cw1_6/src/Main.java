import pracownik.Lekarz;
import pracownik.Listonosz;
import pracownik.Mechanik;
import pracownik.Pracownik;

public class Main {

    public static void main(String[] args) {
        Lekarz lekarz1 = new Lekarz("Lekarz");
        Mechanik mechanik1 = new Mechanik("Mechanik");
        Listonosz listonosz1 = new Listonosz("Listonosz");
        System.out.println(lekarz1.getZawod()+":");
        lekarz1.getPracowac().Pracuj();
        lekarz1.getDojezdzac().Dojezdzaj();
        lekarz1.getSpedzanieWolnegoCzasu().SpedzajWolnyCzas();
        System.out.println("\n"+mechanik1.getZawod()+":");
        mechanik1.getPracowac().Pracuj();
        mechanik1.getDojezdzac().Dojezdzaj();
        mechanik1.getSpedzanieWolnegoCzasu().SpedzajWolnyCzas();
        System.out.println("\n"+listonosz1.getZawod()+":");
        listonosz1.getPracowac().Pracuj();
        listonosz1.getDojezdzac().Dojezdzaj();
        listonosz1.getSpedzanieWolnegoCzasu().SpedzajWolnyCzas();
    }
}
