public class Matrixaddition {
    public static void main(String[] args) {
        if(args.length!=1)
        {
            System.out.println("usage:JavaMatrixAddition");
            return;
        }
    
        int N=Integer.parseInt(args[0]);
        int[][]matrixA=new int[N][N];
        int[][]matrixB=new int[N][N];
        int[][]resultmatrix=new int[N][N];

        fillMatrix(matrixA,N);
        fillMatrix(matrixB,N);

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                resultmatrix[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }

        System.out.println("Matrix A:");
        printMatrix(matrixA,N);
        System.out.println("MAtrix B:");
        printMatrix(matrixB,N);
        System.out.println("Result Matrix:");
        printMatrix(resultmatrix,N);
    }

        private static void fillMatrix(int[][] matrix,int N)
        {
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    matrix[i][j]=(int)(Math.random()*100);
                }
            }
        }

        private static void printMatrix(int[][]matrix,int N)
        {
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                   System.out.print(matrix[i][j]+" "); 
                }
                System.out.println();
            }
            System.out.println();
    }
}
