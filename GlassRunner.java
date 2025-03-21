class Glass{
	public static void details(String type, String material, String color, double weight, double capacity){
		System.out.println("Type:" + type + ",Material:" + material + ",Color:" + color + ",Weight:" + weight + ",Capacity:" + capacity);
	}
}
class Seller{
	public static void details(String name, String address, String phoneNumber, String email, double rating){
		System.out.println("Name:" + name + ",Address:" + address + ",PhoneNumber:" + phoneNumber + ",Email:" + email + ",Rating:" + rating);
	}
}
class Buyer{
	public static void details(String name,String address, String phoneNumber, String email,String purchaseHistory){
		System.out.println("Name:" + name + ",Address:" + address + ",PhoneNumber:" + phoneNumber + ",Email:" + email + ",PurchaseHistory:" + purchaseHistory);
	}
}
public class GlassRunner{
	public static void main(String[] args){
		Glass.details("Tumbler", "Glass", "Black",1.5,3.0);
		Seller.details("Linda Robert", "BTM", "123-456-7890", "Linda@mail.com", 4.5);
		Buyer.details("Lisa","Martahalli","125436987","Lisa@gmail.com","Tumbler");
	}
}