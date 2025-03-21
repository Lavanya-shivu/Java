class Tiles{
	public static void details(String type, String material, String color, double size, double price){
		 System.out.println("Details of Tiles");
		 System.out.println("Type: " + type);
		 System.out.println("Material: " + material);
		 System.out.println("Color: " + color);
		 System.out.println("Size: " + size);
		 System.out.println("Price: $" + price);
	}
}
public class TilesRunner{
	public static void main(String[] args){
		Tiles.details("Ceramic", "Porcelain", "White", 0.5, 3.99);
        Tiles.details("Marble", "Natural Stone", "Beige", 1.0, 12.50);
        Tiles.details("Wooden", "Wood", "Brown", 0.75, 5.49);
        Tiles.details("Glass", "Glass", "Transparent", 0.4, 8.99);
        Tiles.details("Slate", "Natural Stone", "Dark Gray", 0.6, 7.49);
	}
}