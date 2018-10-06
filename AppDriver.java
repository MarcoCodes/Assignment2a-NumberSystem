/**
      @author       Marco Martinez
      @fileName     AppDriver.java
      @version      1.0
      @description  This program will test the functionality of the classes Number and NumberSystem.
      @date         10/1/2018
 
      Program Change Log 
      ==================
      Name     Date     Description
      Marco    10/1     Create baseline for AppDriver.
 */
 
public class AppDriver
{
   public static void main(String[] args) 
   {
      Number numberTest1 = new Number();
      System.out.println("Number(): " + numberTest1.toString());
      
      Number numberTest2 = new Number(10);
      System.out.println("Number(Int): " + numberTest2.toString());
      
 	Number numberTest3 = new Number(numberTest2);
      System.out.println("Number(Number): " + numberTest3.toString()); 
      
      NumberSystem systemTest1 = new NumberSystem();
      System.out.println("NumberSystem(): " + systemTest1.toString());
      
 	NumberSystem systemTest2 = new NumberSystem(numberTest1);
      System.out.println("NumberSystem(Number aValue): " + systemTest2.toString());
       	
 	NumberSystem systemTest3 = new NumberSystem(numberTest2, numberTest3);
      System.out.println("NumberSystem(Number aValue, Number bValue): " + systemTest3.toString());
       	
 	NumberSystem systemTest4 = new NumberSystem(8);
      System.out.println("NumberSystem(int aValue): " + systemTest4.toString());
      
      NumberSystem systemTest5 = new NumberSystem(10, 5);
      System.out.println("NumberSystem(int aValue, int bValue): " + systemTest5.toString());
      
      NumberSystem systemTest6 = new NumberSystem(9, new Number(4));
      System.out.println("NumberSystem(int aValue, Number bValue): " + systemTest6.toString());
      
      NumberSystem systemTest7 = new NumberSystem(new Number(8), 12);
      System.out.println("NumberSystem(Number aValue, int bValue): " + systemTest7.toString());
      
      NumberSystem test = new NumberSystem(systemTest7);
      System.out.println("NumberSystem(NumberSystem) : " + test.toString());
       
      System.out.println("GetValue(): " + Integer.toString(numberTest1.getValue()));
      
      test.invertA();
      System.out.println("InvertA(): " + test.toString());
      
      test.invertB();
      System.out.println("InvertB(): " + test.toString());
      
      test.add();
      System.out.println("Add(): " + test.toString());
      
      test.sub();
      System.out.println("Sub(): " + test.toString());
      
      test.mult();
      System.out.println("Mult(): " + test.toString());
      
      test.div();
      System.out.println("Div(): " + test.toString());
      
      test.mod();
      System.out.println("Mod(): " + test.toString());
      
      test.setA();
      System.out.println("SetA(): " + test.toString());
      
      test.setA(40);
      System.out.println("SetA(Int): " + test.toString());
      
      test.setA(numberTest1);
      System.out.println("SetA(Number): " + test.toString());
      
      test.setA(systemTest5);
      System.out.println("SetA(NumberSystem): " + test.toString());
      
      test.setB();
      System.out.println("SetB(): " + test.toString());
      
      test.setB(40);
      System.out.println("SetB(Int): " + test.toString());
   
      test.setB(numberTest1);
      System.out.println("SetB(Number): " + test.toString());
      
      test.setB(systemTest5);
      System.out.println("SetB(NumberSystem): " + test.toString());
      
      Number testA = new Number(test.getA());
      System.out.println("GetA(): " + testA.toString());
      
      Number testB = new Number(test.getB());
      System.out.println("GetB(): " + testB.toString());
      
      Number testResult = new Number(test.getResult());
      System.out.println("GetResult(): " + testResult.toString());
   }
}
