class Poster{
	int size;
	int width;
	String color;
	String design;
	String type;
	String brand;
	boolean useful;
	boolean isAvailable;
	int price;
	boolean ispasted;
	
	public Poster(){
		
	}
	
	public Poster(int size){
		this.size=size;
		
	}
	
	public Poster(int size,int width){
		this(size);
		this.width=width;
	}
	
	public Poster(int size,int width,String color){
		this(size,width);
		this.color=color;
	}
	
	public Poster(int size,int width,String color,String design){
		this(size,width,color);
		this.design=design;
	}
	
	public Poster(int size,int width,String color,String design,String type){
		this(size,width,color,design);
		this.type=type;
	}
	
	public Poster(int size,int width,String color,String type,String design,String brand){
		this(size,width,color,type,design);
		this.brand=brand;
	}
	
	public Poster(int size,int width,String color,String type,String design,String brand,boolean useful ){
		this(size,width,color,type,design,brand);
		this.useful=useful;
	}
	
	public Poster(int size,int width,String color,String type,String design,String brand,boolean useful ,boolean isAvailable){
		this(size,width,color,type,design,brand,useful);
		this.isAvailable=isAvailable;
	}
	
	public Poster(int size,int width,String color,String type,String design,String brand,boolean useful,boolean isAvailable,int price){
		this(size,width,color,type,design,brand,useful,isAvailable);
		this.price=price;
	}
	
	public Poster(int size, int width,String color,String type, String design, String brand, boolean useful, boolean isAvailable, int price, boolean ispasted){
		this(size,width,color,type,design,brand,useful,isAvailable,price);
		this.ispasted=ispasted;
	}
	public void info(){
		System.out.println("Poster size is "+this.size);
		System.out.println("Poster width is "+this.width);
		System.out.println("Poster color is "+this.color);
		System.out.println("Poster type  is "+this.type);
		System.out.println("Poster design  is "+this.design);
		System.out.println("Poster brand is "+this.brand);
		System.out.println("Poster useful is "+this.useful);
		System.out.println("Poster isAvailable  is "+this.isAvailable);
		System.out.println("Poster price  is "+this.price);
		System.out.println("Poster ispasted is "+this.ispasted);
		System.out.println("\n-------------------------------\n");
	}
	
	
}