public class factorial{
   int fact(int n){
       int result=n;
       for(int i=n-1;i>0;i--){
           result=result*i;
           }
       return result;
    }
   public static void main(String args[]){
               int r=5;
               factorial f1=new factorial();
               System.out.println("factorial= "+f1.fact(r));
     }
  }