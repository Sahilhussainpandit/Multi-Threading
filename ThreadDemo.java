public class ThreadDemo
{
 public static void main(String ar[])
{
  new A().start();
  new B().start();
  new C().start();
}

}
 class A extends Thread
{
 public void run()
{
 for(int i=1;i<=50;i++)
 {
   System.out.println("i="+i);
 }
 }
}
class B extends Thread
{
 public void run()
 {
  for(int j=1;j<=50;j++)
  {
    System.out.println("j="+j);
  }
  } 
}
class C extends Thread
{
 public void run()
 {
  for(int k=1;k<=50;k++)
  {
   System.out.println("k="+k);
  }
  }
}
