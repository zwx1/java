class Person{
    int age=9;//成员变量  蓝色的都是成员变量  它在堆内存中
    public void showAge(){//成员方法
       int age =56;//局部变量  包括参数也是局部变量  局部变量是定义在方法内的，出了方法的范围就无法被访问
        System.out.println(age);
    }
}

class Demo1{
    //什么是成员变量，什么是局部变量
    public static void main(String[] args) {
        /**
         * 局部变量：定义在方法内部的变量，叫做局部变量 如果该变量出了该方法的作用范围 不能被访问，不能被找到
         * 成员变量：定义在类中  方法外的变量 叫成员变量（全局变量） 作用范围 只要在类中就可以访问
         * 
         * 成员方法：定义在类中的方法 (不包含static关键字的方法叫做成员方法) 通过具体对象调用 跟类没关系（不能拿着汽车图纸让图纸跑，
         * 只能涉及到具体的汽车对象才能跑起来）
         */
        Person p1=new Person();
        Person p2=new Person();
        p1.age=123;
        p2.showAge();
        System.out.println(p1.age);
        /**
         * 成员变量虽然能在方法中被访问  但是 当有局部变量和成员变量的名字相同的时候  成员变量被覆盖了 无法直接访问成员变量 只能访问局部变量
		 * 我非要在这种情况下 使用成员变量怎么办？？？关键字 this  就代表对象本身  this只能使用在类中  谁调用 this就代表谁
		 * this.age  代表 哪个对象调用的该属性  this就代表该对象
         */
    }
    //int j=321;
}



class Demo2{
    public static void showPerson(Person person){//参数为引用数据类型的情况
        person.age=123;//在方法中改变了引用数据类型的参数
    }

    public static void showInt(int i){//参数为引用数据类型的情况
        i=789;//在方法中改变了基本数据类型的参数
    }
    public static void main(String[] args) {
        
        /**
         * 形式参数问题：方法的定义中如果有参数，分为两种情况
         * 1.参数类型为基本数据类型
         * 2.参数类型为引用数据类型
         */
        int x=1;//基本数据类型 x=1
        Person p=new Person();
        p.age=1;//引用数据类型 p.age=1
        showInt(x);//调用方法，传递基本数据类型
        showPerson(p);//调用方法，传递引用数据类型
        System.out.println(x);
        System.out.println(p.age);
        /**
		 * 总结 基本数据类型传递的是值  被改变的是值  原来的变量存储的内容 没有发生变化
		 * 		引用数据类型传递的是内存地址  当内存地址的内容被更改了 原来指向该内存的内容也被更改了
		 */
    }
}