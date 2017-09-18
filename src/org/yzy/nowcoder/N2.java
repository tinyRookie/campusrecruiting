package org.yzy.nowcoder;

/**
 * Created by yangzhiyue on 17-9-17.
 */
public class N2 {
    public int NumberOf1(int n){
        int result = 0;
        while(n != 0){

            if ((n & 0x00000001) == 1) result ++;
            n = n>>>1;
        }
        return result;
    }
    public int NumberOf11(int n){
        int sum = 0;
        while(n != 0){
            n = n & (n-1);
            sum ++;
        }
        return sum;
    }
    public static void main(String args[]){
        int n = -100;
        int result = new N2().NumberOf1(n);
        System.out.println(result);
        result = new N2().NumberOf11(n);
        System.out.println(result);
    }
}
