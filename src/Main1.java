import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by yangzhiyue on 17-9-18.
 */
public class Main1 {
    static int result;
    static class MyThread implements Runnable{
        private Queue<String> queue;
        public MyThread(Queue queue){
            this.queue = queue;
        }
        @Override
        public void run() {
            synchronized (this.queue){
                String temp = queue.poll();
                if (temp.contains("u51")){
                    result ++;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new ArrayDeque<>();
       // int result = 0;
        for(int i = 0;i<3;i++){
           queue.add(scanner.nextLine());
        }
        MyThread mt = new MyThread(queue);
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(result);
    }
}
