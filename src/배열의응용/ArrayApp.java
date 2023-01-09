package 배열의응용;
//배열의 복사 : 원칙적으로 자바에서 배열은 한 번 생성하면 크기를 변경할 수 없다.
//            하지만, 배열의 복사를 통해 크기를 변경할 수 있다.
import java.util.Arrays;
public class ArrayApp {
    public static void main(String[] args) {
        //ArrayCopy() : 배열 값을 복사할 때 사용한다.
        //사용하는 방법이 매우 까다롭다.
        //System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        //copyOf() : 배열을 원하는 길이만큼 새로운 배열로 복사
        //얕은 복사와 깊은 복사
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[array1.length];
        //System.arraycopy(array1,0 , array2, 0, array1.length)
        //int[] array2 = array1; //여기서 주소가 복사되기 때문에 얕은복사가 일어남.
        //int[] array2 = Arrays.copyOf(array1, array1.length); //실제 값이 복사되는 깊은복사
        for(int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        array1[0] = 100;
        for(int e : array1) System.out.print(e + " ");
        System.out.println();
        for(int e : array2) System.out.print(e + " ");
    }

}
