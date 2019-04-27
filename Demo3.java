import java.util.*;
public class Demo3{
    public static void main(String[] args){
        //if判断 代表如果（布尔值）括号内一定是布尔值
        //{判断条件为true时要执行的代码}
        //else否则  其他的一切情况 都按照该代码块的内容执行
        //如果你要执行的代码只有一句话，可以省略{}
        //所有的分支 只会执行一个 当有条件判断成功 则执行该代码块中的代码
        //其他代码都不执行 当所有条件判断都不成立 执行else代码块
        //else代码块 不是必须的
     int cuCun=3;
     if(cuCun<0){
         System.out.println("hahaha");
     }else if(cuCun>4){
        System.out.println("enenen");
        System.out.println("yes");
     }
     else{
         System.out.println("lueluelue");
     }   
    }
}


//import java.util.*;
class Demo4{
    public static void main (String args[]) {
      //System.out.println("day"+new Date().getDay()); 
      int week=new Date().getDay();

      if(week==1|week==7){
        System.out.println("no ");
        System.out.println("feel good");
      }else if(week==2){
        System.out.println("qige  yanjie java");
      }else if(week==3){
        System.out.println("java");
      }else if(week==4){
        System.out.println("qige  yanjie");
      }else if(week==5){
        System.out.println("qige  yanjie");
        System.out.println("feel good");
      }else{
        System.out.println("java");
      }
    }     
  }