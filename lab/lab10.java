class SharedResource {
    synchronized void method1(SharedResource other) {
        System.out.println(Thread.currentThread().getName() + " is executing method1");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " is trying to call method2 on other resource");
        other.method2(this);
    }

    synchronized void method2(SharedResource other) {
        System.out.println(Thread.currentThread().getName() + " is executing method2");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " is trying to call method1 on other resource");
        other.method1(this);
    }
}

class DeadlockDemo {
    public static void main(String[] args) {
        SharedResource res1 = new SharedResource();
        SharedResource res2 = new SharedResource();

        Thread t1 = new Thread(() -> res1.method1(res2), "Thread-1");
        Thread t2 = new Thread(() -> res2.method1(res1), "Thread-2");

        t1.start();
        t2.start();
    }
}
