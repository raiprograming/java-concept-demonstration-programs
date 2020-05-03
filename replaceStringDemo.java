class replaceStringDemo{
   public static void main(String a[]){
     String s1="shivam rai";
     StringBuffer s2=new StringBuffer("shivam rai");
     System.out.println("after replaciing i with a , s1="+s1.replace('i','a'));
     s1=s1.replace('i','a');
     System.out.println(s1);
     s2.replace(0,6,"rai");
     System.out.println("after modifying s2 with replace method ,s2= "+s2);
     }
}