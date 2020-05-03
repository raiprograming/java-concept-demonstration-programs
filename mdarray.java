class mdarray{
 public static void main(String args[])
 {
  int num[][]={{1,2,3},{4,5,6}};
  int sum=0;
  int i,j=0;
  for(int x[]:num){
    for(int y:x){
       sum=sum+y;
   }
  }
  System.out.println("summation="+sum);
 }
}