/**
      @author        Marco Martinez
      @fileName      Number.java
      @version       2.0
      @description   A complete overhaul in original "mathobjects" concept with redesigned class layout.

      Classes
         Number
         NumberSystem
 	      AppDriver
 
      Associations
 	      AppDriver --- 1 : 1 ---> NumberSystem
 	      NumberSystem --- 1 : 3 ---> Number
 
      Number
 	      (-) value
 	      (+) Number()
         (+) Number(int n)
         (+) Number(Number anotherNumber)
 	      (+) setValue(int n)
 	      (+) getValue()
 	      (+) toString()
         
      @date         9/21/2018
 
 
      Program Change Log 
      ==================
      Name     Date     Description
      Marco    9/21     Create baseline for class.
      Marco    9/26     Add finishing touches to class.
      Marco    10/1     Redesign with AppDriver -> NumberSystem -> Number relationship; baseline for Number class.
      Marco    10/4     Apply finishing touches to Number class.
 */
 
public class Number
{
   // INSTANCE VARIABLE DECLARATION
   private int value;

   // CLASS CONSTRUCTORS
   // (+) Number()
   public Number()
   {
     this.value = 0;
   }

   // (+) Number(int n)
   public Number(int n)
   {
     if (n != 0) this.value = n;
     else this.value = 0;
   }
    
   // (+) Number(Number anotherNumber)
   public Number(Number anotherNumber)
   {
     this.value = anotherNumber.getValue();
   }
    
   // CHANGE STATE SERVICES
   // (+) setValue()
   public void setValue()
   {
     this.value = 0;
   }
   
   // (+) setValue(int n)
   public void setValue(int n)
   {
     if (n != 0) this.value = n;
     else this.value = 0;
   }

   // READ STATE SERVICES
   // (+) getValue()
   public int getValue()
   {
     return this.value;
   }
    
   // (+) toString()
   public String toString()
   {
     return Integer.toString(this.value);
   }
}