package org.example;

public class NyPizzaStore extends PizzaStore{
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyStyleCheesePizza();
        } else {
            return null;
        }
    }
}
