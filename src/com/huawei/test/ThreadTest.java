package com.huawei.test;

import java.util.concurrent.*;

/**
 * Created by yangzhiyue on 17-9-23.
 */

class MyCallable implements Callable<String>{
    private int age;
    public MyCallable(int age){
        super();
        this.age = age;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "age is " + this.age;
    }
}


public class ThreadTest {
    public static void main(String args[]){
        try{
            MyCallable myCallable = new MyCallable(10);
            ThreadPoolExecutor executor= new ThreadPoolExecutor(2,3,5L,
                    TimeUnit.SECONDS, new LinkedBlockingDeque<>());
            Future<String> future = executor.submit(myCallable);
            System.out.println("main A : " + System.currentTimeMillis());
            System.out.println(future.get());
            System.out.println("main B : " + System.currentTimeMillis());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
