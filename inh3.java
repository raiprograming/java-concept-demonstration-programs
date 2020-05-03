 class inh1{
  int a,b,c;
  public void add(int a,int b){
    this.a=a;
    this.b=b;
    c=a+b;
    System.out.println("sum= "+c);
   }
 }
class inh2 extends inh1{
 int a,b,c;
 public void sub(int a,int b){
   c=a-b;
   System.out.println("subtraction = "+c);
 }
}
public class inh3 extends inh2
{
 public static void main(String args[])
{
 inh3 i1=new inh3();
 i1.add(4,5);
 i1.sub(4,5);
  }
}
  
 
  