class mythread1 extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Bmsce");
                Thread.sleep(10000);
            }
        }
        catch(Exception e){
            System.out.println("Thread 1 in interrupted");
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        try{

            while(true){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Thread 2 in interrupted");
        }
    }
}
public class lab8{
    public static void main(String[] args){
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
        t1.start();
        t2.start();
    }
}