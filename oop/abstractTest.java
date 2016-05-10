abstract class Demo1{
   public void disp1(){
     System.out.println("Concrete method of abstract class");
   }
   abstract public void disp2();
}

class abstractTest extends Demo1{
   /* I have given the body to abstract method of Demo1 class
   It is must if you don't declare abstract method of super class
   compiler would throw an error*/  
   public void disp2()
   {
       System.out.println("I'm overriding abstract method");
   }
   public static void main(String args[]){
       abstractTest obj = new abstractTest();
       obj.disp2();
       
       Demo1 obj1 = new abstractTest();
       obj1.disp2();
       obj1.disp1();
   }
}

/**
*I'm overriding abstract method
*/