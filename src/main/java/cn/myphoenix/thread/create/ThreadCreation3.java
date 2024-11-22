package cn.myphoenix.thread.create;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程方法三：实现 Callable 接口
 */
@Slf4j
public class ThreadCreation3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        log.debug("Who is the best?");
        return "larry";
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 创建 Callable 接口实现类对象
        ThreadCreation3 myCallable = new ThreadCreation3();

        // 使用 myCallable 创建 FutureTask 对象
        FutureTask<String> futureTask = new FutureTask<>(myCallable);

        // 创建线程并启动线程
        Thread t1 = new Thread(futureTask, "t1");
        t1.start();

        t1.sleep(5000);

        log.debug("main 线程获得 t1 线程的值：{}", futureTask.get());
    }

}
