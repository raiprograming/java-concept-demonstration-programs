class box{
    double width;
    double height;
    double depth;
    box(double w,double h,double d){
           width=w;
           height=h;
           depth=d;
    }
   public String toString(){
         return "dimensions are "+width+"by "+height+"by"+depth+" .";
   }
}
class toStringDemo{
  public static void main(String a[]){
  box b=new box(10,12,14);
  String s="box b: "+b;
  System.out.println(b);
  System.out.println(s);
 }
}