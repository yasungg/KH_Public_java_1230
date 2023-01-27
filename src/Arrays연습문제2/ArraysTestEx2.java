package Arrays연습문제2;
//Arrays sort() : Comparator 사용하기
//정렬은 기본적으로 오름차순 정렬
//임의의 10개 과일 이름의 배열 생성, 길이순으로 정렬하고 만약 길이가 같으면 사전순으로 정렬
//문자열 길이를비교하기 : length()
//compareTo() : 문자열을 ASCII코드값으로 비교해 결과를 양수/0/음수로반환
//반환값이 양수이면 정렬 조건이 되고 음수이면 현 상태 유지의 조건

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysTestEx2 {
    public static void main(String[] args) {
        //내림차순 정렬
        //Integer[] arr ={5,4,3,6,7,123,567,888};
        //Arrays.sort(arr);
        //Arrays.sort(arr, Collections.reverseOrder());
        //for(int e : arr) System.out.print(e + " ");

        //문자열 배열을 만들어 과일이름을 10개 생성
        String[] fruit = {"apple", "banana", "orange", "grape", "grapefruit", "strawberry", "cherry", "kiwi", "watermelon", "pineapple"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                else {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                        //첫번째가 두번째보다 사전 순서상 앞이면 양수
                    }
                    return -1;
                }

            }
        });
        System.out.println(Arrays.toString(fruit));
        String test = "abcd";
        System.out.println(test.compareTo("ab")); //양수
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abcbe")); // 음수
        System.out.println(test.compareTo("ac")); // 음수
    }
}
