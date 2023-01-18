package 중복된배열;

import java.util.Scanner;

//10개의 배열을 만들고 임의의 숫자를 입력받음(가급적 중복된 숫자 있도록 입력
//중복된 문자 중 두 번째 나오는 숫자의 위치 찾기(위치는 인덱스가 아니고 실질적인 위치를 의미
public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        System.out.print("10개의 임의의 수를 입력 : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("찾으려는 수를 입력하세요.");
        int find = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == find) {
                cnt++;
                if(cnt == 2) {
                    System.out.print(i+1);
                    break;
                }
            }
        }
        if(cnt < 2) System.out.println("-1");
    }
}
