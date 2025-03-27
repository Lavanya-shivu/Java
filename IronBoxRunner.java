class IronBoxRunner {  
    public static void main(String[] args) {  
        IronBox ironbox = new IronBox();  
        System.out.println("IronBox brand: " + ironbox.brand);  
        System.out.println("IronBox plateMaterial: " + ironbox.plateMaterial);  
        System.out.println("IronBox power: " + ironbox.power);  
        System.out.println("IronBox hasSteamFunction: " + ironbox.hasSteamFunction);  

        IronBox.brand = "Philips";  
        IronBox.plateMaterial = "Ceramic";  
        IronBox.power = 1800W;  
        IronBox.hasSteamFunction = false;  

        System.out.println("Updated ironbox brand: " + ironbox.brand);  
        System.out.println("Updated plateMaterial: " + ironbox.plateMaterial);  
        System.out.println("Updated power: " + ironbox.power);  
        System.out.println("Updated hasSteamFunction: " + ironbox.hasSteamFunction);  
    }  
}