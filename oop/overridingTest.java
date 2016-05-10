class ABC{

   public void disp()
   {
      System.out.println("disp() method of parent class");
   }

   public void abc()
   {
      System.out.println("abc() method of parent class");
   }     
}


class overridingTest extends ABC{

   public void disp(){
      System.out.println("disp() method of Child class");
   }

   public void xyz(){
      System.out.println("xyz() method of Child class");
   }

   public static void main( String args[]) {
      //Parent class reference to child class object
      ABC obj = new overridingTest();
      obj.disp();
      obj.abc();
   }
}

/**
*disp() method of Child class
*abc() method of parent class
*/