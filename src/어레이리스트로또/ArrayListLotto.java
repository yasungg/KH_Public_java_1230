package 어레이리스트로또;
//ArrayList를 활용해 중복제거

import java.util.ArrayList;
import java.util.List;
public class ArrayListLotto {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //어레이리스트는 배열과 다르게 크기를 지정할 필요가 없음
        int tmp; //로또 번호를 생성해 임시 저장
        while(true) {
            tmp = (int)((Math.random() * 45) + 1); // 1~ 45 사이의 임의의 숫자 생성
            if(!list.contains(tmp)) {
                list.add(tmp);
            }
            if(list.size() == 6) break;
        }
        for(int e : list) System.out.println( e + " ");
    }
}
