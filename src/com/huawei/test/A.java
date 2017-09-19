package com.huawei.test;

/**
 * Created by yangzhiyue on 17-9-19.
 */
class B{
    public B(){
        System.out.println("B()");
    }
}

class C extends B{
    /*public C(){
        System.out.println("C()");
    }*/
    public static int result  = 0;
    public C(int x){
        result ++;
    }
}

class D extends C{
    public D(int x){
        super(x);
        System.out.println("D()");
        System.out.println(result);
    }
}

public class A {
    public static void main(String args[]){
        D d = new D(20);
        System.out.println(C.result);
    }
}
