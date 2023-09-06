import java.util.*;
class Mythread1 extends Thread
{
    public void run()
    {
        System.out.println("first thread");
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=scn.nextInt();
        System.out.println("enter the second number:");
        int num2=scn.nextInt();
        int c=num1+num2;
        System.out.println("sum of two number is="+c);
        System.out.println("**************************************");
    }
}
class Mythread2 extends Thread
{
    public void run()
    {
        try{
        for(int i=0;i<3;i++)
        {
            System.out.println("this is my second thread:");
            Thread.sleep(2000);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class ThreadExample1
{
    public static void main(String args[])
    {
        Mythread1 m1=new Mythread1();
        Mythread2 m2=new Mythread2();

        m1.start();
        m2.start();
    }
}