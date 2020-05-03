import java.util.*;
public class hash1
{
 public static void main(String a[])
  {
    Map<Integer,String> m=new HashMap<Integer,String>();
   m.put(1,"rai");
   m.put(2,"urja");
   System.out.println(m);
  m.remove(2);
  System.out.println(m);
}
}