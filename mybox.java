class Box{
  double width;
  double height;
  double depth;
}
class mybox{
   public static void main(String args[]){
   Box mybox=new Box();
   mybox.width=100;
   mybox.height=100;
   mybox.depth=100;
   double vol;
   vol=mybox.width*mybox.height*mybox.depth;
   System.out.println("volume= "+vol);
   }
}