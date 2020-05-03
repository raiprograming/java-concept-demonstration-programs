public class thisKeword{
    int a,b,c;
    this(int a,int e){
         this.a=a;
         c=e;
         }
    void add(){
         b=a+c;
         System.out.println("addition ="+b);
       }
    public static void main(String args[]){
           this a1=new this(5,6);
           a1.add();
       }
 }