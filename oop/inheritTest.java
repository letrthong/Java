//javac inherit.java
//java inherit

class Calculation{ 
   int z;
	
   public void addition(int x, int y){
      z = x+y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Substraction(int x,int y){
      z = x-y;
      System.out.println("The difference between the given numbers:"+z);
   }
   
}

public class inheritTest extends Calculation{    
  
   public void multiplication(int x, int y){
      z = x*y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]){
      int a = 20, b = 10;
      inheritTest demo = new inheritTest();
      demo.addition(a, b);
      demo.Substraction(a, b);
      demo.multiplication(a, b);      
   }

}

/**
*The sum of the given numbers:30
*The difference between the given numbers:10
*The product of the given numbers:200
*/
