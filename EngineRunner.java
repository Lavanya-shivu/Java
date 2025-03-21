class Engine{
	public static void details(String engineType, double displacement, int numCylinders, double bore, double stroke, double compressionRatio, String fuelType, double maxPower, double maxTorque,int redlineRPM, int idleRPM, String coolingSystem, boolean turbocharged, String fuelInjectionType, double fuelEfficiency, String ignitionSystem,String exhaustSystem, String valveConfiguration, String valveTiming,double weight, String material, double coolingFluidCapacity, double maxOperatingTemperature, String engineConfiguration, String manufacturer){
		System.out.println("Details of Engine");
		System.out.println("Engine Type: " + engineType); 
		System.out.println("Displacement: " + displacement);
		System.out.println("Number of Cylinders: " + numCylinders);
		System.out.println("Bore: " + bore);
		System.out.println("Stroke: " + stroke);
		System.out.println("Compression Ratio: " + compressionRatio);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Max Power Output: " + maxPower);
		System.out.println("Max Torque: " + maxTorque);
		System.out.println("Redline RPM: " + redlineRPM);
		System.out.println("Idle RPM: " + idleRPM);
		System.out.println("Cooling System: " + coolingSystem); 
		System.out.println("Turbocharged: " + (turbocharged ? "Yes" : "No"));
		System.out.println("Fuel Injection Type: " + fuelInjectionType);
		System.out.println("Fuel Efficiency: " + fuelEfficiency);
		System.out.println("Ignition System: " + ignitionSystem);
		System.out.println("Exhaust System: " + exhaustSystem);
		System.out.println("Valve Configuration: " + valveConfiguration);
		System.out.println("Valve Timing: " + valveTiming);
		System.out.println("Weight: " + weight);
		System.out.println("Material: " + material);
		System.out.println("Cooling Fluid Capacity: " + coolingFluidCapacity);
		System.out.println("Max Operating Temperature: " + maxOperatingTemperature); 
		System.out.println("Engine Configuration: " + engineConfiguration);
		System.out.println("Manufacturer: " + manufacturer);
	}
}
public class EngineRunner {
    public static void main(String[] args) {
        Engine.details(
            "V8", 
            5.0, 
            8, 
            92.0, 
            92.0, 
            10.5, 
            "Gasoline", 
            450, 
            500, 
            7000, 
            800, 
            "Liquid", 
            true, 
            "Direct Injection", 
            15.0, 
            "Coil-On-Plug", 
            "Dual Exhaust", 
            "DOHC", 
            "VVT", 
            200, 
            "Aluminum", 
            6.0, 
            90.0, 
            "Front-engine", 
            "Ford"
        );
    }
}