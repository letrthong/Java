class Human{
   public void eat()
   {
      System.out.println("Human is eating");
   }
}
class overridingTest1 extends Human{
   public void eat(){
      System.out.println("Boy is eating");
   }
   public static void main( String args[]) {
      overridingTest1 obj = new overridingTest1();
      obj.eat();
   }
}

//Boy is eating