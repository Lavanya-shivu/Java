class Bomb{
	public static void details(String type, double weight, double explosionPower, String detonationMethod, String material,double radius, int timer, double fuseLength, String activationCode, String manufacturer){	
	 System.out.println("Bomb Details:");
     System.out.println("Type: " + type);
     System.out.println("Weight: " + weight + " kg");
     System.out.println("Explosion Power: " + explosionPower + " tons of TNT");
     System.out.println("Detonation Method: " + detonationMethod);
     System.out.println("Material: " + material);
     System.out.println("Explosion Radius: " + radius + " meters");
     System.out.println("Timer: " + timer + " seconds");
     System.out.println("Fuse Length: " + fuseLength + " meters");
     System.out.println("Activation Code: " + activationCode);
     System.out.println("Manufacturer: " + manufacturer);
	}
}
public class BombRunner {
    public static void main(String[] args) {
        Bomb.details("Nuclear", 2000, 5000, "Remote", "Uranium", 1000, 30, 5, "123ABC", "USA");
        Bomb.details("Timed", 50, 10, "Timer", "Steel", 500, 60, 2, "456DEF", "Russia");
        Bomb.details("Pressure", 70, 100, "Pressure", "Titanium", 800, 20, 3, "789GHI", "China");
        Bomb.details("Incendiary", 25, 5, "Timer", "Aluminum", 300, 15, 1, "321JKL", "Germany");
        Bomb.details("Electromagnetic", 150, 200, "Remote", "Copper", 200, 40, 6, "654MNO", "India");
    }
}