package 소수판별하기;

import java.util.Scanner;

//메소드를 이용한 소수 판별하기
//1과 자기자신 이외에는 나누어지지 않는 수
//정수를 입력받아서 해당 정수 미만의 소수의를 찾아 합을 구하는 문제.
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요. : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 2; i < num; i++) sum += primeSum(i);
        System.out.println("소수의 합 : " + sum);//왜 2가 나오지?

        }

    //매개변수로 전달받은 정수값이 소수인지 아닌지 판별하기
    //메소드 호출 결과를 boolean type으로 반환
        static int primeSum(int n) {//static : 객체 안찍어내고 class 내에서 사용하고 말겠다.
            boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if(n % i == 0); isPrime = false; // 소수가 아님
        }
        if(isPrime) return n; //해당값이 소수이면 입력받은 값을 반환
        else return 0; // 소수가 아니면 0을 반환
    }
}