//输出5个hello world
class Hello{
    public static void sayHello(){//void表示定义的这个没有返回值，不需要return
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    //定义方法，加减法运算
    public static int yunsuan(int x,int y){
        System.out.println("此运算执行");
        return x+y;
    }

    //选出x,y,z中最大的数
    public static int max(int x,int y,int z){
        if(x>y & x>z){
            return x;
        }else if(y>z){
            return y;
        }else{
            return z;
        }
        }
    public static void main(String[] hhh) {//hhh那个位置可以换任意的名字
        //调用没有参数和返回值的函数
        //sayHello();
        //调用加减法运算的函数yusuan
        int i = yunsuan(3, 5);
        System.out.println(i);
        //调用x,y,z中最大的函数
        int a = max(5, 3, 9);
        System.out.println(a);
    }

}

//方法的重载
//重复加载  可以使用同一个方法名来调用，java会根据你给的参数类型的不同来自动调用该方法
/*要达到方法的重载是什么？
  1.跟访问修饰符没有关系
  2.跟返回值类型没有关系
  3.方法名一定要相同
  4.参数列表中（参数个数不同/参数类型不同），不能出现参数个数和参数类型都相同的方法 并且方法名也相同
    参数名：没有关系  需要注意的是同一个方法中 参数名不能重复
//形参和实参  形式参数和实际参数
*/

class chongzai{
    public static int add(int x,int y){
        return x+y;
    }
    public static void add(boolean x,int y){
        System.out.println("hahaha");
    }
    public static int add(int x, int y,int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        add(true, 3);
        //System.out.println(a);
    }
}
 //方法的重载
class ADD{
    public static int aa(int x,int y){
        return x-y;
        }
        public static Double aa(Double x,int y){
        return x+y;
        }
    public static void main(String[] args){
        int a=aa(8,9);
        System.out.println(a);
    }
}

class Shuzu{
    public static void main(String[] args) {
        //当有很多同类型 并且内容相近的一堆值需要存储的时候
        //按照之前学习的内容 需要定义很多单个的变量 来存储这些值
        //非常麻烦 并且乱
        //于是乎发明了数组的概念 数组就是一堆数字的组合 用[]表示
        
        int[] ids=new int[38];//new关键字是用来创建的 创建了一个int数组，该数组的长度为38
        ids[0]=110;//静态赋值
        ids[1]=111;
        ids[2]=22;
        //数组的几种写法
        int[] is2=new int[2];//定义了一个int类型的数组 叫is2
        int is3[]=new int[3];//定义了一个int类型 叫is3 并且是一个数组
        //数组的赋值方式
        int[] is4=new int[]{1,2,3,4,5};
        //可以写成
        int[] is6={3,4,5,6,7,8,9,0};//动态赋值
        //System.out.println(is4);//会是uniquide码需要遍历获得值
        //System.out.println(is4.length);//获得is4的长度

        //数组的遍历
        for(int i:is4){
            System.out.println(i);
        }
        
    }
    }