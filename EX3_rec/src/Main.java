
 public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] arr2 = {1, 3, 4, 9, 5, 4};
        if (EX3_rec(arr1, 1)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        if (EX3_rec(arr2, 1)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        }
    public static boolean EX3_rec(int[] arr,int index) {
        if (index >= arr.length) {
            return true;
        }
        if(arr[index] < arr[index-1]) {
            return false;
        }
        return EX3_rec(arr, index+1);
    }
    }
