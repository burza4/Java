package duck;

import flyBehavior.FlyNoWay;
import quackBehaviour.QuackBehaviour;
import flyBehavior.FlyBehavior;

public class Duck {
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }
    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    //anonymous inner class RocketEngine
    public void RocketEngine() {
        FlyNoWay rocketFly = new FlyNoWay() {
            public void Fly() {
                System.out.println("Rocket engine!");
            }
        };
        rocketFly.Fly();
    }
    private FlyBehavior flyBehavior;
    private QuackBehaviour quackBehaviour;
}
