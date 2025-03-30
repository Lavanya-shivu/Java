class WineRunner{
	public static void main(String args[]){
		
		Wine wine=new Wine();
		wine.info();	
		
		String name = "Cabernet Sauvignon";
		Wine wine2 = new Wine(name);
		wine2.info();
		
		String type = "Red";
		Wine wine3 = new Wine(name,type);
		wine3.info();
		
		String grapeVariety = "Cabernet Sauvignon";
		Wine wine4 = new Wine(name,type,grapeVariety);
		wine4.info();
		
		String region = "Napa Valley";
		Wine wine5 = new Wine(name,type,grapeVariety,region);
		wine5.info();
		
		String country = "USA";
		Wine wine6 = new Wine(name,type,grapeVariety,region,country);
		wine6.info();
		
		int vintageYear = 2018;
		Wine wine7 = new Wine(name,type,grapeVariety,region,country,vintageYear);
		wine7.info();
		
		double alcoholContent = 14.5;
		Wine wine8 = new Wine(name,type,grapeVariety,region,country,vintageYear,alcoholContent);
		wine8.info();
		
		String tasteNotes = "Blackcurrant, oak, vanilla";
		Wine wine9 = new Wine(name,type,grapeVariety,region,country,vintageYear,alcoholContent,tasteNotes);
		wine9.info();
		
		double bottleSize = 750;
		Wine wine10 = new Wine(name,type,grapeVariety,region,country,vintageYear,alcoholContent,tasteNotes,bottleSize);
		wine10.info();
		
		boolean isAged = true; 
		Wine wine11 = new Wine(name,type,grapeVariety,region,country,vintageYear,alcoholContent,tasteNotes,bottleSize,isAged);
		wine11.info();
		
		double price = 45.99;
		Wine wine12 = new Wine(name,type,grapeVariety,region,country,vintageYear,alcoholContent,tasteNotes,bottleSize,isAged,price);
		wine12.info();
	}
	
}