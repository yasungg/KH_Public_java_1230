package 배열에대한정렬;
//1차원 배열을 이용한 버블 정렬
public class ArraySort {
    public static void main(String[] args) {
        int[] array = {9,4,3,10,5,8,7,6,2,1};
        int tmp = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        for(int e : array) System.out.print(e + " ");
    }
}
