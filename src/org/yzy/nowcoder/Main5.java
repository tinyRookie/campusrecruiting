package org.yzy.nowcoder;

import java.util.*;

/**
 * Created by yangzhiyue on 17-9-23.
 */
public class Main5 {
    private static int result = 0;
    static void solve(int W, int k, int[] p, int[] c){
        if ( k == 0){
            System.out.println(result);
            return;
        }
        int max = 0;
        int index = -1;
        for(int i = 0; i<c.length;i++){
            if(c[i] <= W){
                if (max < p[i]) {
                    max = p[i];
                    index = i;
                }
            }
        }
        if (index != -1){
            p[index] = 0;
            result += (long)max;
            //W -= c[index];
            W += max;
            k --;
            solve(W, k, p, c);
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int W = Integer.parseInt(scanner.nextLine());
        String p = scanner.nextLine();
        String c = scanner.nextLine();
        StringTokenizer st1 = new StringTokenizer(p);
        StringTokenizer st2 = new StringTokenizer(c);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while(st1.hasMoreTokens()){
            list1.add(Integer.parseInt(st1.nextToken()));
            list2.add(Integer.parseInt(st2.nextToken()));
        }
        int[] profits = new int[list1.size()];
        int[] capitals = new int[list1.size()];
        for(int i = 0 ; i < list1.size(); i++){
            profits[i] = list1.get(i);
            capitals[i] = list2.get(i);
        }
        solve(W, k, profits, capitals);
    }
}
