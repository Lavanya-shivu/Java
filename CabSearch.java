class CabSearch {

    public static int getCostBySourceAndDestination(String source, String destination) {
        System.out.println("Searching cost from " + source + " to " + destination);

        if (source.equals("Downtown") && destination.equals("Airport")) {
            return 30; 
        } else if (source.equals("Airport") && destination.equals("Downtown")) {
            return 30; 
        } else if (source.equals("Mall") && destination.equals("Park")) {
            return 15; 
        } else if (source.equals("Park") && destination.equals("Mall")) {
            return 15; 
        } else if (source.equals("Hotel") && destination.equals("Beach")) {
            return 20; 
        } else if (source.equals("Beach") && destination.equals("Hotel")) {
            return 20; 
        } else {
            System.out.println("No available route found.");
            return 0; 
        }
    }

    public static int getDistanceBySourceAndDestination(String source, String destination) {
        System.out.println("Searching distance from " + source + " to " + destination);

        if (source.equals("Downtown") && destination.equals("Airport")) {
            return 15;
        } else if (source.equals("Airport") && destination.equals("Downtown")) {
            return 15; 
        } else if (source.equals("Mall") && destination.equals("Park")) {
            return 5; 
        } else if (source.equals("Park") && destination.equals("Mall")) {
            return 5; 
        } else if (source.equals("Hotel") && destination.equals("Beach")) {
            return 10; 
        } else if (source.equals("Beach") && destination.equals("Hotel")) {
            return 10; 
        } else {
            System.out.println("No available route found.");
            return 0; 
        }
    }

    public static void searchAvailability(String destination) {
        System.out.println("Searching availability for destination: " + destination);

        if (destination.equals("Airport")) {
            System.out.println("Cabs are available to the Airport.");
        } else if (destination.equals("Mall")) {
            System.out.println("Cabs are available to the Mall.");
        } else if (destination.equals("Park")) {
            System.out.println("Cabs are available to the Park.");
        } else if (destination.equals("Beach")) {
            System.out.println("Cabs are available to the Beach.");
        } else if (destination.equals("Hotel")) {
            System.out.println("Cabs are available to the Hotel.");
        } else {
            System.out.println("No cabs available to the destination.");
        }
    }

    public static void main(String[] args) {
   
        int cost = getCostBySourceAndDestination("Downtown", "Airport");
        System.out.println("Cost: $" + cost);

        int distance = getDistanceBySourceAndDestination("Mall", "Park");
        System.out.println("Distance: " + distance + " km");

        searchAvailability("Beach");
    }
}