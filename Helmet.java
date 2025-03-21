class Helmet{
	public static void details(String type, String protection, String material, String design, String comfort){
		System.out.println("Type:" + type + ",Protection:" + protection + ",Material:" + material + ",Design:" + design + ",Comfort:" + comfort);
	}
}
	public class HelmetRunner{
		public static void main(String[] args){
			System.out.println("Details of HelmetRunner");
			Helmet.details("Full Face", "High Protection", "Fiberglass", "Very Comfortable", "Aerodynamic");
            Helmet.details("Half Face", "Moderate Protection", "Plastic", "Comfortable", "Classic");
            Helmet.details("Open Face", "Moderate Protection", "Carbon Fiber", "Good Comfort", "Retro");
            Helmet.details("Motocross", "Extreme Protection", "Polycarbonate", "Good Comfort", "Bold");
            Helmet.details("Modular", "High Protection", "Aluminum", "Moderate Comfort", "Versatile");
		}
	}