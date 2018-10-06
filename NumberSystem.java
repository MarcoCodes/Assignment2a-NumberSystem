/**
      @author       Marco Martinez
      @fileName     NumberSystem.java
      @version      2.0
      @description  This program will create and manipulate number objects.
 
      Classes
 	      Number
 	      NumberSystem
 	      AppDriver
 
      Associations
 	      AppDriver --- 1 : 1 ---> NumberSystem
 	      NumberSystem --- 1 : 3 ---> Number
 
      NumberSystem 
 	      (-) Number a
            (-) Number b
            (-) Number result
            (-) int isInverse
            (-) String whatAction
 	      (+) NumberSystem()
 	      (+) NumberSystem(Number aValue)
 	      (+) NumberSystem(Number aValue, Number bValue)
            (+) NumberSystem(int aValue)
            (+) NumberSystem(int aValue, int bValue)
            (+) NumberSystem(int aValue, Number bValue)
            (+) NumberSystem(Number aValue, int bValue)
            (+) NumberSystem(NumberSystem anotherNumberSystem)
            (+) setA()
            (+) setA(int newA)
            (+) setA(Number newA)
            (+) setA(NumberSystem newNumberSystem)
            (+) setB()
            (+) setB(int newB)
            (+) setB(Number newB)
            (+) setB(NumberSystem newNumberSystem)
            (+) add()
            (+) sub() 
            (+) mult() 
            (+) div()
            (+) invertA()
            (+) invertB()
            (+) mod()
            (+) getA()
            (+) getB()
            (+) getResult()
            (+) toString()
 
      @date         9/21/2018
 
 Program Change Log 
  ==========================
  Name      Date     Description
  Marco     10/1     Create baseline for NumberSystem.
  Marco     10/4     Apply finishing touches to NumberSystem class.
 */
 
public class NumberSystem
{
   // INSTANCE VARIABLE DECLARATIONS
   private Number a,
                  b,
                  result;
   private int    isInverse = 0;
   private String whatAction = new String("");

   // CLASS CONSTRUCTORS
   // (+) NumberSystem()
   public NumberSystem()
   {
      this.a = new Number();
      this.b = new Number();
      this.result = new Number();
   }

   // (+) NumberSystem(Number aValue)
   public NumberSystem(Number aValue)
   {
      this.a = new Number(aValue);
      this.b = new Number();
      this.result = new Number();
   }
    
   // (+) NumberSystem(Number aValue, Number bValue)
   public NumberSystem(Number aValue, Number bValue)
   {
      this.a = new Number(aValue);
      this.b = new Number(bValue);
      this.result = new Number();
   }
    
   // (+) NumberSystem(int aValue)
   public NumberSystem(int aValue)
   {
      this.a = new Number(aValue);
      this.b = new Number();
      this.result = new Number();
   }
    
   // (+) NumberSystem(int aValue, int bValue)
   public NumberSystem(int aValue, int bValue)
   {
      this.a = new Number(aValue);
      this.b = new Number(bValue);
      this.result = new Number();
   }
    
   // (+) NumberSystem(int aValue, Number bValue)
   public NumberSystem(int aValue, Number bValue)
   {
      this.a = new Number(aValue);
      this.b = new Number(bValue);
      this.result = new Number();
   }
    
   // (+) NumberSystem(Number aValue, int bValue)
   public NumberSystem(Number aValue, int bValue)
   {
      this.a = new Number(aValue);
      this.b = new Number(bValue);
      this.result = new Number();
   }
    
   // (+) NumberSystem(NumberSystem anotherNumberSystem)
   public NumberSystem(NumberSystem anotherNumberSystem)
   {
      this.a = new Number(anotherNumberSystem.getA());
      this.b = new Number(anotherNumberSystem.getB());
      this.result = new Number(anotherNumberSystem.getResult());
   }
    
   // CHANGE STATE SERVICES
   
   // (+) setA()
   public void setA()
   {
      this.a.setValue();
      isInverse = 0;
   }
   
   // (+) setA(int newA)
   public void setA(int newA)
   {
      this.a.setValue(newA);
      isInverse = 0;
   }
   
   // (+) setA(Number newA)
   public void setA(Number newA)
   {
      this.a.setValue(newA.getValue());
      isInverse = 0;
   }
   
   // (+) setA(NumberSystem newNumberSystem)
   public void setA(NumberSystem newNumberSystem)
   {
      Number newA = new Number(newNumberSystem.getA());
      this.a.setValue(newA.getValue());
   }
   
   // (+) setB()
   public void setB()
   {
      this.b.setValue();
      isInverse = 0;
   }
   
   // (+) setB(int newB)
   public void setB(int newB)
   {
      this.b.setValue(newB);
      isInverse = 0;
   }
   
   // (+) setB(Number newB)
   public void setB(Number newB)
   {
      this.b.setValue(newB.getValue());
      isInverse = 0;
   }
   
   // (+) setB(NumberSystem newNumberSystem)
   public void setB(NumberSystem newNumberSystem)
   {
      Number newB = new Number(newNumberSystem.getB());
      this.b.setValue(newB.getValue());
   }
    
   // (+) add()
   public void add()
   {
      this.result.setValue(this.a.getValue() + this.b.getValue());
      this.whatAction = " + ";
      isInverse = 1;
   }
   
   // (+) sub()
   public void sub()
   {
      this.result.setValue(this.a.getValue() - this.b.getValue());
      this.whatAction = " - ";
      isInverse = 1;    
   }
   
   // (+) mult()
   public void mult()
   {
      this.result.setValue(this.a.getValue() * this.b.getValue());
      this.whatAction = " * ";
      isInverse = 1;
   }
   
   // (+) div()
   public void div()
   {
      this.result.setValue(this.a.getValue() / this.b.getValue());
      this.whatAction = " / ";
      isInverse = 1;
   }
   
   // (+) mod()
   public void mod()
   {
      this.result.setValue(this.a.getValue() % this.b.getValue());
      this.whatAction = " MOD ";
      isInverse = 1;
   }
   
   // (+) invertA()
   public void invertA()
   {
      this.result.setValue(this.a.getValue() * -1);
      isInverse = 2;
   }
   
   // (+) invertB()
   public void invertB()
   {
      this.result.setValue(this.b.getValue() * -1);
      isInverse = 3;
   }
    
   // READ STATE SERVICES
   // (+) getA()
   public Number getA()
   {
      return this.a;
   }
   
   // (+) getB()
   public Number getB()
   {
      return this.b;
   }
   // (+) getResult()
   public Number getResult()
   {
      return this.result;
   }
   
   // (+) toString()
   public String toString()
   {
      if(this.isInverse == 1)
         return this.a.toString() + this.whatAction + this.b.toString() + " = " + this.result.toString();
      else if(this.isInverse == 2)
         return "-(" + this.a.toString() + ") = " + this.result.toString();
      else if(this.isInverse == 3)
         return "-(" + this.b.toString() + ") = " + this.result.toString();
      else return this.a.toString() + ", " + this.b.toString();
   }
}
