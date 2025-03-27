class HairRunner {  
    public static void main(String[] args) {  
        Hair hair = new Hair();  
        System.out.println("Hair type: " + hair.type);  
        System.out.println("Hair color: " + hair.color);  
        System.out.println("Hair length: " + hair.length);  
        System.out.println("Hair isCurly: " + hair.isCurly);  

        Hair.type = "Wavy";  
        Hair.color = "Brown";  
        Hair.length = 15.2;  
        Hair.isCurly = false;  

        System.out.println("Updated hair type: " + hair.type);  
        System.out.println("Updated color: " + hair.color);  
        System.out.println("Updated length: " + hair.length);  
        System.out.println("Updated isCurly: " + hair.isCurly);  
    }  
}