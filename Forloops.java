class Forloops {
    public static void main(String[] args) {
        String[] shirts = {"Printed Shirt", "Casual Shirts", "Fancy Shirts", "Formal Shirt", "Stipr shirt"};
        for (int i = 0; i < shirts.length; i++) {
            System.out.println("Shirts: " + shirts[i]);
        }



//Clips
        String[] clips = {"Cluture Clips", "Banana Clips", "Clothes Clips", "Flower Clips", "chatpat Clips"};
        for (int index = 0; index < clips.length; index++) {
            System.out.println("Clips: " + clips[index]);
        }
        
    
// Paints

        String[] paints = {"Water Paints", "Oil Paints", "Wall Paints", "Color Paints", "Nail Paints"};
        for (int j = 0; j < paints.length; j++) {
            System.out.println("Paints: " + paints[j]);
        }

  // Wires
        String[] wires = {"Cable Wire","Copper Wire","Fish Wire", "Toungstun Wire", "Plastic Wire"};
        for (int k = 0; k < wires.length; k++) {
            System.out.println("Wires: " + wires[k]);
        }


//walls
        String[] walls = {"Interior Wall", "Concrete Wall", "Wooden Wall", "Stone Wall", "Brick Wall",};
        for (int h = 0; h < walls.length; h++) {
            System.out.println("Walls: " + walls[h]);
        }
        
 
//papers

        String[] papers = {"Craft Paper","Matte Paper", "A4 Paper", "Tissue Paper", "Photo Paper"};
        for (int m = 0; m < papers.length; m++) 
		{
		System.out.println("Papers: " + papers[m]); 
		}


//wallets
        String[] wallets = {"Pocket Wallet","Leather Wallet", "Mens Wallet", "Womens Wallet","Cluture Wallet"};
        for (int w = 0; w < wallets.length; w++) {
            System.out.println("Wallets: " + wallets[w]);
        }
        

//posters
        String[] posters = {"Movie Poster", "Advertisement Poster", "Event Poster", "Gaming Poster", "Educational Poster"};
        for (int post = 0; post < posters.length; post++) {
            System.out.println("Poster: " + posters[post]);
        }
        
    }
}

         // for-each loop//
		 
class Foreachloops {
    public static void main(String[] args) {
        String[] coins = {"Penny", "Rupees", "Quarter", "Half Dollar","Bucks"};
        for (String coin : coins) {
            System.out.println("Coinname: " + coin);
        }
        

//Note 
       String[] notes = {"10rupeesnote","20rupeesnote","50rupeesnote","100rupeesnote","200rupeesnote"};
        for(String note:notes)
	    {
		 System.out.println("Notename:" +note);
	    }
	     

//watches
	    String[] watches = {"Digital Watch", "Analog Watch", "Smartwatch", "Luxury Watch", "Sports Watch"};
	     for(String watch:watches)
		 {
			 System.out.println("Watchname:" +watch);
		 }
		 
		
//cameras		
        String[] cameras = {"DSLR", "Mirrorless", "Action Camera", "Instant Camera", "Security Camera"};
		for(String camera:cameras)
		{
			System.out.println("Cameraname:" +camera);
		}
		
		
//games
        String[] games = {"Chess", "Cricket", "Football", "Badminton", "Basketball"};
		for(String game :games)
		{
			System.out.println("Gamename:" + game);
		}
		
		
//bags
        String[] bags = {"Sling Bag", "Handbag", "Laptop Bag", "Travel Bag", "Backpack Bag"};
		for(String bag:bags)
		{
			System.out.println("Bagname:" + bag);
		}
		
		
//pots
        String[] pots = {"Cooking  Pot", "Ceramic Pot", "Clay Pot", "Gardening Pot", "Decorative Pot"};
		for(String pot: pots)
		{
			System.out.println("Potname:" + pot);
		}
		
		
//routers
        String[] routers = {"Networking Router", "Woodworking  Router", "Gaming Router", "4G Router", "WiFi Router",};
		for(String router:routers)
		{
			System.out.println("Routersname:" + router);
		}
    }
}