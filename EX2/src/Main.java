public class Main {
    public static int[] EX2(int[][] matrix) {
        int n = matrix.length;
        int size = n * (n + 1) / 2;
        int[] arr = new int[size];
        for (int i = 0
             ; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int index=((i+1)*(i))/2+j;
                arr[index]=matrix[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] sym = {
                {10, 15, 20},
                {15, 30, 25},
                {20, 25, 40}
        };
        int[] result = EX2(sym);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            if(i==result.length-1){
                System.out.print(result[i]);
            }
            else{
                System.out.print(result[i]+",");
            }
        }
        System.out.print("]");
}
}