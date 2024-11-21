package cn.myphoenix.thread.create;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建线程方法二：使用 Runnable 配合 Thread，使用 Lambda 精简代码
 */
@Slf4j
public class ThreadCreation2_1 {

    public static void main(String[] args) {

        // 使用 Lambda 代替 Runnable 接口的匿名内部类
        Runnable r = () -> { log.debug("keep running, larry");};

        // 使用 Runnable 接口匿名实现类的对象创建线程
        Thread t = new Thread(r, "t1");

        // 启动线程
        t.start();
    }

}
