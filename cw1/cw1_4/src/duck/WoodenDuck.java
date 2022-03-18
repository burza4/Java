package duck;

import quackBehaviour.MuteQuack;
import flyBehavior.FlyNoWay;

public class WoodenDuck extends Duck{
    public WoodenDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
    }
}
