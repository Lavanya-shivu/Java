class Bullet{
	public static void details(String caliber, String type, double weight, double velocity, String material){
		System.out.println("Details of Bullet");
		System.out.println("Caliber:" + caliber);
		System.out.println("Type:" + type);
		System.out.println("Weight:" + weight);
		System.out.println("Velocity:" + velocity);
		System.out.println("Material:" + material);
	}
}
public class BulletRunner{
	public static void main(String[] args){
		Bullet.details("9mm", "Full Metal Jacket", 115, 350, "Copper");
        Bullet.details(".223", "Hollow Point", 55, 1000, "Lead");
		
	}
}