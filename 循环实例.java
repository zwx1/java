class sanjiao{
    public static void main(String[] args) {

    //找到规律
        for(int i=0;i<8;i++){
            System.out.println();
            for(int j=0;j<8-i;j++){
                System.out.print(" ");   
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            
        }
    }
}

class Zfx{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println();
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
        }
    }
}

class Ping{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
        }
    }
}

class Chengfabiao{
    public static void main(String[] args){
        //for 循环的嵌套来实现输出99乘法表
        for(int i=1;i<=9;i++){//i就是代表行数
            for(int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + j * i + "  ");
            }
            System.out.println();
        }

    }
}