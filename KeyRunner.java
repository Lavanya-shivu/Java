class Key {
    public static void details(String type, String material, String purpose) {
        System.out.println("Key Details:");
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Purpose: " + purpose);
    }
}
public class KeyRunner {
    public static void main(String[] args) {
        Key.details("House Key", "Brass", "Unlocks front door");
        Key.details("Car Key", "Steel", "Starts the car");
        Key.details("Locker Key", "Aluminum", "Unlocks a storage locker");
    }
}