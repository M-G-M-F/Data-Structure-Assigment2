
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] arr2 = {1, 3, 4, 9, 5, 4};
        if (EX3_itr(arr1)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        if (EX3_itr(arr2)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
    public static boolean EX3_itr(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
        if(arr[i] < arr[i-1]) {
            return false;
        }
        }
        return true;
}
}
