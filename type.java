class typetest{
 public static void main(String args[]){
  byte a=1,b=2;
  char c=1,d='b';
  short e=3,f=4;
  int g=5,h=6;
  float i;
  double k=10.34,l=12.45;
  System.out.println("value of char variable c="+c);
  // if we assign an integer value in char cariable it's possible as above
  /* but it's not possible to assign int value from an int variable in char variable (d=g assignment gives error as incompatible type conversion) */;
  g=b;
  System.out.println("char to int conversion is possible");
  k=g;
  System.out.println("int to double conversion is possible");
  i=h;
  System.out.println("int to float is possible and value of i = "+i);
  l=i;
  System.out.println("float to double is possible");
  }
}
  