package org.yzy.nowcoder;

import java.util.Arrays;

/**
 * Created by yangzhiyue on 17-9-18.
 */
public class N6 {
    public boolean VerifySequenceOfBST(int[] sequence){
        if(sequence == null || sequence.length == 0) return true;
        System.out.println(Arrays.toString(sequence));
        int length = sequence.length;
        int root = sequence[length - 1];
        int index = -1;
        for(int i = 0; i < length; i++){
            if (sequence[i] < root && i != length - 1 && sequence[i+1] >= root){
                index = i;
            }
        }
        //System.out.println(index);
        for(int j = index + 1; j < length;j++){
            if (sequence[j] < root) return false;
        }
        for(int j = 0; j<=index;j++){
            if (sequence[j] > root) return false;
        }
        int[] left = Arrays.copyOfRange(sequence, 0, index+1);
        int[] right = Arrays.copyOfRange(sequence, index+1, length-1);
        return VerifySequenceOfBST(left) && VerifySequenceOfBST(right);
    }
    public static void main(String args[]){
        int sequence[] = {7,4,6,5};
        boolean result = new N6().VerifySequenceOfBST(sequence);
        System.out.println(result);
    }
}
