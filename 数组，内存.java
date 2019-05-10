class Demo01{
    public static void main(String[] args) {
        /*数组是什么？ 多个相同数据的组合
        数组的两种定义方式
         */
        int[] is = new int[7];
        //数组定义完成之后有没有值？ int默认值为0，在创建完之后java会给里面所有的元素赋值为0

        is[0] = 3;
        for (int i:is){
            System.out.println(i);
        }
        //String类型默认值为null,,string属于引用数据类型，所有的引用数据类型默认值都输出null
        String[] ss = new String[6];
        System.out.println(ss[3]);

        //java中的内存分配  分配为5个部分
        //寄存器：给虚拟机用的
        //方法区：存储方法的
        //本地方法区，
        //堆内存：比较久，需要考虑内存清理问题，java中有一个处理垃圾的机制，叫做垃圾回收器（简称GC）不能控制什么时候清理
        //栈内存：是一个临时的区域，所有运行都在栈内存中进行的，main就是一个，在栈内存中运行的变量一定要有值
        //凡是使用new关键字创建都在堆中创建
        //当没有任何一个变量指向该内存的时候该内存就变成了垃圾
        int[] ins =new int[2];
        int[] ins2 = ins;
    }
}

class Erwei{
    public static void main(String[] args) {
        /**
         * 二维数组，使用数组来存储多个数组
         */
        int[] is =new int[3];
        int[][] iss=new int[3][];
        iss[0] = is;
        iss[1] = is;
        iss[2] = is;
        is[0] = 123;
        System.out.println(iss[1][0]);//直接输出，输出的是引用数据类型的哈希码（内存地址编号）

        int[] ins={1,2,3};
        int[][] inss = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(inss[2][1]);
    }
}

/**
 * 编程语言的发展历史
 * 1.汇编：非常底层
 * 2.面向过程 ：C语言
 * 3.面向对象 ： c++  JAVA
 * 前提：我们进程程序的开发，就是为了解决现实生活中遇到的问题
 * 把大象放进冰箱里，应该怎么做？   老板的想法：
 * 1.打开冰箱门                 1.告诉冰箱开门
 * 2.把大象放进去               2.告诉大象进去
 * 3.把冰箱门关上               3.告诉冰箱关门
 * 面向过程  所有的东西都是按照自己亲自去做
 * 
 * 面对对象的思维 ：是站在指挥者的角度去考虑问题 从面项过程的执行者变成了面向对象的指挥者；人们把世间万物都比喻成对象，
 * 然后就可以指挥该对象去做事情了
 * 具体到执行应该是怎样的？
 * java中最基本的类class 我们把类看作是图纸，对象是通过图纸创造出来的
 */
