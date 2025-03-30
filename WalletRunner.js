class WalletRunner{
	public static void main(String args[]){
		
		Wallet wallet = new.Wallet();
		wallet.info();
		
		String brand = "Gucci"
		Wallet wallet2 = new.Wallet(brand);
		wallet2.info();
		
		int price = 2000;
		Wallet wallet3 = new.Wallet(brand,price);
		wallet3.info();
		
		int compartments = 10;
		Wallet wallet4 = new.Wallet(brand,price,compartments);
		wallet4.info();
		
		double quality = 4.8;
		Wallet wallet5 = new.Wallet(brand,price,compartments,quality);
		wallet5.info();
		
		boolean isWorth = true;
		Wallet wallet6 = new.Wallet(brand,price,compartments,quality,isWorth);
		wallet6.info();
		
		boolean isPoketfriendly = true;
		Wallet wallet7 = new.Wallet(brand,price,compartments,quality,isWorth,isPoketfriendly);
		wallet7.info();
		
		String material = "Leather";
		Wallete wallet8 = new.Wallet(brand,price,compartments,quality,isWorth,isPoketfriendly,material);
		wallete9.info();
		
		String color = "Black";
		Wallet wallet9 = new.Wallet(brand,price,compartments,quality,isWorth,isPoketfriendly,material,color);
		Wallet9.info();
		
		double width = 6.2;
		Wallet wallete10 = new.Wallet(brand,price,compartments,quality,isWorth,isPoketfriendly,material,color,width);
		wallete10.info();
		
		double thickness = 2.5;
		Wallet wallet11 =  new.Wallete(brand,price,compartments,quality,isWorth,isPoketfriendly,material,color,width,thickness);
		wallet11.info();
	}
}