//Program to Check if a Given Target Number Exists in the Array
class TargetExits{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Target " + target + " is present in the array.");
        } else {
            System.out.println("Target " + target + " is not present in the array.");
        }
    }
}