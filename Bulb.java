class Bulb{
	int wattage;              
    int lumens;     
    String brand; 
    String color;            
    String type;         
    int lifespanHours ;  
    int voltage;  
    String baseType;     
    boolean dimmable;   
    String energyEfficiencyRating;           
    int price;  
	
	public Bulb(){
		
	}
	public Bulb(int wattage){
		this.wattage=wattage;
	}
	public Bulb(int wattage,int lumens){
		this(wattage);
		this.lumens=lumens;
	}
	public Bulb(int wattage,int lumens,String brand){
		this(wattage,lumens);
		this.brand=brand;
	}
	public Bulb(int wattage,int lumens,String brand,String color){
		this(wattage,lumens,brand);
		this.color=color;
	}
	public Bulb(int wattage,int lumens,String brand,String color,String type){
		this(wattage,lumens,brand,color);
		this.type=type;
	}
	public Bulb(int wattage,int lumens,String brand,String color,String type,int lifespanHours){
		this(wattage,lumens,brand,color,type);
		this.lifespanHours=lifespanHours;
	}
	public Bulb(int wattage,int lumens,String brand,String color,String type,int lifespanHours,int voltage){
		this(wattage,lumens,brand,color,type,lifespanHours);
		this.voltage=voltage;
	}
	public Bulb(int wattage,int lumens,String brand,String color,String type,int lifespanHours,int voltage,String baseType){
		this(wattage,lumens,brand,color,type,lifespanHours,voltage);
		this.baseType=baseType;
	}
	public Bulb(int wattage,int lumens,String brand,String color,String type,int lifespanHours,int voltage,String baseType,boolean dimmable){
		this(wattage,lumens,brand,color,type,lifespanHours,voltage,baseType);
		this.dimmable=dimmable;
	}
	public Bulb(int wattage,int lumens,String brand,String color,String type,int lifespanHours,int voltage,String baseType,boolean dimmable,String energyEfficiencyRating){
		this(wattage,lumens,brand,color,type,lifespanHours,voltage,baseType,dimmable);
		this.energyEfficiencyRating=energyEfficiencyRating;
	}
	public Bulb(int wattage,int lumens,String brand,String color,String type,int lifespanHours,int voltage,String baseType,boolean dimmable,String energyEfficiencyRating,int price){
		this(wattage,lumens,brand,color,type,lifespanHours,voltage,baseType,dimmable,energyEfficiencyRating);
		this.price=price;
}
public void info() {
		System.out.println("Bulb wattage is" +this.wattage);
		System.out.println("Bulb lumens is" +this.lumens);
		System.out.println("Bulb brand is" +this.brand);
		System.out.println("Bulb color is" +this.color);
		System.out.println("Bulb type is" +this.type);
		System.out.println("Bulb lifespanHours is" +this.lifespanHours);
		System.out.println("Bulb voltage is" +this.voltage);
		System.out.println("Bulb baseType is" +this.baseType);
		System.out.println("Bulb dimmable is" +this.dimmable);
		System.out.println("Bulb energyEfficiencyRating is" +this.energyEfficiencyRating);
		System.out.println("Bulb price is" +this.price);
		System.out.println("\n-------------------------------\n");
	}	
	}