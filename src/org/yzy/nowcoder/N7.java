package org.yzy.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yangzhiyue on 17-9-18.
 */
public class N7 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k){
        Arrays.sort(input);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < k; i++){
            result.add(input[i]);
        }
        int 你好  = 1;
        System.out.println(你好);
        return result;
    }
}
