package org.yzy.nowcoder;

import java.util.Stack;

/**
 * Created by yangzhiyue on 17-9-17.
 */
public class N1 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int result = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return result;
    }

    public static void main(String args[]){
        N1 n1 = new N1();
        n1.push(3);
        n1.push(4);
        System.out.println(n1.pop());
        n1.push(5);
        System.out.println(n1.pop());
        n1.push(6);
        System.out.println(n1.pop());
    }

}
