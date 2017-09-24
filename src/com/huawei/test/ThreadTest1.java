package com.huawei.test;

/**
 * Created by yangzhiyue on 17-9-24.
 */


public class ThreadTest1 {
    private static final long count =  10000000000l;
    public static void main(String args[])throws Exception{
        concurrency();
        serial();
    }
    static void concurrency() throws InterruptedException{
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                long a = 0;
                for(long i = 0; i < count;i ++){
                    a += 5;
                }
            }
        });
        thread.start();
        long b = 0;
        for(long i = 0; i< count; i++){
            b --;
        }
        long time = System.currentTimeMillis();
        thread.join();
        System.out.println("con :  " + (time - start));
    }
    static void serial() throws InterruptedException{
        long start = System.currentTimeMillis();
        long a = 0;
        for(long i = 0; i < count;i ++){
            a += 5;
        }
        long b = 0;
        for(long i = 0; i< count; i++){
            b --;
        }
        long time = System.currentTimeMillis();
        //thread.join();
        System.out.println("seraial : " + (time - start));
    }
}
