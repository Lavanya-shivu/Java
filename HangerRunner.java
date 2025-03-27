class HangerRunner {  
    public static void main(String[] args) {  
        Hanger hanger = new Hanger();  
        System.out.println("Hanger design: " + hanger.design);  
        System.out.println("Hanger material: " + hanger.material);  
        System.out.println("Hanger quantity: " + hanger.quantity);  
        System.out.println("Hanger color: " + hanger.color);  

        Hanger.design = "Slim";  
        Hanger.material = "Plastic";  
        Hanger.quantity = 10;  
        Hanger.color = "Pink";  

        System.out.println("Updated Hanger design: " + hanger.design);  
        System.out.println("Updated material: " + hanger.material);  
        System.out.println("Updated quantity: " + hanger.pocket);  
        System.out.println("Updated color: " + hanger.color);  
    }  
}