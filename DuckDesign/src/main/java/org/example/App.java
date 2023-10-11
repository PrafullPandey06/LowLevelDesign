package org.example;

import org.example.Duck.Duck;
import org.example.Duck.MallardDuck;
import org.example.Duck.ModelDuck;
import org.example.FlyBehaviour.FlyLikeRocket;

public class App 
{
    public static void main( String[] args )
    {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.swim();
        model.setFlyBehaviour(new FlyLikeRocket());
        model.performFly();
    }
}
