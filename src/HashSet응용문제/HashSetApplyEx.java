package HashSet응용문제;

import java.util.*;

// 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래의 조건으로 정렬하기
// - 길이가 짧은것부터
// - 길이가 같으면 사전순으로
// - 같은 단어가 여러번 입력되면 한번씩만 출력
//13이라고 입력하면
//but I wont no more no more it cannot wait im yours
// i im it no but more wait wont yours cannot hesitate
public class HashSetApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어의 입력 개수
        String[] word = new String[n];
        for(int i = 0; i < word.length; i++) {
            word[i] = sc.next();
        }
        HashSet<String> hastSet = new HashSet<>(Arrays.asList(word)); //배열을 HashSet에 대입( 자동으로 중복 제거 )
        word = hastSet.toArray(new String[0]); // 배열의 크기를 0으로 지정하면 자동으로 배열 크기가 결정됨
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 반환값이 양수이면 정렬 조건
                } else {
                    return o1.length() - o2.length(); // 양수가 나오면 정렬 조건
                }
            }
        });
        System.out.println();
    }
}
