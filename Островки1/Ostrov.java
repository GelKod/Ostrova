import java.io.Serializable;
import java.util.Random;

public class Ostrov implements Serializable {
    private int[][] matrix;

    public Ostrov(int a, int b) {
        Random r = new Random();
        matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = r.nextInt();
            }
        }
    }

    public void setE(int a, int b, int c) {
        matrix[a][b] = c;
    }

    public int getE(int a, int b) {
        return matrix[a][b];
    }

    public int getR() {
        return matrix.length;
    }

    public int getC() {
        return matrix[0].length;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] a) {
        matrix = a;
    }

    public static int too(int[][] m) {
        Boolean flag = false;
        int k = 1;
        int number = 0;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m[0].length - 1; j++) {
                int tmp = i;
                int temp = j;
                k = 1;
                flag = false;
                while (tmp < m.length - 1 && temp < m[0].length - 1 && m[i][j] == m[tmp][temp + 1]
                        && m[i][j] == m[tmp + 1][temp]
                        && m[i][j] == m[tmp + 1][temp + 1]) {
                    k++;
                    tmp++;
                    temp++;
                    flag = true;
                }
                if (flag) {
                    for (int l = i; l < i + k; l++) {
                        for (int h = j; h < j + k; h++) {
                            if (!(m[i][j] == m[l][h])) {
                                flag = false;
                            }
                        }
                    }
                }
                if (flag) {
                    if (!(i < 0 && j < 0 && i + k >= m.length - 1 && j + k >= m[0].length - 1)) {
                        if (!(i <= 0)) {
                            for (int g = j; g < j + k; g++) {
                                if (m[i][j] == m[i - 1][g]) {
                                    flag = false;
                                }
                            }
                            if (!(j <= 0)) {
                                if (m[i][j] == m[i - 1][j - 1]) {
                                    flag = false;
                                }
                            }
                        }
                        if (!(j <= 0)) {
                            for (int g = i; g < i + k; g++) {
                                if (m[i][j] == m[g][j - 1]) {
                                    flag = false;
                                }
                            }
                            if (!(i + k > m.length - 1)) {
                                if (m[i][j] == m[i + k][j - 1]) {
                                    flag = false;
                                }
                            }
                        }
                        if (!(j + k > m[0].length - 1)) {
                            for (int g = i; g < i + k; g++) {
                                if (m[i][j] == m[g][j + k]) {
                                    flag = false;
                                }
                            }
                            if (!(i <= 0)) {
                                if (m[i][j] == m[i - 1][j + k]) {
                                    flag = false;
                                }
                            }
                        }
                        if (!(i + k > m.length - 1)) {
                            for (int g = j; g < j + k; g++) {
                                if (m[i][j] == m[i + k][g]) {
                                    flag = false;
                                }
                            }
                            if (!(j + k > m[0].length - 1)) {
                                if (m[i][j] == m[i + k][j + k]) {
                                    flag = false;
                                }
                            }
                        }
                    }
                }
                if (flag) {
                    number++;
                }
                System.out.println(flag);
            }
        }
        return number;
    }
}
