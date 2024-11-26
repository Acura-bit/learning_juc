package cn.myphoenix.thread.running;

import lombok.extern.slf4j.Slf4j;

/**
 * 此包主要演示：
 * (1) 查看和杀死进程的方法(03.006 ~ 03.009)
 * (2) 线程运行的原理(03.010 ~ 03.013)，即栈帧
 * 两个线程交替执行
 */
@Slf4j
public class ThreadRunning {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log.debug("I'm running!");
                }
            }
        }, "t1").start();

        new Thread(() -> {
           while (true) {
               log.debug("I'm walking!");
           }
        }, "t2").start();
    }
}
