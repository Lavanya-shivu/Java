class JamoonRunner {  
    public static void main(String[] args) {  
        Jamoon jamoon = new Jamoon();  
        System.out.println("Jamoon flavor: " + jamoon.flavor);  
        System.out.println("Jamoon size: " + jamoon.size);  
        System.out.println("Jamoon sweetnessLevel: " + jamoon.sweetnessLevel);  
        System.out.println("Jamoon cost: " + jamoon.cost);  

        Jamoon.flavor = "Cardamom";  
        Jamoon.size = "Medium";  
        Jamoon.sweetnessLevel = 7.5;  
        Jamoon.cost = 25;  

        System.out.println("Updated jamoon name: " + jamoon.name);  
        System.out.println("Updated showname: " + jamoon.showname);  
        System.out.println("Updated age: " + jamoon.age);  
        System.out.println("Updated married: " + jamoon.married);  
    }  
}