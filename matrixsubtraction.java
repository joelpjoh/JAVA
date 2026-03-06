import java.util.Scanner;

public class matrixsubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the number of rows for Matrix 1:");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix 1:");
        int cols1 = scanner.nextInt();
        
        
        System.out.println("\nEnter the number of rows for Matrix 2:");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix 2:");
        int cols2 = scanner.nextInt();
        
        
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("\nError: Matrices must have the same dimensions for subtraction!");
            System.out.println("Matrix 1: " + rows1 + "x" + cols1);
            System.out.println("Matrix 2: " + rows2 + "x" + cols2);
            scanner.close();
            return;
        }
        
        
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        

        System.out.println("\n--- Enter elements for Matrix 1 ---");
        matrix1 = readMatrix(scanner, rows1, cols1, "Matrix 1");
        
        
        System.out.println("\n--- Enter elements for Matrix 2 ---");
        matrix2 = readMatrix(scanner, rows2, cols2, "Matrix 2");
        
    
        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);
        
        
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
        
        
        int[][] result = subtractMatrices(matrix1, matrix2);
        
    
        System.out.println("\n--- Matrix Subtraction Result (Matrix 1 - Matrix 2) ---");
        displayMatrix(result);
        
        scanner.close();
    }
    
    
    public static int[][] readMatrix(Scanner scanner, int rows, int cols, String matrixName) {
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixName + " [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }
}
