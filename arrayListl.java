import java.util.ArrayList;
public class arrayListl 
{ 
  public static void main(String a[])
  {
    ArrayList <String> al=new ArrayList<String>();
    al.add("hello");
    al.add("to");
     al.add("java");
    System.out.println(al);
   al.remove("java");
    System.out.println(al);
  }
}