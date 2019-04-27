import java.util.*;
class Demo2{
  public static void main(String[] args){
    //扫描仪对象 用来接受控制台输入的
    //要使用扫描仪，需要把Java命令的动作关闭  来使用命令行输入内容
    Scanner sc=new Scanner(System.in);
    //给出提示
    System.out.println("input x value:");
    //接受输入的第一个值
    int x=sc.nextInt();
    System.out.println("input y value:");
    int y=sc.nextInt();
    System.out.println("input z value:");
    int z=sc.nextInt();
    //通过三目运算符进行判断
    int max1=(x>y & x>z)?x:(y>x & y>z)?y:z;
    System.out.print("input max number is:"+max1);
    //System.out.println(max1);
  }
}