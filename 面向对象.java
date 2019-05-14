/**
 * 下面对构造方法进行说明：
 * 它在创建对象的时候必须调用的方法
 *.特点：
   1.没有返回值类型  连void都没有  public  Car(){}
 * 2.方法名一定要跟类名保持一致
 * 3.构造方法可以重载 
 * 如果你没有编写构造方法  java会默认给类中添加一个无参数构造方法public 类名(){} 不写也存在
 * 但是 如果你编写了任意一个构造方法（不管有没有参数） 那么java则不给提供无参数构造方法了
 */
class Test01 {
//此处如果加上private说明整个变量只能在本类中使用
   String name;
   String color;
   int number;
    //有参构造函数
    public Test01(String name,String color) {
        this.name = name;
        this.color = color;
    }
    public Test01(){
        System.out.println("无参数的构造方法执行");
    }
    public Test01(int number){
        this.number = number;
        System.out.println("它的数字为：" + number);
    }
}
class Test02{
    public static void main(String[] args) {
        Test01 t=new Test01("Wade","black");
        System.out.println("它的名字是："+t.name +"，它的颜色是："+ t.color);
        Test01 t1 = new Test01(2);
        Test01 t2 = new Test01();//无参数的构造方法执行
    }
}
// 以上是构造方法的构造和调用，与set和get方法差不多，这种机制叫封装


 //下面进行static关键字的说明  以及每个方法实现的顺序
 /*static代表静态的  静态的就是类的 非静态的是对象的
    * 被static修饰的变量 方法  可以被类直接访问  也可以被对象访问
    * static的方法中 无法访问非静态的内容  
    * 先加载类 再创建对象
    对象是不是可以调用静态的内容？

    1.静态的内容随着类加载而加载
    2.对象创建

    当对象出现的时候 静态的内容一定已经出现了

    静态的内容 被所有的对象共享

    非静态的内容 不能被静态的内容访问
*/
class Test03 {
	public int x;//成员变量
	public static int y;//静态变量
	
	public void m1(){//成员方法 要调用 先创建对象 让对象去调用
		System.out.println(y);
	}
	public static void m2(){//静态方法
		System.out.println("静态方法调用");
	}
	public static void main(String[] args){//main方法 是程序的入口 直接调用
       System.out.println(Test03.y); //它的默认值为0，输出的值为0

        Test03.m2();//输出的值是“静态方法调用”
        
        Test03 t=new Test03();
		Test03 t2=new Test03();
        t.y=5;   //将y的默认值改为56 所以输出的值为5
		System.out.println(Test03.y);
		t2.y=89;
		System.out.println(t.y);
	}
}
//代码块
/**
    代表一块区域 把里面所有的代码看做一个整体  然后使用{}包起来
    局部代码块  定义在方法内public void m(){ {局部代码块}   }
    构造代码块 定义在类中方法外public class A{ {构造代码块}  }
    静态代码块 定义在类中方法外 并且前面有static关键字  static{}
    执行顺序：静态代码块---构造代码块---构造方法
 */
class Test04{
    private int lunCount;
    private String color;
    private String pinPai;
    static{
		System.out.println("静态代码块执行");
    }
	{
		System.out.println("非静态代码块执行");
    }
    public Test04(){
		System.out.println("构造方法执行");
	}
    public static void main(String[] args) {
        Test04 t=new Test04();
    }
}

//继承   只支持单继承  一个子类一个父类  单支持多重继承
class Animal {
	public int tuiCount=2;//成员变量
	
	public Animal(){
		System.out.println("父类的无参数构造方法执行");
	}
	
	public void sleep(){
		System.out.println("动物需要睡觉");
	}
	public void eat(){
		System.out.println("动物需要吃饭");
	}
	
	static{//静态代码块  随着类加载而加载
		System.out.println("父类静态代码块");
	}
	{//静态代码块  随着类加载而加载
		System.out.println("父类非静态代码块");
	}
}
class Dog extends Animal{
	//public int tuiCount=2;
	public int tuiCount=4;
	
