import java.io.*;
class stringDemo{
    public static void main(String a[]) throws IOException{
          int len;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter no of items for sorting");
          len=Integer.parseInt(br.readLine());
          String s1[]= new String[len];
          for(int i=0;i<len;i++){
              System.out.println("enter string at "+i);
              s1[i]=br.readLine();
          }
          String temp;
           for(int k=0;k<(len-1);k++){
            for(int i=0;i<(len-1);i++){ 
             for(int j=0;j<s1[i].length();j++){
                  if(s1[i].charAt(j)>s1[i+1].charAt(j)) {
                      temp=s1[i];
                      s1[i]=s1[i+1];
                      s1[i+1]=temp;
                      break;
                     }
                  else if(s1[i].charAt(j)==s1[i+1].charAt(j)) ;
                  else {
                      break;
                     }
              }
            }
           }
         System.out.println("your sorted string are following");
         for(int i=0;i<len;i++){
              System.out.print(s1[i]+"     ");
           }
  }
}