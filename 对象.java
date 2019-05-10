//package entity;
class Car{
    String color;
    int lunCount;
    String pinpai;
    String fadongji;

    public void run() {
        System.out.println(fadongji+"牌发动机");    
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.fadongji = "红色";
        c1.run();

    }
}
    

//在java中把类看作是创建该品类的图纸
//把所有的有关该品类的共性抽取出来
//把外在的属性用变量表示
//把行为用方法表示
class Cat{
    String color;
    String pinzhong;
    int tizhong;

public void run(){
    System.out.println(color+tizhong+"斤的"+pinzhong+"猫");

}
public void eat(){
    System.out.println(pinzhong+"猫");
}
public static void main(String[] args) {
    Cat c1 = new Cat();
    c1.color="白色";
    c1.pinZhong = "加菲";
    c1.tizhong = 10;
    c1.run();

    Cat c2 = new Cat();
    c2.color="黑色";
    c2.pinzhong = "短毛";
    c2.tizhong = 15;
    c2.run();

}
}



class Person{
    String name;
    /**public 修饰符
     * private修饰符关键字 私有的 被此关键字所修饰的变量和方法 无法在此类之外访问
     */
    private int age;
    //如何给该属性赋值？我们可以提供一个公开的方法
    public void setAge(int x){
        if(x>120||x<1){
			System.out.println("hahaha");
		}else{
			age=x;
		}
    }
    public int getAge(){
		return age;
}


class Test3{

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "李雷";
        //p.age = -5;//虽然语法没有问题，但是这个我们是不接受的，我们要想办法控制这个值的准确性
        //如何控制？我们可以这样做，不允许别人直接给属性去赋值，我们把属性隐藏起来
        p.setAge(50);
        System.out.println("年龄"+p.getAge());
    }
}


