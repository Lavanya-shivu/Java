class Army{
	String name;
	int age;
	String baseLocation;
	int yearsofserving;
	String unit;
	String rank;
	String weaponAssigned ;
	boolean married;
	int serviceNumber;
	String branch;
	boolean isOnDuty ;
	
	public Army(){		
	}
	public Army(String name){
		this.name=name;
	}
	public Army(String name, int age){
		this(name);
		this.age=age;
	}
	public Army(String name, int age, String baseLocation){
		this(name,age);
		this.baseLocation=baseLocation;
	}
	public Army(String name, int age, String baseLocation, int yearsofserving){
		this(name,age,baseLocation);
	this.yearsofserving=yearsofserving;
	}
	public Army(String name, int age, String baseLocation, int yearsofserving, String unit){
		this(name,age,baseLocation,yearsofserving);
		this.unit=unit;
	}
	public Army(String name, int age, String baseLocation, int yearsofserving, String unit, String rank){
		this(name,age,baseLocation,yearsofserving,unit);
		this.rank=rank;
	}
	public Army(String name, int age, String baseLocation, int yearsofserving, String unit, String rank, String weaponAssigned){
		this(name,age,baseLocation,yearsofserving,unit,rank);
		this.weaponAssigned=weaponAssigned;
	}
	public Army(String name, int age, String baseLocation, int yearsofserving, String unit, String rank, String weaponAssigned, boolean married){
		this(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned);
		this.married=married;
	}
	public Army(String name, int age, String baseLocation, int yearsofserving, String unit, String rank, String weaponAssigned, boolean married, int serviceNumber){
		this(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned,married);
		this.serviceNumber=serviceNumber;
	}
	public Army(String name, int age, String baseLocation, int yearsofserving, String unit, String rank, String weaponAssigned, boolean married, int serviceNumber, String branch){
		this(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned,married,serviceNumber);
		this.branch=branch;
	}
	public Army(String name, int age, String baseLocation, int yearsofserving, String unit, String rank, String weaponAssigned, boolean married, int serviceNumber, String branch, boolean isOnDuty){
		this(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned,married,serviceNumber,branch);
		this.isOnDuty=isOnDuty;
		
	}
	public void info(){
		System.out.println("Army name is" +this.name);
		System.out.println("Army age is" +this.age);
		System.out.println("Army baseLocation is" +this.baseLocation);
		System.out.println("Army yearsofserving is" +this.yearsofserving);
		System.out.println("Army unit is" +this.unit);
		System.out.println("Army rank is" +this.rank);
		System.out.println("Army weaponAssigned is" +this.weaponAssigned);
		System.out.println("Army married is" +this.married);
		System.out.println("Army serviceNumber is" +this.serviceNumber);
		System.out.println("Army branch is" +this.branch);
		System.out.println("Army isOnDuty" +this.isOnDuty);
		System.out.println("\n-------------------------------\n");
		
	}
}