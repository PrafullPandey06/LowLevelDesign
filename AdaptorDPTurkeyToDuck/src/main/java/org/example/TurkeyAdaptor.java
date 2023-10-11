//Now, let’s say you’re short on Duck objects and you’d like to
//        use some Turkey objects in their place. Obviously we can’t
//        use the turkeys outright because they have a different interface.
//        So, let’s write an Adapter:

package org.example;

public class TurkeyAdaptor implements Duck{
    Turkey turkey;
    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }
    public void fly() {
        for(int i=0; i<5; i++) {
            turkey.fly();
        }
    }
}
