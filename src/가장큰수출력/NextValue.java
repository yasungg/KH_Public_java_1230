package 가장큰수출력;
//세자리 정수를 입력받아 가장 큰 수 출력
//365, a=3, b=6, c=5
import java.util.Scanner;

public class NextValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 자리의 정수를 입력하세요. : ");
        int number = sc.nextInt();
        int a, b, c;
        a = number / 100;
        b = number % 100 /10;
        c = number % 10;
        //Math.max 문 이용
        /*if(a > b) {
            if(a > c) System.out.println(a);
            else System.out.println(c);
        } else {
            if(b > c) System.out.println(b);
            else System.out.print(c); */
        }
    }
