interface intstck{
   void push(int item);
   int pop();
 }
class fixedStck implements intstck{
    private int i;
    private int arr[];
    fixedStck(int n){
       arr=new int[n];
       i=-1;
}
    public void push(int item){
      if((arr.length-1)==i) System.out.println("stack is full");
    else{
       arr[++i]=item;
       System.out.println("just pushed "+item);
       }
   }
  public int pop(){
      if(i<0){
         System.out.println("stack is empty");
         return 0;
           }

      else return arr[i--];
  }
public static void main(String a[]){
     fixedStck f1=new fixedStck(5);
     for(int j=0;j<5;++j) f1.push(j);
     System.out.println("stack in f1");
     for(int k=0;k<5;++k) System.out.println(f1.pop());
   }
}