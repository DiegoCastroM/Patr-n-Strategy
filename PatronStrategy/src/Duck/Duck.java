package Duck;
import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void performQuack(){
        quackBehavior.Squawk();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
