package cn.myphoenix.thread.running;

/**
 * Java 虚拟机栈与栈帧：线程间的栈内存是相互独立的，每个线程有自己独立的栈内存，每个栈有多个栈帧
 */
public class StackFrame1 {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                method1(20);
            }
        };
        t1.setName("t1");
        t1.start();

        method1(10);
    }

    private static void method1(int x) {
        int y = x + 1;
        Object m = method2();
        System.out.println(m);
    }

    private static Object method2() {
        Object n = new Object();
        return n;
    }
}
