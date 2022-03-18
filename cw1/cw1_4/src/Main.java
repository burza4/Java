import duck.Duck;
import duck.MallardDuck;
import duck.RubberDuck;
import duck.WoodenDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck1 = new MallardDuck();
        Duck rubberDuck1 = new RubberDuck();
        Duck woodenDuck1 = new WoodenDuck();
        Duck[] ducks = {mallardDuck1, rubberDuck1, woodenDuck1};
        for(Duck duck:ducks) {
            System.out.println(duck.getClass().getSimpleName() +":");
            duck.getFlyBehavior().Fly();
            duck.getQuackBehaviour().Quack();
        }
        System.out.println("----------------------------------------");
        for(Duck duck:ducks) {
            System.out.println(duck.getClass().getSimpleName() +":");
            if(duck.getClass().getSimpleName().equals("RubberDuck")){
                duck.RocketEngine();
            }
            else {
                duck.getFlyBehavior().Fly();
            }
            duck.getQuackBehaviour().Quack();
        }
    }
}
