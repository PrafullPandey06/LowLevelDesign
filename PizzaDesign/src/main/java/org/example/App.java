package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       PizzaStore nyStore = new NyPizzaStore(); // ny store and chichago store is subclass of PizzaStore(abstract classs)
         PizzaStore chichagoStore = new ChichagoPizzaStore();

         Pizza pizza = nyStore.OrderPizza("cheese"); // nyStore and chichagoStore has createPizza method
            System.out.println("Ethan ordered a " + pizza.getName() + "\n");
            Pizza pizza1 = chichagoStore.OrderPizza("cheese");
            System.out.println("Joel ordered a " + pizza1.getName() + "\n");
            // rest of pizza methods are in Pizza class and these nyStore and Chicago Store returns object of Pizza class
        // subclass of Pizza class returning different objects of Pizza class
    }
}
