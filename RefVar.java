class RefVar{
	public static void main(String[] args){
		byte currentTemprature = 26;
		byte scheduledTemprature = 30;
		currentTemprature = scheduledTemprature;
		System.out.println(currentTemprature);
		
		short seatNumber = 05;
		short totalSeat = 60;
		seatNumber = totalSeat;
		System.out.println(seatNumber);
		
		int stockNumber = 2005;
		int sellingNumber = 1005;
		stockNumber = sellingNumber;
		System.out.println(stockNumber);
		
		long transactionNumber = 652489076L;
		long upiNumber = 105478236L;
		transactionNumber = upiNumber;
		System.out.println(transactionNumber);
		
		float dispensingFuel = 50.5f;
		float refillFuel = 101.2f;
		dispensingFuel = refillFuel;
		System.out.println(dispensingFuel);
		
		double bankBalance = 85000.05;
		double totalSavings = 95050.50;
		bankBalance = totalSavings;
		System.out.println(bankBalance);
		
		boolean isHot = false;
		boolean isCold = true;
		isHot = isCold;
		System.out.println(isCold);
		
		char messageStatus = 'S'; //sent
		char udateStatus = 'D'; //Deliverd
		messageStatus = udateStatus;
		System.out.println(messageStatus);
		
		String courseName = "Java";
		String trainerName = "Omkar";
		courseName = trainerName;
		System.out.println(courseName);
		
	}
}