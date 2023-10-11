package org.example;

public class ChichagoPizzaStore extends PizzaStore{
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChichagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
