package org.example;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck MallardDuck = new MallardDuck();
        Turkey WildTurkey = new WildTurkey();
        Duck TurkeyAdaptor = new TurkeyAdaptor(WildTurkey); // TurkeyAdaptor implements Duck(Interface) and takes a Turkey as a parameter

        System.out.println("The Turkey says...");
        WildTurkey.gobble();
        WildTurkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(MallardDuck);

        System.out.println("\nThe TurkeyAdaptor says...");
        testDuck(TurkeyAdaptor);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
