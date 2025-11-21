public class Main {

    public static void EX1(int[][]matrix){
        System.out.println("Lower Triangular:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(j<=i){
                    System.out.print(matrix[i][j]+" ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println("Upper Triangular:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(j>=i){
                    System.out.print(matrix[i][j]+" ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void displayMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        EX1(matrix1);

        int[][] matrix2 = {{7, 8, 9}, {3, 2, 1}, {6, 5, 4}};
        EX1(matrix2);
    }
}
