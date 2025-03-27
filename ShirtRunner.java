class ShirtRunner {  
    public static void main(String[] args) {  
        Shirt shirt = new Shirt();  
        System.out.println("Shirt design: " + shirt.design);  
        System.out.println("Shirt material: " + shirt.material);  
        System.out.println("Shirt pocket: " + pocket.storage);  
        System.out.println("Shirt color: " + shirt.color);  

        shirt.design = "striped";  
        shirt.material = "cotton";  
        shirt.pocket = True;  
        shirt.color = "Black";  

        System.out.println("Updated shirt design: " + shirt.design);  
        System.out.println("Updated material: " + shirt.material);  
        System.out.println("Updated pocket: " + shirt.pocket);  
        System.out.println("Updated color: " + shirt.color);  
    }  
}