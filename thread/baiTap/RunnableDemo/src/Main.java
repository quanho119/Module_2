public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is running... ");
        RunnableDemo runnableDemo=new RunnableDemo("Thread1");
        runnableDemo.start();
        RunnableDemo runnableDemo2=new RunnableDemo("Thread2");
        runnableDemo2.start();
        System.out.println("Main thread is stopped ");
    }
}