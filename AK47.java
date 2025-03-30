 class AK47 {
    String model;            
    String caliber;      
    double weight;               
    double length;                
    int magazineCapacity;          
    double rateOfFire;            
    double muzzleVelocity;        
    double effectiveRange;        
    boolean isAutomatic;         
    String countryOfOrigin;  
    int yearOfProduction; 
	
	public AK47(){
		
	}
	public AK47(String model){
		this.model=model;
	}
	public AK47(String model,String caliber){
		this(model);
		this.caliber=caliber;
	}
	public AK47(String model,String caliber,double weight){
		this(model,caliber);
		this.weight=weight;
	}
	public AK47(String model,String caliber,double weight,double length){
		this(model,caliber,weight);
		this.length=length;
	}
	public AK47(String model,String caliber,double weight,double length,int magazineCapacity){
		this(model,caliber,weight,length);
		this.magazineCapacity=magazineCapacity;
	}
	public AK47(String model,String caliber,double weight,double length,int magazineCapacity,double rateOfFire){
		this(model,caliber,weight,length,magazineCapacity);
		this.rateOfFire=rateOfFire;
	}
	public AK47(String model,String caliber,double weight,double length,int magazineCapacity,double rateOfFire,double muzzleVelocity){
		this(model,caliber,weight,length,magazineCapacity,rateOfFire);
		this.muzzleVelocity=muzzleVelocity;
	}
	public AK47(String model,String caliber,double weight,double length,int magazineCapacity,double rateOfFire,double muzzleVelocity,double effectiveRange){
		this(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity);
		this.effectiveRange=effectiveRange;
	}
	public AK47(String model,String caliber,double weight,double length,int magazineCapacity,double rateOfFire,double muzzleVelocity,double effectiveRange,boolean isAutomatic){
		this(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity,effectiveRange);
		this.isAutomatic=isAutomatic;
	}
	public AK47(String model,String caliber,double weight,double length,int magazineCapacity,double rateOfFire,double muzzleVelocity,double effectiveRange,boolean isAutomatic, String countryOfOrigin){
		this(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity,effectiveRange,isAutomatic);
		this.countryOfOrigin=countryOfOrigin;
	}
	public AK47(String model,String caliber,double weight,double length,int magazineCapacity,double rateOfFire,double muzzleVelocity,double effectiveRange,boolean isAutomatic, String countryOfOrigin,int yearOfProduction){
		this(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity,effectiveRange,isAutomatic,countryOfOrigin);
		this.yearOfProduction=yearOfProduction;
	}
	public void info() {
		System.out.println("AK47 model is" +this.model);
		System.out.println("AK47 caliber is" +this.caliber);
		System.out.println("AK47 weight is" +this.weight);
		System.out.println("AK47 length is" +this.length);
		System.out.println("AK47 magazineCapacity is" +this.magazineCapacity);
		System.out.println("AK47 rateOfFire is" +this.rateOfFire);
		System.out.println("AK47 muzzleVelocity is" +this.muzzleVelocity);
		System.out.println("AK47 effectiveRange is" +this.effectiveRange);
		System.out.println("AK47 isAutomatic" +this.isAutomatic);
		System.out.println("AK47 countryOfOrigin" +this.countryOfOrigin);
		System.out.println("AK47 yearOfProduction is" +this.yearOfProduction);
		System.out.println("\n-------------------------------\n");
	}	
	}