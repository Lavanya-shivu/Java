 class Wine {
    String name;  
    String type;                 
    String grapeVariety; 
    String region;       
    String country;              
    int vintageYear;              
    double alcoholContent;        
    String tasteNotes; 
    double bottleSize;             
    boolean isAged;             
    double price;
	
	public Wine(){
		
	}
	public Wine(String name){
		this.name=name;
	}
	public Wine(String name,String type){
		this(name);
		this.type=type;
	}
	public Wine(String name,String type, String grapeVariety){
	this(name,type);
	this.grapeVariety=grapeVariety;
	}
	public Wine(String name,String type,String grapeVariety,String region){
		this(name,type,grapeVariety);
		this.region=region;
	}
	public Wine(String name,String type,String grapeVariety,String region,String country){
		this(name,type,grapeVariety,region);
		this.country=country;
	}
	public Wine(String name,String type,String grapeVariety,String region,String country,int vintageYear){
		this(name,type,grapeVariety,region,country);
		this.vintageYear=vintageYear;
	}
	public Wine(String name,String type,String grapeVariety,String region,String country,int vintageYear,double alcoholContent){
		this(name,type,grapeVariety,region,country,vintageYear);
		this.alcoholContent=alcoholContent;
	}
	public Wine(String name,String type,String grapeVariety,String region,String country,int vintageYear,double alcoholContent,String tasteNotes){
		this(name,type,grapeVariety,region,country,vintageYear,alcoholContent);
		this.tasteNotes=tasteNotes;
	}
	public Wine(String name,String type,String grapeVariety,String region,String country,int vintageYear,double alcoholContent,String tasteNotes,double bottleSize){
		this(name,type,grapeVariety,region,country,vintageYear,alcoholContent,tasteNotes);
		this.bottleSize=bottleSize;
	}
	public Wine(String name,String type,String grapeVariety,String region,String country,int vintageYear,double alcoholContent,String tasteNotes,double bottleSize,boolean isAged){
		this(name,type,grapeVariety,region,country,vintageYear,alcoholContent,tasteNotes,bottleSize);
		this.isAged=isAged;
	}
	public Wine(String name,String type,String grapeVariety,String region,String country,int vintageYear,double alcoholContent,String tasteNotes,double bottleSize,boolean isAged,double price){
		this(name,type,grapeVariety,region,country,vintageYear,alcoholContent,tasteNotes,bottleSize,isAged);
		this.price=price;
	}
	public void info() {
		System.out.println("Wine name is" +this.name);
		System.out.println("Wine type is" +this.type);
		System.out.println("Wine grapeVariety is" +this.grapeVariety);
		System.out.println("Wine region is" +this.region);
		System.out.println("Wine country is" +this.country);
		System.out.println("Wine vintageYear is" +this.vintageYear);
		System.out.println("Wine alcoholContent is" +this.alcoholContent);
		System.out.println("Wine tasteNotes is" +this.tasteNotes);
		System.out.println("Wine bottleSize" +this.bottleSize);
		System.out.println("Wine isAged" +this.isAged);
		System.out.println("Wine price is" +this.price);
		System.out.println("\n-------------------------------\n");
	}	
	}
		