class BedCRunner {  
    public static void main(String[] args) {  
        Bed bed = new Bed();  
        System.out.println("Bed type: " + bed.type);  
        System.out.println("Bed material: " + bed.material);  
        System.out.println("Bed storage: " + bed.storage);  
        System.out.println("Bed color: " + bed.color);  

        bed.type = "King";  
        bed.material = "wood";  
        bed.storage = True;  
        bed.color = "dark brown";  

        System.out.println("Updated Bed type: " + bed.type);  
        System.out.println("Updated material: " + bed.material);  
        System.out.println("Updated storage: " + bed.storage);  
        System.out.println("Updated color: " + bed.color);  
    }  
}