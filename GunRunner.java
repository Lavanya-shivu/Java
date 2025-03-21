class Gun{
	public static void details(String type, String model, String caliber, int capacity, double weight, double length, String material, double price){
		System.out.println("Details of Gun");
		System.out.println("Type:" + type);
		System.out.println("Model:" + model);
		System.out.println("Caliber:" + caliber);
		System.out.println("Capacity:" + capacity);
		System.out.println("Weight:" + weight);
		System.out.println("Length:" + length);
		System.out.println("Material:" + material);
		System.out.println("Price:" + price);
	}
}
public class GunRunner{
	public static void main(String[] args){
		Gun.details("Glock 19", "Pistol", "9mm", 15, 0.65, 18.5, "Polymer", 600.00);
		Gun.details("M16", "Rifle", ".223", 30, 3.5, 100, "Steel", 1200.00);
	}
}