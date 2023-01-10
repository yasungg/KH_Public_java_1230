package StringKMP;

import java.util.Scanner;

//입력 : Knuth-Morris-Pratt
//출력 : KMP
//1. split() 메소드 출력
//2. charAt() 메소드 이용해 대문자만 추출
//3. 0번째 문자를 출력하고, '-'이후 문자를 출력하는 방법
//4. 문자 배열 후 출력하기.
public class StringKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your name");
        String name = sc.next();

        /*1번풀이 String[] splitName = name.split("-");// '-' 기준으로 문자열을 작은 문자열로 만듦.
        for(String e : splitName) { //향상된 for문으로 문자열 배열을 순회함.
        System.out.print(e.charAt(0)); //해당 문자열의 0번 인덱스를 추출.
          }
        }*/

        /*2번풀이 for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) <'Z' && name.charAt(i) > 'A') {
                System.out.print(name.charAt(i));
            }
        }*/
        /*3번풀이 for(int i = 0; i < name.length(); i++) {
            if(i == 0) {System.out.print(name.charAt(i));
            } else { //하이픈 문자를 만나면, 하이픈 다음 문자를 출력.
            if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
        }*/
        /* 4번풀이 char[] chName = name.toCharArray();
        for(char e : chName) {
            if(e >= 'A' && e <= 'Z') System.out.print(e);
        }*/


    }
}