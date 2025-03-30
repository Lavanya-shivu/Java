class Pallette{
	int size;
	int width;
	String color;
	String use;
	String type;
	String brand;
	String material;
	boolean isAvailable;
	int price;
	int compartments;
	
	public Pallette(){
		
	}
	
	public Pallette(int size){
		this.size=size;
		
	}
	
	public Pallette(int size,int width){
		this(size);
		this.width=width;
	}
	
	public Pallette(int size,int width,String color){
		this(size,width);
		this.color=color;
	}
	
	public Pallette(int size,int width,String color,String use){
		this(size,width,color);
		this.use=use;
	}
	
	public Pallette(int size,int width,String color,String use,String type){
		this(size,width,color,use);
		this.type=type;
	}
	
	public Pallette(int size,int width,String color,String use,String type,String brand){
		this(size,width,color,use,type);
		this.brand=brand;
	}
	
	public Pallette(int size,int width,String color,String use,String type,String brand,String material){
		this(size,width,color,use,type,brand);
		this.material=material;
	}
	
	public Pallette(int size,int width,String color,String use,String type,String brand,String material,boolean isAvailable){
		this(size,width,color,use,type,brand,material);
		this.isAvailable=isAvailable;
	}
	
	public Pallette(int size,int width,String color,String use,String type,String brand,String material,boolean isAvailable,int price){
		this(size,width,color,use,type,brand,material,isAvailable);
		this.price=price;
	}
	
	public void info(){
		System.out.println("Pallette size is "+this.size);
		System.out.println("Pallette width is "+this.width);
		System.out.println("Pallette color is "+this.color);
		System.out.println("Pallette use  is "+this.use);
		System.out.println("Pallette type  is "+this.type);
		System.out.println("Pallette brand is "+this.brand);
		System.out.println("Pallette material  is "+this.material);
		System.out.println("Pallette isAvailable  is "+this.isAvailable);
		System.out.println("Pallette price  is "+this.price);
		System.out.println("Pallette compartments is "+this.compartments);
		System.out.println("\n-------------------------------\n");
	}
	
	
}