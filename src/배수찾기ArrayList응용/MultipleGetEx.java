package 배수찾기ArrayList응용;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//첫번째 배수에 대한 기본을 입력(주어진 값)
//연속으로 값 입력받기
//0이면 종료
//입력받기를 종료한 이후 List 내에 있는 값이 주어진 값의 배수인지 아닌지 확인해서 출력
//예를 들어 주어진 값이 3이라면
// 99 is a multiple of 3.
// 7 is NOT a multiple of 3.
public class MultipleGetEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력하세요 : ");
        int n = sc.nextInt();
        int tmp; // 키보드 값을 입력받기 위한 변수
        while(true) {
            tmp = sc.nextInt();
            if(tmp == 0) break;
            list.add(tmp);
        }
        for(Integer e : list) {
            if(e % n == 0) System.out.println(e + "is a multiple of " + n +".");
            else System.out.println(e + " is NOT a multiple of " + n + ".");
        }
    }
}
