class Wheel{
	public static void details(String type, String material, String size, String rimType, String tireType,String pressure, String brand, String color, String weight, String design) {
        System.out.println("Type: " + type + ", Material: " + material + ", Size: " + size + ", Rim Type: " + rimType + ", Tire Type: " + tireType + ", Pressure: " + pressure + ", Brand: " + brand + ", Color: " + color + ", Weight: " + weight + ", Design: " + design);
    }
	}
	public class WheelRunner{
		public static void main(String[] args){
			System.out.println("Details of WheelRunner");
			Wheel.details("Sport", "Aluminum", "18 inches", "Alloy", "Tubeless", "30 PSI", "Michelin", "Black", "10 kg", "Spoke");
            Wheel.details("Mountain", "Carbon Fiber", "26 inches", "Steel", "Knobby", "35 PSI", "Goodyear", "Red", "12 kg", "Wide");
            Wheel.details("Road", "Aluminum", "25 inches", "Alloy", "Tubeless", "32 PSI", "Continental", "Silver", "9 kg", "Slim");
            Wheel.details("Hybrid", "Steel", "28 inches", "Double Wall", "Clincher", "30 PSI", "Schwalbe", "Blue", "11 kg", "Flat");
            Wheel.details("BMX", "Chrome Steel", "20 inches", "Mag", "Tube", "45 PSI", "Kenda", "Yellow", "7 kg", "Flat");
            Wheel.details("Racing", "Carbon Fiber", "29 inches", "Carbon", "Clincher", "50 PSI", "Pirelli", "Black", "8 kg", "Lightweight");
            Wheel.details("Cruiser", "Aluminum", "24 inches", "Single Wall", "Tube", "28 PSI", "Trek", "Green", "13 kg", "Large");
            Wheel.details("Electric", "Magnesium Alloy", "22 inches", "Alloy", "Tubeless", "40 PSI", "Maxxis", "White", "14 kg", "Sport");
            Wheel.details("Track", "Titanium", "700c", "Carbon", "Tubular", "55 PSI", "Michelin", "Orange", "6 kg", "Aerodynamic");
            Wheel.details("Fat Bike", "Steel", "26 inches", "Wide Rim", "Tubeless", "25 PSI", "Vee Tire", "Gray", "15 kg", "Heavy Duty");
		}
	}