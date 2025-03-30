class Granite{
	int size;
	int width;
	String color;
	String use;
	String design;
	String brand;
	String Hardness;
	boolean isAvailable;
	int price;
	int warrenty;
	
	public Granite(){
		
	}
	
	public Granite(int size){
		this.size=size;
		
	}
	
	public Granite(int size,int width){
		this(size);
		this.width=width;
	}
	
	public Granite(int size,int width,String color){
		this(size,width);
		this.color=color;
	}
	
	public Granite(int size,int width,String color,String design){
		this(size,width,color);
		this.use=use;
	}
	
	public Granite(int size,int width,String color,String use,String design){
		this(size,width,color,use);
		this.design=design;
	}
	
	public Granite(int size,int width,String color,String use,String design,String brand){
		this(size,width,color,use,design);
		this.brand=brand;
	}
	
	public Granite(int size,int width,String color,String use,String design,String brand,int hardness ){
		this(size,width,color,use,design,brand);
		this.hardness=hardness;
	}
	
	public Granite(int size,int width,String color,String use,String design,String brand,int hardness ,boolean isAvailable){
		this(size,width,color,use,design,brand,hardness);
		this.isAvailable=isAvailable;
	}
	
	public Granite(int size,int width,String color,String use,String design,String brand,int hardness,boolean isAvailable,int price){
		this(size,width,color,use,design,brand,hardness,isAvailable);
		this.price=price;
	}
	
	public void info(){
		System.out.println("Granite size is "+this.size);
		System.out.println("Granite width is "+this.width);
		System.out.println("Granite color is "+this.color);
		System.out.println("Granite use  is "+this.use);
		System.out.println("Granite design  is "+this.design);
		System.out.println("Granite brand is "+this.brand);
		System.out.println("Granite hardness  is "+this.hardness);
		System.out.println("Granite isAvailable  is "+this.isAvailable);
		System.out.println("Granite price  is "+this.price);
		System.out.println("Granite compartments is "+this.compartments);
		System.out.println("\n-------------------------------\n");
	}
	
	
}