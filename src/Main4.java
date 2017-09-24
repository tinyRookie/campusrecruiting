import java.util.*;

/**
 * Created by yangzhiyue on 17-9-23.
 */
public class Main4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(string);
        List<Double> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(Double.parseDouble(st.nextToken()));
        }
        double[] nums = new double[list.size()];
        int count = 0;
        for(double d : list){
            nums[count] = d;
            count++;
        }
        Arrays.sort(nums);
        double result = 0.0;
        if (count % 2 == 0){
            for(int i = 1; i < count; i+=2){
                result += nums[i];
            }
            System.out.printf("%.2f", result);
        }else{
            for(int i = count - 1; i >= 0; i-=2){
                result += nums[i];
            }
            System.out.printf("%.2f", result);
        }
    }
}
