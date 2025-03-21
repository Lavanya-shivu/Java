//Factorial of Each Number in the Array
class Factorial{
	 public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        for (int num : arr) {
            System.out.println("Factorial of " + num + ": " + factorial(num));
        }
    }
    public static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
}