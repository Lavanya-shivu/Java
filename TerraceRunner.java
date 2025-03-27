class TerraceRunner {
    public static void main(String[] args) {
        Terrace terrace = new Terrace(); 
		
        System.out.println("Terrace Type: " + terrace.type);
        System.out.println("Terrace Material: " + terrace.material);
        System.out.println("Terrace Area (sq ft): " + terrace.area);
        System.out.println("Terrace Color: " + terrace.color);

        terrace.type = "rooftop";
        terrace.material = "wooden deck";
        terrace.area = 500;
        terrace.color = "light brown";

        System.out.println("Updated Terrace Type: " + terrace.type);
        System.out.println("Updated Terrace Material: " + terrace.material);
        System.out.println("Updated Terrace Area (sq ft): " + terrace.area);
        System.out.println("Updated Terrace Color: " + terrace.color);
    }
}