package cn.myphoenix.thread.create;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试：调用 run 方法不会创建线程，而是在 main 线程中执行 run 方法
 */
@Slf4j
public class ThreadStart {

    public static void main(String[] args) {

        // 创建线程
        Thread t = new Thread() {
            @Override
            public void run() {
                log.debug("t1 thread running");
            }
        };

        // 为线程起名
        t.setName("t1");

        // 启动线程
        t.run();

        // 主线程任务
        log.debug("main thread running");
    }
}
