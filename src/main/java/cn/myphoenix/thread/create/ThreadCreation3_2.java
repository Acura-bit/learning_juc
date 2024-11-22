package cn.myphoenix.thread.create;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程方法三：实现 Callable 接口，使用 Lambda 表达式简化
 */
@Slf4j
public class ThreadCreation3_2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {


        // 使用 Callable 接口的匿名内部类对象为 FutureTask 构造器提供参数
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            log.debug("Who is the best?");
            return "larry";
        });

        // 创建线程并启动线程
        Thread t1 = new Thread(futureTask, "t1");
        t1.start();

        t1.sleep(5000);

        log.debug("main 线程获得 t1 线程的值：{}", futureTask.get());
    }

}
