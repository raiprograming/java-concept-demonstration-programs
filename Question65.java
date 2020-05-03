class Question65 extends Thread{
 public void run(){
  System.out.println("thread is running");
  notifyAll();
 }
public static void main(String a[]) throws InterruptedException {
 Question65 t=new Question65();
 System.out.println("name of thread ="+t.getName());
 t.setName("NPTEL");
 t.start();
 Thread.currentThread().wait();
 System.out.println("new name="+t.getName());
}
}