public class accessing{
    int a=10;
    int b=10,c;
    public void add(){
       c=a+b;
       System.out.println(c);
}
   public void sub(){
         System.out.println(a-b);
  }
  public static void main(String args[]){
       accessing a1=new accessing();
       a1.sub();
       System.out.println("done");
       a1.add();
   }
}