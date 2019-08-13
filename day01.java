import java.util.*;
class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入一个整数：");
       
        int number = sc.nextInt(); //获取用户输入的整数
        String check = (number % 2 == 0)? "这个数是偶数":"这个数是奇数";
        System.out.println(check);
    }
}


class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入学生的成绩：");
       
        Long number = sc.nextLong(); //获取用户输入的整数
        String check = (number > 60)? "及格":"不及格";
        System.out.println(check);
    }
}

class Example3 {
    public static void main(String[] args) {
        int a = 123;
        int b = (a / 100);
        System.out.println("它的百位是"+b);
        int c = (a % 10)%10;
        System.out.println("它的个位是"+c);
        int d = (a / 10) % 10;
        System.out.println("它的十位是"+d);
    }
}

class Example4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入长方形的长：");
        int x=sc.nextInt();
        Scanner sc1 = new Scanner(System.in); 
        System.out.println("请输入长方形的宽：");
        int y=sc1.nextInt();
        int a = x * y;
        System.out.println("面积是"+a); 
        int b = (x + y) * 2;
        System.out.println("周长是"+b);;
    }
}

class Example5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入小明左手中的纸牌：");
        int a = sc.nextInt();
        System.out.println("请输入小明左手中的纸牌：");
        int b = sc.nextInt();
        int temp = 0;
        if(a>b){
            System.out.println("小明右手中的纸牌"+a+"右手中的纸牌"+b);
        }else{
            temp=a;
            a=b;
            b=temp;
            System.out.println("小明右手中的纸牌"+a+"左手中的纸牌"+b);
        }
        
    }
}

class Example6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入学生的成绩：");
        int number = sc.nextInt();
        if(90<number & number<100){
            System.out.println("优秀");
        }else if(number>80 & number<90){
            System.out.println("好");
        }else if(number>70 & number<80){
            System.out.println("好");
        }else if(number>60 & number<70){
            System.out.println("好");
        }else{
            System.out.println("不及格");
        }

    }
}

class Example7{
    public static void main(String[] args) {
		SwapWithoutTemp swt = new SwapWithoutTemp();
		swt.a = 100;
		swt.b = 200;
		System.out.println("Before swap,a=" + swt.a + ",b=" + swt.b);
		// swt.swap1();
		swt.swap2();
		System.out.println("After swap,a=" + swt.a + ",b=" + swt.b);
	}
}


class Example8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入Java的成绩：");
        int number = sc.nextInt();
        System.out.println(number);
        System.out.println("请输入sql的成绩：");
        int number2 = sc.nextInt();
        System.out.println(number2);
        System.out.println("请输入Web的成绩：");
        int number3 = sc.nextInt();
        System.out.println(number3);

        int a = number - number2;
        System.out.println("他们的差值是"+a);
        int b = (number + number2 + number3) / 3;
        System.out.println("他们的平均值为"+b);
    }
}

class Example9 {
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的4位会员卡号:");
        int number = sc.nextInt(); 
        int a = number/1000; //获取千位
        int b = number%1000/100; //获取百位
        int c = number%100/10; //获取十位
        int d = number%10; //获取个位
        int e = a+b+c+d;
        if(e>20){
        System.out.println("会员卡号之和为"+e);
        System.out.println("恭喜中奖!您是幸运客户");
        }else{
        System.out.println("会员卡号之和为"+e);
        System.out.println("不是幸运客户");
        }
    }
    }

class Example10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工工龄:");
        int x = sc.nextInt();
        System.out.println("请输入基本工资:");
        int y = sc.nextInt();
        if(x>=10&&x<15){
        System.out.println("您目前工作了"+x+"年，基本工资为"+y+"元, 应涨工资 5000元,涨后工资"+(y+5000)+"元");
        }else if(x>=5&&x<=10){

        System.out.println("您目前工作了"+x+"年，基本工资为"+y+"元, 应涨工资2500元,涨后工资"+(y+2500)+"元");
        }else if(x>=3&&x<=5) {

        System.out.println("您目前工作了"+x+"年，基本工资为"+y+"元, 应涨工资1000元,涨后工资"+(y+1000)+"元");
        }else if(x>=1&&x<=3){

        System.out.println("您目前工作了"+x+"年，基本工资为"+y+"元, 应涨工资500元,涨后工资"+(y+500)+"元");
        }else{
        System.out.println("您目前工作了"+x+"年，基本工资为"+y+"元, 应涨工资200元,涨后工资"+(y+200)+"元");
        }
    }
}

class Example11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int c = sc.nextInt();
        if(c == 0){
            System.out.println(a+b);
        }else if(c == 1){
            System.out.println(a - b);
        }else if(c == 2){
            System.out.println(a * b);
        }else{
            System.out.println(a / b);
        }
    }
}

class Example12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x:");
        int x = sc.nextInt();
        if(x<0){
            int y = -1;
            System.out.println("x="+x+",y="+y);
        }
        else if(x = 0){
            int y=0;
            System.out.println("x="+x+",y="+y);
        }else{
            int y = 1;
            System.out.println("x="+x+",y="+y);
        }
    }
}

class Example13{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入a的值：");
		int a=s.nextInt();
		System.out.println("请输入b的值：");
		int b=s.nextInt();
		System.out.println("请输入c的值：");
		int c=s.nextInt();
		int x=0;
		if(a>b){
			x=a;
			a=b;
			b=x;
		}
		else if(a>c){
			x=a;
			a=c;
			c=x;
		}
		else if(b>c){
			x=b;
			b=c;
			c=x;
		}
		System.out.println(a+","+b+","+c);
    }
  }

  class Example15{
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份：");
        int a=sc.nextInt();
        if(a ==3 || a == 4 ||a == 5){
            System.out.println("春季");
        }else if(a ==6 || a == 7 ||a == 8){
            System.out.println("夏季");
        }else{
            System.out.println("冬季");
        }
      }
  }

