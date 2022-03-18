package duck;

import quackBehaviour.NormalQuack;
import flyBehavior.FlyWithWings;

public class MallardDuck extends Duck{
    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehaviour(new NormalQuack());
    }
}
