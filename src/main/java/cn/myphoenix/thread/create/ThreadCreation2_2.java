package cn.myphoenix.thread.create;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建线程方法二：使用 Runnable 配合 Thread，直接在 Thread 构造方法中使用 Lambda 表达式
 */
@Slf4j
public class ThreadCreation2_2 {

    public static void main(String[] args) {

        // 直接在 Thread 构造方法中使用 Lambda 表达式
        Thread t = new Thread(() -> { log.debug("keep running, larry");}, "t1");

        // 启动线程
        t.start();
    }

}
