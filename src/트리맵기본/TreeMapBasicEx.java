package 트리맵기본;

import java.util.Map;
import java.util.TreeMap;

//TreeMap은 TreeSet과 마찬가지고 이진 검색 트리로 구현되어 있음.
//TreeSet과의 차이는 키와 값으로 구성된 Map.Entry를 저장
//부모키값 기준으로 작은건 왼쪽 큰건 오른쪽에 저장
public class TreeMapBasicEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(87, "박채영");
        score.put(88, "안유진");
        score.put(75, "김채원");
        score.put(65, "김지수");
        score.put(98, "유지민");
        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry();// Map.entry 가장 낮은 값을 리턴
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lastEntry(); // Map.entry 가장 높은 값을 리턴
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lowerEntry(95); // 주어진 키 값의 바로 아래 값을 리턴
        System.out.println("95 바로 아래 값 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.higherEntry(65); // 주어진 키 값의 바로 위 값을 리턴
        System.out.println("95 바로 위 값 : " + entry.getKey() + " : " + entry.getValue());
    }



}
