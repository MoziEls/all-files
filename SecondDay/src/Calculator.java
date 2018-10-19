public class Calculator {
  
    interface IntegerMath {
        int operation(int a, int b);   
    }
  
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
 
    public static void main(String... args) {
    
        Calculator myApp = new Calculator();
   
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath multiplication = (a, b) -> a * b;
        IntegerMath division = (a, b) -> a / b;
        System.out.println( myApp.operateBinary(40, 5, subtraction));
        System.out.println(myApp.operateBinary(20, 10, subtraction));    
        System.out.println(myApp.operateBinary(20, 10, multiplication));    
        System.out.println(myApp.operateBinary(20, 10, division));    
    }
}



