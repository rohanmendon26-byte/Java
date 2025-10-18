public class prog1 {
    public static void main(String args[]) 
    {
        if (args.length != 1) 
        {
            System.out.println("Usage: java prog1 <N>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int[][] matrixA = new int[N][N];
        int[][] matrixB = new int[N][N];
        int[][] resultMatrix = new int[N][N];

        fillMatrix(matrixA, N);
        fillMatrix(matrixB, N);

        // Add matrices
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < N; j++) 
            {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Matrix A:");
        printMatrix(matrixA, N);

        System.out.println("Matrix B:");
        printMatrix(matrixB, N);

        System.out.println("Sum of matrices A and B:");
        printMatrix(resultMatrix, N);
    }

    private static void fillMatrix(int[][] matrix, int N) 
    {
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < N; j++) 
            {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    private static void printMatrix(int[][] matrix, int N) 
    {
        for (int i = 0; i < N; i++)
         {
            for (int j = 0; j < N; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
