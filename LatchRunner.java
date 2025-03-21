class Latch{
	public static void details(String type, double price){
		System.out.println("Type:" + type + ",Price:$"+ price);
	}
}
public class LatchRunner{
	public static void main(String[] args){
		System.out.println("Details of Latch");
		Latch.details("CamLockLatch", 25.00);
		Latch.details("BoltOnLatch", 35.00);
		Latch.details("QuickReleaseLatch", 45.00);
	}
}