class Syringee{
	public static void main(String[] args){
    
    System.out.println("Details of Syringee");
	Syringee.details(10,"Insulin","Lisa");
	Syringee.details(20,"Adrenaline ","Jenny");
	Syringee.details(30,"Morphine","Rose");
	Syringee.details(40,"Heparin","Jiso");
	Syringee.details(50,"Naloxone ","Lilly");
	
}
    public static void details(int quantity, String medicineName, String nurseName){
    System.out.println("Quantity:" + quantity + "Medicne:" + medicineName + "Nurse:" + nurseName);
	}
}