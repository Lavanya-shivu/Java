class AK47Runner{
	public static void main(String args[]){
		
		AK47 ak47 = new AK47();
		ak47.info();
		
		String model = "AK-47";
		AK47 ak472 = new AK47(model);
		ak472.info();
		
		String caliber = "7.62×39mm";
		AK47 ak473 = new AK47(model,caliber);
		ak473.info();
		
		double weight = 4.3;
		AK47 ak474 = new AK47(model,caliber,weight);
		ak474.info();
		
		double length = 880;
		AK47 ak475 = new AK47(model,caliber,weight,length);
		ak475.info();
		
		int magazineCapacity = 30;
		AK47 ak476 = new AK47(model,caliber,weight,length,magazineCapacity);
		ak476.info();
		
		double rateOfFire = 600;
		AK47 ak477 = new AK47(model,caliber,weight,length,magazineCapacity,rateOfFire);
		ak477.info();
		
		double muzzleVelocity = 715;
		AK47 ak478 = new AK47(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity);
		ak478.info();
		
		double effectiveRange = 350;
		AK47 ak479 = new AK47(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity,effectiveRange);
		ak479.info();
		
		boolean isAutomatic = true;
		AK47 ak4710 = new AK47(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity,effectiveRange,isAutomatic);
		ak4710.info();
		
		String countryOfOrigin = "Soviet Union"; 
		AK47 ak4711 = new AK47(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity,effectiveRange,isAutomatic,countryOfOrigin);
		ak4711.info();
		
		int yearOfProduction = 1947;
		AK47 ak4712 = new AK47(model,caliber,weight,length,magazineCapacity,rateOfFire,muzzleVelocity,effectiveRange,isAutomatic,countryOfOrigin,yearOfProduction);
		ak4712.info();
		
	}
}