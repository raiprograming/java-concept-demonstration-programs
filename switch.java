class menu{
 public static void main(String args[])
  throws java.io.IOException
 { 
  char choice;
  do{
   System.out.println("help on ;");
   System.out.println("1- if");
   System.out.println("2 -switch");
   System.out.println("3 -while");
   System.out.println("choose oneoption");
   choice=(char)System.in.read();
  }while(choice<'1' || choice>'3');
  System.out.println("\n");
  switch(choice){
   case '1':
         System.out.println("syntax= if(condition) statement sequence");
         break;
   case '2':
        System.out.println("syntax= switch(expression) case(constant value) statement sequence");
        break;
   case '3':
        System.out.println("syntax= while(condition) statement sequence");
        break;
    }
   }
} 