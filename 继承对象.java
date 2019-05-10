class Shopping {
	
	String name;
	Double price;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name=name;
	}
	public Double getPrice() {
		return this.price=price;
	}
	public void setPrice(Double price) {
		if(price<0){
			System.out.println("这不是一个商品");
		}else{
			this.price = price;
		}
	}
	
	public String toString() {
		
		return "这个商品是" + name + ", 价格为" + price  + "元";
	}
		
}

class Phone extends Shopping{
    private String brand;
    private Double size;
    public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return this.brand=brand;
	}
	public Double getSize() {
		return this.size=size;
    }
    public void setSize(Double size) {
        if(size>7){
            System.out.println("它可能是一个平板");
        }else{
            this.size = size;
        }
        
    }

    public String toString() {
		
		return "它是一个" + brand + "的" +name +",价格为"+ price  + "元，屏幕大小为"+size+"寸";
	}
}

class Phone1{

    public static void main(String[] args) {
        Phone s=new Phone();
            s.setName("手机");
            s.setPrice(888.8);
            s.setBrand("小米");
            s.setSize(5.5);
            
            System.out.println(s.toString());
            
    }
}