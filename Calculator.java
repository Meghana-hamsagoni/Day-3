public class Calculator {
   public static int add(int a, int b) {
   return a+b;  
}
public static int subtract(int a, int b) {
   return a-b;  
}

public static void main(String [] args) {
      int addResult = Calculator.add(20,30);
      System.out.println(addResult);
      System.out.println(Calculator.subtract(20,30));
}
}
   