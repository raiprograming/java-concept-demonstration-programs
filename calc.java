import java.awt.*;
import java.awt.event.*;
public class calc implements ActionListener
{
 String s,s1,s2,s3,s4;
  int a,b,c;
 TextField t1;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,eq;
 Frame f;
 public calc()
 {
  a=0;b=0;c=0;
  t1=new TextField();
  b1=new Button("1");
  b2=new Button("2");b3=new Button("3");b4=new Button("4");b5=new Button("5");b6=new Button("6");b7=new Button("7");b8=new Button("8");b9=new Button("9");
  b0=new Button("0");add=new Button("+");sub=new Button("-");mul=new Button("*");div=new Button("/");eq=new Button("=");
  f=new Frame();
  b1.addActionListener(this);
  b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);
  b8.addActionListener(this);b9.addActionListener(this);b0.addActionListener(this);add.addActionListener(this);sub.addActionListener(this);
  mul.addActionListener(this);div.addActionListener(this);eq.addActionListener(this);
  f.add(t1);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b0);f.add(add);f.add(sub);f.add(mul);f.add(div);f.add(eq);
  f.setLayout(new GridLayout(4,4));
  f.setSize(400,400);
 f.setVisible(true);
 }
 public void actionPerformed(ActionEvent ae)
 {
  s=ae.getActionCommand();
   
  if(s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("0") || s.equals("1") )
  {
    s1=t1.getText();
    t1.setText(s1+s);
   }
 if(s.equals("+"))
 {
  s2=t1.getText();
  t1.setText("");
  s3="+";
 }
 if(s.equals("-"))
 {
  s2=t1.getText();
  t1.setText("");
  s3="-";
 }
 if(s.equals("*"))
 {
  s2=t1.getText();
  t1.setText("");
  s3="*";
 }
 if(s.equals("/"))
{
 s2=t1.getText();
  t1.setText("");
  s3="/";
}
if(s.equals("="))
 {
   s4=t1.getText();
    a=Integer.parseInt(s2);
    b=Integer.parseInt(s4);
   if(s3.equals("+"))
   {
     c=a+b;
   }
   if(s3.equals("-"))
  {
   c=a-b;
  }
 if (s3.equals("*"))
 {
  c=a*b;
 }
 if(s3.equals("/"))
 {
   c=a/b;
  }
 t1.setText(String.valueOf(c));
 }
}
public static void main(String arg[])
 {
   calc c1=new calc();
  }
}
   
   