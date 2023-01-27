package Map기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap : 키와 값의 한 쌍(pair)으로 구성되어 있음. 키는 중복될 수 없고 값은 중복 가능
//키의 중복 여부 확인은 HashCode를 이용해서 확인함.
//Hash 알고리즘의 특징은 키 값을 해시함수의 입력으로 전달하여 정수값의 결과를 반환함.
public class MapTestEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        /*//객체 추가
        map.put("Americano", 2500);
        map.put("Latte", 4000);
        map.put("Mocca", 4500);
        //객체 삭제
        map.remove("Latte");
        //객체 찾기
        System.out.println(map.get("Moca"));*/
        //객체 저장
        map.put("유지민", 24);
        map.put("이지은", 30);
        map.put("박채영", 26);
        map.put("이지은", 31); // 키값이 같기 때문에 나중에 들어온 값으로 대체가 된다.
        System.out.println("총 인원 : " + map.size()); //맵의 객체 수 확인
        System.out.println(map.get("유지민")); // 맵의 객체 찾기. 값으로 반환.
        //map 요소 순회 방법
        //1. 반복자 이용 iterator
        /*Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);*/
        //2. 향상된 for문을 이용하는 방법
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        map.remove("이지은"); // 키로 Map.entry 제거
        System.out.println("총 인원 : " + map.size());
        //요소 수정하기 map.replace()를 이용해서 값을 수정하기
        map.replace("유지민", 97);
        map.clear(); // 객체 전체 삭제. 맵 자체가 지워지는 것은 아니다.
    }
}

