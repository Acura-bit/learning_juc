package cn.myphoenix.thread.create;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建线程方法二：使用 Runnable 配合 Thread
 */
@Slf4j
public class ThreadCreation2 {

    public static void main(String[] args) {

        Runnable r = new Runnable(){

            @Override
            public void run() {
                log.debug("keep running, larry");
            }
        };

        // 使用 Runnable 接口匿名实现类的对象创建线程
        Thread t = new Thread(r, "t1");

        // 启动线程
        t.start();
    }

}
