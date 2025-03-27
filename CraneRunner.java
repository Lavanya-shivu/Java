class CraneRunner {  
    public static void main(String[] args) {  
        Crane crane= new Crane  ();  
        System.out.println("Crane model: " + crane.model);  
        System.out.println("Crane maxLoadCapacity: " + crane.maxLoadCapacity);  
        System.out.println("Crane height: " + crane.height);  
        System.out.println("Crane isOperational: " + crane.isOperational);  

        Crane.model= "XCMG";  
        Crane.maxLoadCapacity = "45";  
        Crane.height = "30";  
        Crane.isOperational = true;  

        System.out.println("Updated crane model: " + crane.model);  
        System.out.println("Updated maxLoadCapacity: " + crane.maxLoadCapacity);  
        System.out.println("Updated height: " + crane.height);  
        System.out.println("Updated isOperational: " + crane.isOperational);  
    }  
}