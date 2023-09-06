class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("this is my first thread");
    }
}
class ThreadByExtends
{
    public static void main(String args[])
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread1 t=new Thread1();
        t.start();
    }
}