import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by yangzhiyue on 17-9-23.
 */
public class Main3 {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[50];
        String string = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(string, "-");
        int count = 0;
        while(st.hasMoreTokens()){
            nums[count] = Integer.parseInt(st.nextToken());
            count ++;
        }
        int[] records = new int[51];
        for(int i = 0; i < count ; i++){
            records[nums[i]] += 1;
        }
        while(true){
            int sum = 0;
            for(int i = 0; i < 51; i++){
                sum += records[i];
            }
            if (sum == 0) break;
            int max = 0;
            for(int i = 0; i < 51; i++){
                if (max < records[i]) max = records[i];
            }
            int max1 = 0;
            for(int i = 0; i < 51; i++){
                //int max1 = 0;
                if (max == records[i] && max!=0){
                    if (max1 < i) max1 = i;
                    /*System.out.print(i + "-" + records[i] + " ");
                    records[i] = 0;*/
                }
            }
            for(int i = 0; i < 51;i++){
                if (max == records[i] && max!=0 && max1 == i){
                    //if (max1 < i) max1 = i;
                    sb.append(i + "-" + records[i] + " ");
                    //System.out.print(i + "-" + records[i] + " ");
                    records[i] = 0;
                }
            }
        }
        System.out.println(sb.toString().substring(0, sb.toString().length() - 1));
    }
}
