package org.example.Duck;

import org.example.FlyBehaviour.FlyBehaviour;
import org.example.FlyBehaviour.FlyWithWings;
import org.example.QuackBehaviour.Quack;
import org.example.QuackBehaviour.QuackBehaviour;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }


}
