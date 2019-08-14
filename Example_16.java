package lesson_1;

import java.util.Scanner;

public class Example_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = new int[10];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=0;i<10;i++){
            System.out.println("请输入数字:");
            int number = sc.nextInt();
            arr[i] = number;
            if (arr[i] == 1){
                count += 1;
            }else if (arr[i]==2){
                count1 += 1;
            }else if (arr[i]==3){
                count2 += 1;
            }else{
                count3 += 1;

            }
        }
        System.out.println("数字1的个数为"+count);
        System.out.println("数字2的个数为"+count1);
        System.out.println("数字3的个数为"+count2);
        System.out.println("非法数字个数为"+count3);

//        for (int i:arr){
//            System.out.println(i);
//        }
    }

}
