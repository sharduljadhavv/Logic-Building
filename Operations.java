
import java.util.*;
abstract class  Animal{
    abstract void walk();
    
}

class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
    
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}


public class Operations {
    public static void main(String args[]) {
        
        Horse h1 = new Horse();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.walk();
        Animal a1 = new Animal() {
        a1.walk();    
        };

           
    }
}
