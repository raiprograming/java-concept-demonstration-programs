public class B{
  public static void main(String args[]){
   try{
      int a=100;
      System.out.println(a);
      int b=a/0;
      a=a+1;
      System.out.println(a);
     }
   catch(ArithmeticException e){
    System.out.println("exception thrown"+e);
  }
 }
}