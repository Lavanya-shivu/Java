class BulbRunner{
	public static void main(String args[]){
		
		Bulb bulb = new Bulb();
		bulb.info();
		
		int wattage = 9;
		Bulb bulb2 = new Bulb(wattage);
		bulb2.info();
		
		int lumens = 800;
		Bulb bulb3 = new Bulb(wattage,lumens);
		bulb3.info();
		
		String brand = "Philips";
		Bulb bulb4 = new Bulb(wattage,lumens,brand);
		bulb4.info();
		
		String color = "Warm White"; 
		Bulb bulb5 = new Bulb(wattage,lumens,brand,color);
		bulb5.info();
		
		String type = "LED"; 
		Bulb bulb6 = new Bulb(wattage,lumens,brand,color,type);
		bulb6.info();
		
		int lifespanHours = 2500;
		Bulb bulb7 = new Bulb(wattage,lumens,brand,color,type,lifespanHours);
		bulb7.info();
		
		int voltage = 220; 
		Bulb bulb8 = new Bulb(wattage,lumens,brand,color,type,lifespanHours,voltage);
		bulb8.info();
		
		String baseType = "E27"; 
		Bulb bulb9 = new Bulb(wattage,lumens,brand,color,type,lifespanHours,voltage,baseType);
		bulb9.info();
		
		boolean dimmable = true;
		Bulb bulb10 = new Bulb(wattage,lumens,brand,color,type,lifespanHours,voltage,baseType,dimmable);
		bulb10.info();
		
		String energyEfficiencyRating  = "A+"; 
		Bulb bulb11 = new Bulb(wattage,lumens,brand,color,type,lifespanHours,voltage,baseType,dimmable,energyEfficiencyRating);
		bulb11.info();
		
		int price = 40; 
		Bulb bulb12= new Bulb(wattage,lumens,brand,color,type,lifespanHours,voltage,baseType,dimmable,energyEfficiencyRating,price);
		bulb12.info();
	
	}
}