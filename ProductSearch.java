class ProductSearch {
    public static double getPriceByProduct(String productName) {
        System.out.println("Searching price for product: " + productName);
  
        if (productName.equals("laptop")) {
            return 800.00;
        } else if (productName.equals("smartphone")) {
            return 500.00;
        } else if (productName.equals("headphones")) {
            return 100.00;
        } else if (productName.equalsIgnoreCase("watch")) {
            return 150.00;
        } else if (productName.equals("tablet")) {
            return 350.00;
        } else if (productName.equals("camera")) {
            return 600.00;
        } else if (productName.equals("monitor")) {
            return 200.00;
        } else if (productName.equals("keyboard")) {
            return 50.00;
        } else if (productName.equals("mouse")) {
            return 25.00;
        } else if (productName.equals("charger")) {
            return 20.00;
        } else if (productName.equals("speaker")) {
            return 80.00;
        } else if (productName.equals("tv")) {
            return 400.00;
        } else if (productName.equals("microwave")) {
            return 120.00;
        } else if (productName.equals("vacuum")) {
            return 150.00;
        } else if (productName.equals("fridge")) {
            return 800.00;
        } else if (productName.equals("blender")) {
            return 50.00;
        } else if (productName.equals("air conditioner")) {
            return 300.00;
        } else if (productName.equals("washing machine")) {
            return 350.00;
        } else if (productName.equals("coffee maker")) {
            return 40.00;
        } else if (productName.equals("toaster")) {
            return 30.00;
        } else if (productName.equals("air fryer")) {
            return 90.00;
        } else if (productName.equals("hair dryer")) {
            return 25.00;
        } else {
            System.out.println("Product not found.");
            return 0.0;
        }
    }

    public static String[] getBrandsByProduct(String productName) {
        System.out.println("Searching brands for product: " + productName);
        
        if (productName.equals("laptop")) {
            return new String[] {"Dell", "HP", "Apple", "Lenovo"};
        } else if (productName.equals("smartphone")) {
            return new String[] {"Apple", "Samsung", "OnePlus", "Google"};
        } else if (productName.equals("headphones")) {
            return new String[] {"Sony", "Bose", "Sennheiser"};
        } else if (productName.equals("watch")) {
            return new String[] {"Fossil", "Apple", "Samsung", "Garmin"};
        } else if (productName.equals("tablet")) {
            return new String[] {"Apple", "Samsung", "Lenovo"};
        } else if (productName.equals("camera")) {
            return new String[] {"Canon", "Nikon", "Sony"};
        } else if (productName.equals("monitor")) {
            return new String[] {"Samsung", "LG", "Dell"};
        } else if (productName.equals("keyboard")) {
            return new String[] {"Logitech", "Corsair", "Razer"};
        } else if (productName.equals("mouse")) {
            return new String[] {"Logitech", "Razer", "SteelSeries"};
        } else if (productName.equals("charger")) {
            return new String[] {"Anker", "Aukey", "Samsung"};
        } else if (productName.equals("speaker")) {
            return new String[] {"JBL", "Bose", "Sony"};
        } else if (productName.equals("tv")) {
            return new String[] {"Samsung", "LG", "Sony"};
        } else if (productName.equals("microwave")) {
            return new String[] {"Samsung", "Panasonic", "LG"};
        } else if (productName.equals("vacuum")) {
            return new String[] {"Dyson", "Shark", "Bissell"};
        } else if (productName.equals("fridge")) {
            return new String[] {"Samsung", "Whirlpool", "LG"};
        } else if (productName.equals("blender")) {
            return new String[] {"Ninja", "Oster", "Hamilton Beach"};
        } else if (productName.equals("air conditioner")) {
            return new String[] {"LG", "Samsung", "Frigidaire"};
        } else if (productName.equals("washing machine")) {
            return new String[] {"Whirlpool", "Samsung", "LG"};
        } else if (productName.equals("coffee maker")) {
            return new String[] {"Keurig", "Ninja", "Cuisinart"};
        } else if (productName.equals("toaster")) {
            return new String[] {"Cuisinart", "Hamilton Beach", "Black+Decker"};
        } else if (productName.equals("air fryer")) {
            return new String[] {"Ninja", "Philips", "Cosori"};
        } else if (productName.equals("hair dryer")) {
            return new String[] {"Conair", "Revlon", "Remington"};
        } else {
            System.out.println("No brands found for the product.");
            return new String[0];
        }
    }

    public static void searchProductAvailability(String productName) {
        System.out.println("Searching availability for product: " + productName);
        
        if (productName.equals("laptop")) {
            System.out.println("Laptop is available in stock.");
        } else if (productName.equals("smartphone")) {
            System.out.println("Smartphone is available in stock.");
        } else if (productName.equals("headphones")) {
            System.out.println("Headphones are out of stock.");
        } else if (productName.equals("watch")) {
            System.out.println("Watch is available in stock.");
        } else if (productName.equals("tablet")) {
            System.out.println("Tablet is available in stock.");
        } else if (productName.equals("camera")) {
            System.out.println("Camera is out of stock.");
        } else if (productName.equals("monitor")) {
            System.out.println("Monitor is available in stock.");
        } else if (productName.equals("keyboard")) {
            System.out.println("Keyboard is available in stock.");
        } else if (productName.equals("mouse")) {
            System.out.println("Mouse is available in stock.");
        } else if (productName.equals("charger")) {
            System.out.println("Charger is available in stock.");
        } else if (productName.equals("speaker")) {
            System.out.println("Speaker is out of stock.");
        } else if (productName.equals("tv")) {
            System.out.println("TV is available in stock.");
        } else if (productName.equals("microwave")) {
            System.out.println("Microwave is available in stock.");
        } else if (productName.equals("vacuum")) {
            System.out.println("Vacuum is available in stock.");
        } else if (productName.equals("fridge")) {
            System.out.println("Fridge is available in stock.");
        } else if (productName.equals("blender")) {
            System.out.println("Blender is available in stock.");
        } else if (productName.equals("air conditioner")) {
            System.out.println("Air conditioner is available in stock.");
        } else if (productName.equals("washing machine")) {
            System.out.println("Washing machine is available in stock.");
        } else if (productName.equals("coffee maker")) {
            System.out.println("Coffee maker is available in stock.");
        } else if (productName.equals("toaster")) {
            System.out.println("Toaster is available in stock.");
        } else if (productName.equals("air fryer")) {
            System.out.println("Air fryer is available in stock.");
        } else if (productName.equals("hair dryer")) {
            System.out.println("Hair dryer is available in stock.");
        } else {
            System.out.println("Product not found or unavailable.");
        }
    }

    public static void main(String[] args) {
 
        double price = getPriceByProduct("laptop");
        System.out.println("Price: $" + price);

        String[] brands = getBrandsByProduct("smartphone");
        System.out.print("Brands: ");
        for (String brand : brands) {
            System.out.print(brand + " ");
        }
        System.out.println();

        searchProductAvailability("headphones");
    }
}
