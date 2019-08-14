package lesson_1;

import java.util.Random;
import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要猜的数据：");
            int number = sc.nextInt();
            if(num>number){
                System.out.println("你猜的数据小了");
            }else if(num<number){
            System.out.println("你猜的数据大了");
            }else{
                System.out.println("恭喜你猜中了");
            }
    }
}
}
