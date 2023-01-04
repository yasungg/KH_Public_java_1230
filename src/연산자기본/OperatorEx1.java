package 연산자기본;

import java.util.Scanner;

public class OperatorEx1 {
    public static void main(String[] args) {
        /*int num1 = 10, num2 = 0;
        System.out.println("+ 연산자 : " + (num1 + num2));
        System.out.println("- 연산자 : " + (num1 - num2));
        System.out.println("* 연산자 : " + (num1 * num2));
        try {
            System.out.println("/ 연산자 : " + (num1 / num2));
        } catch(ArithmeticException e) {
            System.out.println("값을 0으로 나누면 안됩니다.");
        }
        // System.out.println("/ 연산자 : " + ((double)num1 / num2));
        // System.out.println("% 연산자 : " + (num1 % num2)); */
//대입 연산자
        /* int x, y, z = 10;
        x = y = z;
        System.out.println(x + " " + y + " " + z);
        int num1 = 10;
        System.out.println(num1 += 2); //num1 = num1 + 2
        System.out.println(num1 -= 2); //num1 = num1 - 2
        System.out.println(num1 *= 2); //num1 = num1 * 2
        System.out.println(num1 /= 2); //num1 = num1 / 2
        System.out.println(num1 %= 2); //num1 = num1 % 2 */
        /* int num1 = 10;
        System.out.println(num1++); // num1의 값을 사용 후 증가시킴.
        System.out.println(num1);*/
        /* int x = 10, y = 20;
        System.out.println(x < y);*/
        /* int x = 10, y = 20;
        boolean rst1, rst2, rst3;
        rst1 = (x > 0) && (x > y); // 앞의 조건이 거짓인 경우, 뒤의 조건이 참이더라도 출력을 하지 않는 특성이 있다.
        // and 논리연산자는 앞이 참이면 뒤를 보지 않아도 어차피 거짓이라는 것.
        rst2 = (x > 0) || (x > y); // true
        rst3 = (!(x > 0) || (x > y)); // false */
        /* Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요.");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false; //단 한 줄로 조건 분개가 가능하다.
        System.out.println(isAdult);*/
        /* System.out.println("Java" + (11.04 + 12)); */
        int val1 = 5, val2 = 5, val3 = 5;
        int rst1, rst2, rst3;
        rst1 = val1 + val2 * val3;
        rst2 = (val1 + val2) * val3;
        rst3 = val1 + (++val2) * val3;
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);




    }
}