	public Dog(){//子类的无参数构造方法
		super();//是一个方法  父类的构造  java在给我们添加无参数构造方法的时候 会先去调用super();
		//super()  不写也存在 而且必须是构造方法中的第一句可执行代码
		/**
		 * 加载顺序 1.父类静态代码块  2.子类静态代码块 3.父类非静态代码块 4.父类构造方法5.子类非静态代码块 6.子类构造方法
		 */
		System.out.println("子类构造方法执行");
	}
	public Dog(int x){
		this();//this()代表自己的构造方法  也必须是第一句可执行代码
		System.out.println("子类带参数构造方法");
	}
	
	public void sleep(){
		/**
		 * 在局部变量覆盖了成员变量的时候 可以使用this关键字来指向成员变量
		 * 在子类的成员变量覆盖了父类的变量的时候  可以使用super关键字来指向父类的变量
		 * 1.先找局部变量
		 * 2.再找成员变量
		 * 3.再找父类的变量
		 */
		int tuiCount=8;
		System.out.println(super.tuiCount+"条腿收起来，然后闭上眼睛睡觉");
	}
	static{
		System.out.println("子类静态代码块");
	}
	{
		System.out.println("子类非静态代码块");
    }
}
    class Test05{
    public static void main(String[] args) {
        Dog d=new Dog(23);
		d.sleep();
		
		System.out.println(d.tuiCount); //结果是4 原因是被子类的相同的参数所覆盖了
    }

}

//重写

/**
 * 非私有的成员方法是可以被继承的
 * 当子类中有一个与父类  方法名相同 参数列表也相同 并且返回值类型也必须相同的方法的时候
 * 父类继承的方法则会被重写
 * 
 * 当我们不知道一个方法是否和父类相同的时候（为了验证此方法是否是重写的方法）
 * @Override 写在方法上  用来验证该方法是否被重写 如果是 则不会报错 如果不是 则报错
 * 
 * 重写的方法  访问权限不能更低  父类的是public  子类必须是public
 * 
 */
class father {
	public void eat(){
		System.out.println("父亲吃了"); 
	}
 }
class son extends father{
    @Override      //看有没有被重写
	public void eat(){
		  System.out.println("儿子吃了");
	  }
  }
  class chongxie {
	public static void main(String[] args) {
	 father father= new father();
	 son son = new son();
	 father.eat();
	 son.eat(); 
 }
 }

 //final关键字  
 /* 修饰符  用来修饰方法 变量 类
    用其修饰的类  不能被继承
    用其修饰的变量 不能被改变 并且在对象创建之前(构造方法执行结束之前) 必须初始化 一般用来表示常量
    用其修饰的方法  不能被重写*/
 class Demo {
	final int i;
	public Demo(){
		i=56;
	}
	public final void m(){//成员方法 要调用 先创建对象 让对象去调用
		System.out.println("hahaha");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
	//	d.i=78; 会报错
        System.out.println(d.i);
        d.m();
	}
}

//多态
class Animal1 {
	
	public static int x=6; //定义了一个静态变量
	public void jiao(){ //定义了一个成员方法
		System.out.println("动物会叫");
	}
}
class Bird extends Animal1{
	
	public void jiao(){
		System.out.println("叽叽喳喳。。。。");
	}
	
	public void fly(){
		System.out.println("鸟会飞。。。。");
	}
}
class Dog1 extends Animal1{

	public void jiao(){
		System.out.println("汪汪汪。。。。。");
	}
	
}
class Dog2 extends Dog1{
    public void haha() {
        System.out.println("多重继承");
    }
}
class Test06 {
	public static void main(String[] args) {
		Dog2 e=new Dog2();
        System.out.println(e.x);
        e.haha();
	}
}
class Test07 {
	public static void main(String[] args) {
		Dog1 d=new Dog1();//我需要一条狗  创建了一条狗
//		d.jiao();
		
		
//		Animal1 a=new Dog1();//我需要一个动物  创建了一条狗
//		a.jiao();
		
		Bird b=new Bird();//当它的状态是一只鸟的时候  可以飞
		b.fly();
		System.out.println("鸟："+b);
		Animal1 a=b;//当这只鸟是作为一只动物存在的时候  不能使用它自己的特性  只能使用动物的共性
		//但是在实际执行的过程中  执行的还是属于它自己的特性
		a.jiao();
		System.out.println("动物："+a);
		
		//当它作为父类存在时 要想使用属于子类的特性怎么办？？？没有办法  强转  前提是 强转的类型是一致的
		Animal1 aa=new Bird();
		if(aa instanceof Bird){//判断这个动物是一只鸟 再强转就不会出错  instanceof用来判断 对象是否为某类型的
			((Bird)aa).fly();
		}
				
	}
}

