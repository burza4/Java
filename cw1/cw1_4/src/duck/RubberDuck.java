package duck;

import quackBehaviour.Squeak;
import flyBehavior.FlyNoWay;

public class RubberDuck extends Duck{
    public RubberDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehaviour(new Squeak());
    }
}
