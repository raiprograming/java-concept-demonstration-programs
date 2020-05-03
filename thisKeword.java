public class thisKeword{
     static int a,b,c;
  /*  thisKeword(int a,int e){
         this.a=e;
         c=a;
         }*/
  void sub(){
   System.out.println("done"); 
}
   void add(int d,int e){
        this.sub();
        b=d+e;
         // System.out.println("value of class variable a="+a);
         System.out.println("addition ="+b);
       }
    public static void main(String args[]){
     thisKeword k1=new thisKeword();
           k1.add(4,5);
       }
 }