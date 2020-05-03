class metrics_addition
{
 public static void main(String args[])
 {
  int m,n;
  System.out.println("enter no of rows");
  m=Integer.parseInt(System.console().readLine());
  System.out.println("enter no of columns");
  n=Integer.parseInt(System.console().readLine());
  int m1[][]=new int[m][n];
  int m2[][]=new int[m][n];
  int m3[][]=new int[m][n];
  int i,j,k=0;
  System.out.println("enter elements of first metrics");
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.println("enter element of"+i+"th row and"+j+"th column");
    m1[i][j]=Integer.parseInt(System.console().readLine());
   }
  }
  System.out.println("enter elements of second metrics");
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.println("enter element of"+i+"th row and"+j+"th column");
    m2[i][j]=Integer.parseInt(System.console().readLine());
   }
  } 
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
    m3[i][j]=m1[i][j]+m2[i][j];
   }
  }
  System.out.println("addition of metrics is following");
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.print(m3[i][j]+" ");
   }
   System.out.println();
  }
 }
}