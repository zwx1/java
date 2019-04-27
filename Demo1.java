class Demo1
{
	public static void main(String[] args) 
	{
		int i1=123;
		int i2=456;
		//System.out.print(i1+i2);	
		
		int i3=10;
		int i4=4;
		//System.out.print(i3%i4);

		int i=123;
		i=i+1;
		i++;//++表示自增 自动+1
		//System.out.println(++i);
		//System.out.println(i);

		int i11=4;
		int i22=++i11;
		//System.out.println(i22);
		//关系运算符，要么返回True要么返回False
		int a1=123;
		int a2=123;
		//System.out.println(a1==a2);
		//System.out.println(!(a1==a2));//!放在前面表示取反   ！=他们两个不相等

		//逻辑运算符 用来拼接条件的 
		//&与/ 且 用来拼接多个条件的，交集
		// | 或
		int a3=123;
		//System.out.println(a3==123 & i<122);
		int a4=123;
		//^异或  两边一样的时候是False
		//System.out.println(a4==123 & a4<122);
		//&&逻辑与 ||逻辑或 如果条件已经确定，则后面的判断不再执行运算效率高一些
		//System.out.println(a4>0 && a4<122);
		int x=19;
		int y=18;
		int z=8;
		int max1=(x>y & x>z)?x:(y>x & y>z)?y:z;//(z>x & z>y)?z:4;
		System.out.println(max1);
	
									
		

	}
}
