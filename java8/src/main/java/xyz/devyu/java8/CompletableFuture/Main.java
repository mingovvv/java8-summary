package xyz.devyu.java8.CompletableFuture;

import lombok.SneakyThrows;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 1. 쓰레드 생성 방법(쓰레드 상속방법)
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("기본 방식 : " + Thread.currentThread().getName());

        // 2. 쓰레드 생성
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) { // InterruptedException : Thread.sleep 동안에 Thread
                    System.out.println("interrupt Thread...");
                    e.printStackTrace();
                }
                System.out.println("[익명Class] 방식 : " + Thread.currentThread().getName());
            }
        });
        thread2.start();

        // 3. 쓰레드 생성(Java 8)
        Thread thread3 = new Thread(() -> System.out.println("[람다식] 방식 : " + Thread.currentThread().getName()));
        thread3.start();

//        thread2.interrupt(); // Thread 깨우는 메소드
        thread2.join(); // Thread 기다리기
        System.out.println("join(); 메소드를 기다렸다가 실행된다. ㅎㅎ");
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("[Thread상속] 방식: " + Thread.currentThread().getName());
        }
    }
}
