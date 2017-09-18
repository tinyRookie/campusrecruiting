import java.util.*;


public class Main {
    class Point{
        int dp_value;
        int sum_temp;
        public Point(){
            this.dp_value = 0;
            this.sum_temp = 0;
        }
    }
    public  int LCS(int n, int[] numbers) {
        int length = numbers.length;
        int[] numbers1 = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            numbers1[i] = numbers[length - 1 - i];
        }
        Point[][] dp = new Point[numbers.length + 1][numbers.length + 1];
        for(int i = 0;i<=length;i++){
            for(int j = 0; j <= length; j++){
                dp[i][j] = new Point();
            }
        }
        int result = 0;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (numbers[i - 1] == numbers1[j - 1]) {
                    dp[i][j].dp_value = dp[i-1][j-1].dp_value;
                    dp[i][j].sum_temp = dp[i-1][j-1].sum_temp + numbers[i-1];
                    if (result < dp[i][j].sum_temp) result = dp[i][j].sum_temp;
                } else {
                    dp[i][j].dp_value = Math.max(dp[i-1][j].dp_value, dp[i][j-1].dp_value);
                    dp[i][j].sum_temp = Math.max(Math.max(Math.max(numbers[i-1], numbers[j-1]),dp[i-1][j].sum_temp),dp[i][j-1].sum_temp);
                    if (result < dp[i][j].sum_temp) result = dp[i][j].sum_temp;
                }
            }
        }
        //System.out.println(result);
        return result;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }
        int sum_max = new Main().LCS(n, numbers);
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        System.out.println(sum * 2 - sum_max);
       // System.out.println(length);
    }
}
