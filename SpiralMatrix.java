import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        List<Integer> result = spiralOrder(matrix);
        printSpiralMatrix(result);
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;

        while(left <= right && top <= bottom) {
            // Print top row
            for(int i = left; i <= right; i ++) {
                result.add(matrix[top][i]);
            }

            // Move top row down
            top++;

            // Print right column
            for (int i  = top; i <= bottom ; i++) {
                result.add(matrix[i][right]);
            }

            // Move right column left
            right--;

            // Check if top is less than or equal to bottom and left is less than or equal to right
            if (!(top <= bottom && left <= right)) {
                break;
            }

            // Print bottom row
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }

            // Move bottom row up
            bottom--;

            // Print left column
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }

            // Move left column right
            left++;
        }

        return result;
    }

    private static void printSpiralMatrix(List<Integer> result) {
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }
    
}
