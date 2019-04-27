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