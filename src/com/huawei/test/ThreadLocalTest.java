package com.huawei.test;

import java.util.Random;

/**
 * Created by yangzhiyue on 17-9-24.
 */

class MyThread implements  Runnable{
    @Override
    public void run() {

    }

    public synchronized void test1(){

    }

    //public


}

public class ThreadLocalTest {
    static class MyRunnable implements Runnable{
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        @Override
        public void run() {
            threadLocal.set(new Random().nextInt(10));
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + " " + threadLocal.get());
        }
        public static void main(String args[]){
            System.out.println("Start ");
            MyRunnable myRunnable = new MyRunnable();
            Thread t1 = new Thread(myRunnable);
            Thread t2 = new Thread(myRunnable);
            t1.start();
            t2.start();
        }
    }
}
