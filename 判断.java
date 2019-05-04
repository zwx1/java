import java.util.*;
public class Demo4{
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

class Demo5{
    public static void main(String[] args){
        int week=6;
        /*switch语句 用来进行匹配 格式：switch(值或者表达式){case....}
        case:每一个匹配项  程序在运行的过程中 会依次讲case的值与括号内
        的表达式的值去比较 如果相等 则从该case后依次全部执行所有的case
        若没有匹配的值 则执行default default可以放在任何位置。
        我们想要执行当前的case  不执行之后的case，可以使用break跳出当前的switch结构
        建议每个case之后都加上break。
        */ 
        switch(week){
            case 1:System.out.println("yes");break;
            case 2:System.out.println("yes1");break;
            case 3:System.out.println("yes2");break;
            case 4:System.out.println("yes3");break;
            case 5:System.out.println("yes4");break;
            case 6:System.out.println("yes5");break;
            case 7:System.out.println("yes6");break;
            default:System.out.println("no");break;

        }
    }
}
