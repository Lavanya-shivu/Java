//Program to Display the Sum of All the Elements in a Given Array
class SumOfElements{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        
        System.out.println("Sum of all elements: " + sum);
    }
}