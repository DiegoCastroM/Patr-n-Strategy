import Duck.MallarDuck;
import Duck.*;
import FlyBehavior.*;
import QuackBehavior.*;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavior(new FlyWithJetPack());
        mallard.performFly();

        Duck rubber = new RubberDuck();
        rubber.setFlyBehavior(new FlyNoWay());
        rubber.setQuackBehavior(new Squeak());
        rubber.performFly();
        rubber.performQuack();

        Duck decoy = new DecoyDuck();
        decoy.setFlyBehavior(new FlyNoWay());
        decoy.setQuackBehavior(new MuteQuack());
        decoy.performFly();
        decoy.performQuack();
    }
}