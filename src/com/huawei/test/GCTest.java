package com.huawei.test;

/**
 * Created by yangzhiyue on 17-9-21.
 */
class A1{
    A1 instance = null;
    public A1(){

    }
    @Override
    protected void finalize()throws Throwable{
        super.finalize();
        System.out.println("finalize");
    }
}
public class GCTest {

     public static void test(Object... args){
         for(Object o : args){
             System.out.println(o);
         }
     }
    /*public static void test(Integer args){
        System.out.println("world");
    }*/
    /*public static void test(int args){
        System.out.println("hello");
    }*/
    public static void main(String args[]){
       test(3);
    }
}
