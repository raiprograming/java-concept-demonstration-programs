class box{
   double width;
   double depth;
   double height;
  //constructor for box class
   box(double w,double h,double d){
    width=w;
    height=h;
    depth=d;
  }
  double volume(){
    return width*height*depth;
   }
   static void main(String args[]){
      box b1=new box(5,4,3);
      box b2=new box(4,4,4);
      double v1,v2;
      v1=b1.volume();
      v2=b2.volume();
      System.out.println(v1);
      System.out.println(v2);
     }
  }