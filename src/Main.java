import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuffer sb = new StringBuffer();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(int i = 0; i<string.length();i++){
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' || string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                list1.add(string.charAt(i));
            }else{
                list2.add(string.charAt(i));
            }
        }
        char[] chars = new char[list1.size()];
        for(int i =0 ;i< chars.length;i++){
            chars[i] = list1.get(i);
        }
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        int i = 0;
        for(i =0; i < chars.length;i++){
            char temp = chars[i];
            for(int j = i+1; j < chars.length;j++){
                if (chars[j] - temp <= 'a' - 'A' && chars[j] != '/' && (chars[j] >= 'a' && chars[j] <= 'z')){
                    sb.append(chars[j]);
                    chars[j] = '/';
                }
            }
            if (chars[i] != '/' ) sb.append(chars[i]);
            if(chars[i] == '/') break;
        }
        for(;i<chars.length;i++){
            if (chars[i] != '/') sb.append(chars[i]);
        }
        for(char c : list2){
            sb.append(c);
        }
        System.out.println(sb);
    }
}