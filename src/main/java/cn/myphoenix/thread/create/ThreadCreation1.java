package cn.myphoenix.thread.create;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建线程方法一：Thread 对象
 */
@Slf4j
public class ThreadCreation1 {

    public static void main(String[] args) {

        // 创建线程
        Thread t = new Thread() {
            @Override
            public void run() {
                log.debug("running");
            }
        };

        // 为线程起名
        t.setName("t1");

        // 启动线程
        t.start();

        // 主线程任务
        log.debug("running");
    }
}
