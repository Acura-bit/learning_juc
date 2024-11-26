package cn.myphoenix.thread.running;

/**
 * Java 虚拟机栈与栈帧：每个栈由多个栈帧组成，每个栈帧对应一个方法运行时的占内存
 */
public class StackFrame {
    public static void main(String[] args) {
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
