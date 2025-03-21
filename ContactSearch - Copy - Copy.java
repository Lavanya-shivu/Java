class ContactSearch {
    static long getMobileByEmail(String email) { 
        System.out.println("Running getMobileByEmail: " + email);

        if (email.equals ("lavanya.kapoor@gmail.com") )
		{
            return 8546991380L;
        } 
		
		else if (email.equals ("medha.sharma@gmail.com") )
		{
            return 123456789L;
        } 
		
		else if (email.equals ("chaithra.shetty@gmail.com") )
		{
            return 987654321L;
        } 
		
		else if (email.equals ("priya.kapoor@gmail.com"))
			{
            return 147852369L;
        } 
		
		else if (email.equals ("anusha.sharma@gmail.com"))
			{
            return 369852741L;
        } 
		
		else if (email.equals ("aquib.shetty@gmail.com"))
			{
            return 258794613L;
        } 
		
		else if (email.equals ("prashanth.kapoor@gmail.com") )
		{
            return 456987213L;
        } 
		
		else if (email.equals ("abu.sharma@gmail.com"))
			{
            return 741963258L;
        } 
		
		else if (email.equals ("mahesh.shetty@gmail.com") )
		{
            return 963147528L;
        } 
		
		else if (email.equals ("chirag.kapoor@gmail.com"))
			{
            return 4829655317L;
        } 
		
		else if (email.equals ("sneha.sharma@gmail.com") )
		{
            return 213564987L;
        }

		else if (email.equals("kirshna@gmail.com") )
		{
            return 845693217L;
        } 
		
		else if (email.equals ("venkata@gmail.com") )
		{
            return 125896347L;
        } 
		
		else if (email.equals ("poojitha.shetty@gmail.com"))
			{
            return 741238569L;
        } 
		
		else if (email.equals ("harshi@gmail.com") )
		{
            return 963214785L;
        } 
		
		else
			{
            System.out.println("No mobile number found");
            return 0;
        }
    }

    static String getEmailByName(String name) { 
        System.out.println("Running getEmailByName: " + name);

        if (name.equals("Lavanya Kapoor") )
		{
            return "lavanya.kapoor@gmail.com";
        }

		else if (name.equals ("Medha Sharma"))
			{
            return "medha.shetty@gmail.com";
        }

		else if (name.equals ("chaithra Shetty"))
			{
            return "chaithra.shetty@gmail.com";
        }

		else if (name.equals ("Priya Kapoor") )
		{
            return "priya.kapoor@gmail.com";
        } 
		
		else if (name.equals ("Anusha Sharma")) 
		{
            return "anusha.shetty@gmail.com";
        } 
		
		else if (name.equals ("Aquib Shetty"))
			{
            return "aquib.shetty@gmail.com";
        } 
		
		else if (name.equals ("Prashanth Kapoor") )
		{
            return "prashanth.kapoor@gmail.com";
        }

		else if (name.equals ("Abu Sharma"))
			{
            return "abu.sharma@gmail.com";
        } 
		
		else if (name.equals ("Mahesh Shetty") )
		{
            return "mahesh.shetty@gmail.com";
        }

		else if (name.equals ("Chirag Kapoor") )
		{
            return "chirag.kapoor@gmail.com";
        }

		else if (name.equals ("Sneha Sharma") )
		{
            return "sneha.sharma@gmail.com";
        } 
		
		else if (name.equals ("Kirshna") )
		{
            return "kirshna@gmail.com";
        }

		else if (name.equals ("Venkata"))
			{
            return "venkata@gmail.com";
        } 
		
		else if (name.equals ("Poojitha Shetty") )
		{
            return "poojitha.shetty@gmail.com";
        }

		else if (name.equals ("Harshi") )
		{
            return "harshi@gmail.com";
        } 
		
		else 
		{
            System.out.println("No email found");
            return null;
        }
    }
	
    static String[] searchByLastName(String name) { 
        System.out.println("Running searchByLastName: " + name);

        if (name.equals ("Kapoor") )
		{
            return new String[]{"Lavanya Kapoor", "Chirag Kapoor", "Prashanth Kapoor", "Priya Kapoor"};
        } 
		
		else if (name.equals ("Sharma"))
			{
            return new String[]{"Medha Sharma", "Sneha Sharma", "Anusha Sharma", "Abu Sharma"};
        } 
		
		else if (name.equals ("Shetty") )
		{
            return new String[]{"Poojitha Shetty", "Aquib Shetty", "Mahesh Shetty", "Chaithra Shetty"};
        } 
		
		else 
		{
            System.out.println("No records found");
            return new String[0];
        }
    }
public static void main(String[] args) {  
        long mobile = getMobileByEmail("lavanya.kapoor@gmail.com");
        System.out.println("Mobile: " + mobile);
		
        String email = getEmailByName("Lavanya Kapoor");
        System.out.println("Email: " + email);

        String[] searchResults = searchByLastName("Kapoor");
        System.out.println("Search Results:");
        for (String name : searchResults) {
            System.out.println(name);
        }
    }
}
