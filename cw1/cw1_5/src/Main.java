import onlineShop.ShopGermany;
import onlineShop.ShopPoland;
import onlineShop.ShopUK;

public class Main {

    public static void main(String[] args) {
        ShopGermany shopGermany = new ShopGermany();
        ShopPoland shopPoland = new ShopPoland();
        ShopUK shopUK = new ShopUK();
        System.out.println(shopGermany.getTax());
        System.out.println(shopPoland.getTax());
        System.out.println(shopUK.getTax());

    }
}
