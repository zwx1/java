package lesson_1;
import java.util.Random;
import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数:");
        int number = sc.nextInt();

        Random random = new Random();
        int[] arr = new int[number];
        int a = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(101);
            if(arr[i]<60)
                count++;
            a += arr[i];
        }
        System.out.println("不及格人数："+count);
        System.out.println("班级平均分："+a/number);

    }
}