//抽象
/**
 * 某些时候  类的定义并不是用来创建对象的  比如动物  是没有具体实现的 他是一个抽象的概念  这种类 我们一般不创建对象
    它比较抽象  
    abstract就代表抽象	 使用abstract关键字修饰的类 不能被创建对象
    public abstract class Animal {}

    抽象类中 可以有变量 也可以有常量

    抽象类中 可以有抽象方法（使用abstract修饰的方法）不需要编写方法体  但是继承它的子类 必须重写该方法
    public abstract void jiao();//抽象的方法

    构造方法：抽象类虽然不能创建对象  但是它是有构造方法的  为了让子类去调用父类的构造方法
 */
abstract class Animal2 {//定义一个抽象类
	
	public abstract void jiao();//抽象的方法 final
	public static int x=8;
	public Animal2(){
		System.out.println("父类构造方法");
	}
}

class Dog3 extends Animal2{

	@Override
	public void jiao() {
		System.out.println(x+"汪汪汪。。。。");
	}
	
}
class Test08 {
	public static void main(String[] args) {
		Animal2 a=new Dog3();
        Dog3 d=new Dog3();
        a.jiao();
        d.jiao();
		
	}
}
//接口
/**
 * 接口其实就是一种变相的抽象类  比较特殊的抽象类
		1.不再用class去表示了  而是使用 interface来表示
		public interface Demo {}
		2.接口中的所有的变量 都是常量  默认修饰符 public final  不写也存在
			public final int x=56;	
		3.接口中的所有方法 都是抽象方法  默认修饰符 public abstract不写也存在
			public abstract void m();
			
		接口的存在就是为了让子类去继承（实现）使用关键字implements来实现
		public class A implements Demo
		
		在JAVA中  单继承  多实现  一个类智能继承一个父类  但是可以实现多个接口
		多个接口之间 使用,隔开
		public class A implements Demo,Demo2
 */

interface Demo {//接口
    int x=56;
    public abstract void m();
   
}
interface Demo2 extends Demo{

}
class Aa implements Demo,Demo2{

	@Override
	public void m() {	
        System.out.println("hhh");
	}
	public static void main(String[] args) {
		Aa a=new Aa();
		System.out.println(a.x);
	}

}

//练习 程序员 经理 
abstract class Employee {
	double gongzi;
	String name;
	
	public abstract void work();
	
	public void getMoney(){ //定义了一个成员方法
		System.out.println("今天"+name+"领到了"+gongzi+"元的工资");
	}
}

class JingLi extends Employee{
	double jiangjin;
	@Override
	public void work() {
		System.out.println(name+"经理指挥程序员去工作，分配任务");
	}
	public void getMoney(){
		System.out.println("今天"+name+"领到了"+gongzi+"元的工资和"+jiangjin+"元的奖金");
	}

}

class ChengXuYuan extends Employee{

	@Override   //查看是否被重写，如果被重写，不报错，没有被重写会报错
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name+"程序员在码代码");
	}
}
class Test {
	public static void main(String[] args) {
		Employee cxy1=new ChengXuYuan();
		Employee cxy2=new ChengXuYuan();
		JingLi jl=new JingLi();
		cxy1.name="小明";
		cxy2.name="小花";
		jl.name="王经理";
		
		cxy1.gongzi=3000;
		cxy2.gongzi=5000;
		jl.gongzi=8000;
		jl.jiangjin=1000;
		
		jl.work();
		cxy1.work();
		cxy2.work();
		
		jl.getMoney();
		cxy1.getMoney();
		cxy2.getMoney();
		
	}
}
