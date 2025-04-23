import java.util.List;
import java.util.ArrayList;

class N_Queen {
    public char[][] solveNQueens(int n) {
        char arr[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }

        return arr;

    }

    public static void main(String args[]) {
        int n = 4;
        char arr[][] = new N_Queen().solveNQueens(n);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
