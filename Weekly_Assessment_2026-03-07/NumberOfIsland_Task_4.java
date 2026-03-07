public class NumberOfIsland_Task_4 {
    

    public static int numIslands(char[][] mat) {
        int c = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == '1') {
                    c++;
                    d(mat, i, j);
                }
            }
        }

        return c;
    }

    public static void d(char[][] mat, int i, int j) {
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == '0') {
            return;
        }

        mat[i][j] = '0';

        d(mat, i + 1, j);
        d(mat, i - 1, j);
        d(mat, i, j + 1);
        d(mat, i, j - 1);
    }

    public static void main(String[] args) {
        char[][] mat = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println(numIslands(mat));
    }
}

