package org.example.Duck;

import org.example.FlyBehaviour.FlyBehaviour;
import org.example.FlyBehaviour.FlyNoWay;
import org.example.QuackBehaviour.MuteQuack;
import org.example.QuackBehaviour.QuackBehaviour;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }

}
