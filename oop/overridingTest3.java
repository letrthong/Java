class Vehicle1 {
    public void move () {
         System.out.println ("Vehicles are used for moving from one place to another ");
    }
}

class Car1 extends Vehicle1 {

     @Override // indicates that this method overrides a superclass method
    public void move () {
      //super. move (); // invokes the super class method
      System.out.println ("Car is a good medium of transport ");
    }
}

public class overridingTest3 {
    public static void main (String args []){
        Vehicle1 b = new Car1 (); // Vehicle reference but Car object
        b.move (); //Calls the method in Car class
    }
}


/**
*Vehicles are used for moving from one place to another 
*Car is a good medium of transport
*/