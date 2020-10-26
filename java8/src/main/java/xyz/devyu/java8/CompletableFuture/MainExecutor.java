package xyz.devyu.java8.CompletableFuture;

import java.util.concurrent.*;

public class MainExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread : " + Thread.currentThread().getName());
            }
        });

        // graceful shutdown : 해당 스레드가 마지막까지 동작한 뒤 셧다운
//        executorService.shutdown();

        // Forced shutdown : 스레드를 바로 셧다운
//        executorService.shutdownNow();

        // Callable : 반환 값이 있는 Runnable
        Callable<String> stringCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "null";
            }
        };

        Future<String> submit = executorService.submit(stringCallable);
        System.out.println(submit.isDone());
        System.out.println("Started!");

        submit.get(); // 블록킹

        System.out.println(submit.isDone());
        System.out.println("End!");
    }
}
