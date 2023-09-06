import java.util.*;
class demo{
    public static void main(String args[])
    {
    System.out.println("before");
    String s=Thread.currentThread().getName();
    System.out.println("current thread is:"+s);
    System.out.println(Thread.currentThread().getPriority());
    System.out.println("*********************************");
    System.out.println("creating own thread and after that the result will be");
    Thread t=Thread.currentThread();
    t.setName("mythread");
    t.setPriority(1);
    String s1=t.currentThread().getName();
    System.out.println("current thread is:"+s1);
    System.out.println(t.currentThread().getPriority());

    }
}