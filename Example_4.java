package lesson_1;
import java.util.Scanner;

public class Example_4{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个整数:");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("新建");
                    break;
                case 2:
                    System.out.println("打开文件");
                    break;
                case 3:
                    System.out.println("保存");
                    break;
                case 4:
                    System.out.println("刷新");
                    break;
                case 5:
                    System.out.println("退出");
                    System.exit(0);
                    break;

            }

        }

    }
}
