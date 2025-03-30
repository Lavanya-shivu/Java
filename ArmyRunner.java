class ArmyRunner{
	public static void main(String args[]){
		
		Army army=new Army();
		army.info();
		
		String name = "Mukundan";
		Army army2=new Army(name);
		army2.info();
		
		int age = 42;
		Army army3 = new Army(name,age);
		army3.info();
		
		String baseLocation = "Kolkatha";
		Army army4 = new Army(name,age,baseLocation);
		army4.info();
		
		int yearsofserving = 12;
		Army army5 = new Army(name,age,baseLocation,yearsofserving);
		army5.info();
		
		String unit = "Squad";
	    Army army6 = new Army(name,age,baseLocation,yearsofserving,unit);
		army6.info();
		
		String rank = "Captain";
	    Army army7 = new Army(name,age,baseLocation,yearsofserving,unit,rank);
		army7.info();
		
		String weaponAssigned = "Ak47";
		Army army8 = new Army(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned);
		army8.info();
		
		boolean married = true;
		Army army9 = new Army(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned,married);
		army9.info();
		
		int serviceNumber = 502;
		Army army10 = new Army(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned,married,serviceNumber);
		army10.info();
		
		String branch = "military";
		Army army11 = new Army(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned,married,serviceNumber,branch);
		army11.info();
		
		boolean isOnDuty = false;
		Army army12 = new Army(name,age,baseLocation,yearsofserving,unit,rank,weaponAssigned,married,serviceNumber,branch,isOnDuty);
		army12.info();
	}
}