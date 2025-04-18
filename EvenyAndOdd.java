//Count of Even and Odd Numbers in the Array
class EvenyAndOdd{
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}