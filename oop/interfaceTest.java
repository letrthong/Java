interface MyInterface
{
   public void method1();
   public void method2();
}


class interfaceTest  implements MyInterface
{
  public void method1()
  {
      System.out.println("implementation of method1");
  }

  public void method2()
  {
      System.out.println("implementation of method2");
  }

  public static void main(String arg[])
  {
      MyInterface obj = new interfaceTest();
      obj. method1();
  }
}

//implementation of method1