class AnchorRunner {  
    public static void main(String[] args) {  
        Anchor anchor = new Anchor();  
        System.out.println("Anchor name: " + anchor.name);  
        System.out.println("Anchor showname: " + anchor.showname);  
        System.out.println("Anchor age: " + anchor.age);  
        System.out.println("Anchor married: " + anchor.married);  

        Anchor.name = "Suma";  
        Anchor.showname = "sumaAdda";  
        Anchor.age = 45;  
        Anchor.married = True;  

        System.out.println("Updated anchor name: " + anchor.name);  
        System.out.println("Updated showname: " + anchor.showname);  
        System.out.println("Updated age: " + anchor.age);  
        System.out.println("Updated married: " + anchor.married);  
    }  
}