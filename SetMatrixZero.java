import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0, 1}, {1, 0}};
        setZeroes(matrix);
    }

    private static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> rowIndices = new ArrayList<>();
        List<Integer> colIndices =  new ArrayList<>();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == 0) {
                    rowIndices.add(i);
                    colIndices.add(j);
                }
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(rowIndices.contains(i) || colIndices.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }  
    }
}