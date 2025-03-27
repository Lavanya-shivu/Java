class FloorRunner {  
    public static void main(String[] args) {  
        Floor floor = new Floor();  
        System.out.println("Floor type: " + floor.type);  
        System.out.println("Floor design: " + floor.design);  
        System.out.println("Floor Area: " + floor.area);  
        System.out.println("Floor color: " + floor.color);  

        floor.type = "tile";  
        floor.design = "marble pattern";  
        floor.area = 1000;  
        floor.color = "white with grey veins";  

        System.out.println("Updated Floor type: " + floor.type);  
        System.out.println("Updated design: " + floor.design);  
        System.out.println("Updated Area: " + floor.area);  
        System.out.println("Updated color: " + floor.color);  
    }  
}