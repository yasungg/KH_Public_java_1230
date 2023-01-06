package 다중어레이;
//2차원 배열 : 행과 열이 존재한다.
public class DoubleArray {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        int k = 20;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k += 10;
            }
        }
        for(int[] row : array) {
            for(int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
