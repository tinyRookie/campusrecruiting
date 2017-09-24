package com.huawei.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yangzhiyue on 17-9-24.
 */
class MyService {
    Map<String, String> map = new HashMap<String, String>();
}

class ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        for(int i = 0 ;i < 10000; i++){
            myService.map.put("ThreadA " + (i+1), "ThreadA " + (i+1));
            //System.out.println("ThreadA " + (i+1));
        }
    }
}

class ThreadB extends Thread{
    private MyService myService;
    public ThreadB(MyService myService){
        this.myService = myService;
    }
    public void run(){
        for(int i = 0 ;i < 10000; i++){
            myService.map.put("ThreadB " + (i+1), "ThreadB " + (i+1));
            //System.out.println("ThreadB " + (i+1));
        }
    }
}



public class HashMapThreadTest {
    public static void main(String args[]){
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        ThreadB b =  new ThreadB(myService);
        a.start();
        b.start();
        Set<String> set = new HashSet<String>();
        for(String string : myService.map.keySet()){
            if (set.contains(string)){
                System.out.println("fuck");
            }else{
                set.add(string);
            }
        }
    }
}
