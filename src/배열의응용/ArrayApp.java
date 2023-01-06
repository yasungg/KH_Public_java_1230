package 배열의응용;
//배열의 복사 : 원칙적으로 자바에서 배열은 한 번 생성하면 크기를 변경할 수 없다.
//            하지만, 배열의 복사를 통해 크기를 변경할 수 있다.
import java.util.Arrays;
public class ArrayApp {
    //ArrayCopy() : 배열 값을 복사할 때 사용한다.
    //사용하는 방법이 매우 까다롭다.
    //System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
    //copyOf() : 배열을 원하는 길이만큼 새로운 배열로 복사
    //얕은 복사와 깊은 복사
    int[] array1 = {1,2,3,4};
    int[] array2 = array1;
    array1[0] = 100;
    for(int e : array1) System.out.print(e + " ");
    System.out.println();

    for(int e : array2) System.out.print(e + " ");
}
