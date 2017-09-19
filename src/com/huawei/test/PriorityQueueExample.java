package com.huawei.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by yangzhiyue on 17-9-19.
 */
public class PriorityQueueExample {
    public static void main(String args[]){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(2);
        queue.add(1);
        queue.add(50);
        queue.add(4);
        while(!queue.isEmpty()){
            System.out.print(queue.poll() + ", ");
        }
        System.out.println();
        System.out.println("--------------------------");
        Comparator cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        Queue<Integer> q2 = new PriorityQueue<>(5,cmp);
        q2.add(2);
        q2.add(8);
        q2.add(10);
        q2.add(1);
        while(!q2.isEmpty()){
            System.out.print(q2.poll() + ", ");
        }
        System.out.println();
    }
}
