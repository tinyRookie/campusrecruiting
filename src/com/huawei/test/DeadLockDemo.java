package com.huawei.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangzhiyue on 17-9-24.
 */
public class DeadLockDemo {
    private static String A = "A";
    private static String B = "B";
    public static void main(String args[]){
        new DeadLockDemo().deadLock();
    }
    private void deadLock(){



        //t2.start();
    }

}
