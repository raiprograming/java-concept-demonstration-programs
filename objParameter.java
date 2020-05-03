class area{
     void cal(Box b1){
            System.out.println("area ="+(b1.width*b1.height*b1.depth));
      }
  }
class objParameter{
    public static void main(String a[]){
             Box b=new Box();
             b.width=10;
             b.height=10;
             b.depth=10;
             area a1=new area();
             a1.cal(b);
         }
}
            
      
