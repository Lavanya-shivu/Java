class Wallet {
	String brand;
	int price;
	int compartments;
	double quality;
	boolean isWorth;
	boolean isPoketfriendly;
	String material;
	String color;
	double width;
	double thickness;
	boolean iscoinPocket;
	
	
	public Wallet(){
		
	}
	public Wallet(String brand){
		this.brand=brand;
	}
	public Wallet(String brand,int price){
		this(brand);
		this.price=price;
	}
	public Wallet(String brand, int price, int compartments){
		this(brand,price);
		this.compartments=compartments;
	}
	public Wallet(String brand,int price,int compartments,double quality){
		this(brand,price,compartments);
		this.quality=quality;
	}
	public Wallet(String brand, int price,int compartments, double quality, boolean isWorth){
		this(brand,price,compartments,quality);
		this.isWorth=isWorth;
	}
	public Wallet(String brand,int price, int compartments,double quality, boolean isWorth, boolean isPoketfriendly){
		this(brand,price,compartments,quality,isWorth);
		this.isPoketfriendly=isPoketfriendly;
	}
	public Wallet(String brand,int price,int compartments,double quality,boolean isWorth, boolean isPoketfriendly,String material){
		this(brand,price,compartments,quality,isWorth,isPoketfriendly);
		this.material=material;
	}
	public Wallet(String brand,int price,int compartments,double quality, boolean isWorth, boolean isPoketfriendly,String material, String color){
		this(brand,price,compartments,quality,isWorth,isPoketfriendly, material);
		this.color=color;
	}
	public Wallet(String brand,int price,int compartments,double quality, boolean isWorth, boolean isPoketfriendly,String material, String color, double width){
		this(brand,price,compartments,quality,isWorth,isPoketfriendly, material,color);
		this.width=width;
	}
	public Wallet(String brand,int price,int compartments,double quality, boolean isWorth, boolean isPoketfriendly,String material, String color, double width,double thickness){
		this(brand,price,compartments,quality,isWorth,isPoketfriendly, material,color,width);
		this.thickness=thickness;
	}
	public Wallet(String brand,int price,int compartments, double quality, boolean isWorth, boolean isPoketfriendly,String material, String color, double width,double thickness, boolean iscoinPocket){
		this(brand,price,compartments,quality,isWorth,isPoketfriendly, material,color,width,thickness);
		this.iscoinPocket=iscoinPocket;
	}
	public void info(){
		System.out.println("Wallet brand is" +this.brand);
		System.out.println("Wallet price is" + this.price);
		System.out.println("Wallet compartments is" +this.compartments);
		System.out.println("Wallet isWorth" +this.isWorth);
		System.out.println("Wallet isPoketfriendly" +this.isPoketfriendly);
		System.out.println("Wallet material is" +this.material);
		System.out.println("Wallet color is" +this.color);
		System.out.println("Wallet width is" +this.width);
		System.out.println("Wallet price is" +this.price);
		System.out.println("Wallet thickness is" +this.thickness);
		System.out.println("Wallet iscoinPocket" +this.iscoinPocket);
	}
}