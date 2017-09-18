package org.yzy.nowcoder;

/**
 * Created by yangzhiyue on 17-9-17.
 */
public class N3 {
    public double power(double base, int exponent){
        if (exponent == 0) return 1;
        double result = 1;
        int flag = exponent>0?1:-1;
        for(int i = 0; i < exponent; i++){
            result *= base;
        }
        if (flag == 1){
            return result;
        }else{
            return 1.0/result;
        }
    }
}
