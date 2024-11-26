package cn.myphoenix.thread.running;

import lombok.extern.slf4j.Slf4j;

/**
 * 线程运行：查看和杀死线程
 */
@Slf4j
public class ThreadRunning1 {

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
            }
        }, "t1").start();

        new Thread(() -> {
           while (true) {
               try {
                   Thread.sleep(500);
               } catch (Exception e) {}
           }
        }, "t2").start();
    }
}
