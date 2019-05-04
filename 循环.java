class Demo6{
    public static void main(String[] args){
        //循环结构：让程序不停的重复运行同一段代码
        //for循环 规范：for(初始化条件；判断语句；结束标记){要重复的代码}
        /*1.初始化语句只执行一次 
        2.判断执行条件 如果条件为true 执行循环体 为false结束循环
        3.循环体执行完 执行结束标记条件
        4.判断执行条件。。。。以此类推 知道执行条件为false
        */
        for(int i=0;i<5;i++){
            System.out.println("hello world" + i);
        }
        System.out.println("--------------");
        //for 循环中唯有判断条件是不能省略的，其他的都可以省略，但是；不能省略。
        int x=0;
        for(;x<10;){
            System.out.println("Hello world"+x);
            x++;
        }
        //System.out.println(x);
        System.out.println("--------------");
        //while循环中 只有判断语句 在编写循环语句的时候一定注意结束条件
        //避免陷入死循环

        //初始值x为10
        while(x<20){
            System.out.println(x);
            x++;
        }
        System.out.println("--------------");
        //do while循环 do{}while() 先执行，再判断
        int y=0;
        do{
            System.out.println(y);
            y++;
        }while(y<5);

    }
}
//do…while循环至少会执行一次循环体
//for循环和while循环只有在条件成立的时候才会去执行循环体