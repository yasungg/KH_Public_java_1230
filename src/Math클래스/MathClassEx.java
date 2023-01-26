package Math클래스;
//Math 클래스는 수학에서 자주 사용하는 상수들과 메소드를 미리 구현해놓은 클래스
//Math 클래스의 모든 메소드는 클래스 메소드(static method). 그러므로 객체 생성 불가.
//java.lang에 포함된 클래스

import java.util.Random;

public class MathClassEx {
    public static void main(String[] args) {
        //random() : 0.0 이상, 1.0 미만의 범위에서 임의의 double형 값 중 임의의 하나를 반환
        for(int i = 0; i < 100; i++) {
        System.out.println((int)(Math.random() * 100 + 1));
    }
        System.out.println("---------------------------------------");
        Random ran = new Random();
        System.out.println(ran.nextInt(100) + 50);
        //abs() : 절대값을 구하는 메소드. 음수이면 양수로 변환
        System.out.println(Math.abs(-1));
        //floor() : 소수점 이하를 날리고 가장 가까운 정수값 출력
        System.out.println(Math.floor(10.99999999999));
        //ceil() : 소수점이 있으면 무조건 올림
        System.out.println(Math.ceil(10.99999999999));
        System.out.println(Math.ceil(9.0000000001));
        //round() : 반올림
        System.out.println(Math.round(10.99999999999));
        System.out.println(Math.round(9.0000000001));
        //min() : 전달된 두 값 중 작은 값 출력
        //max() : 전달된 두 값 중 큰 값 출력
        System.out.println(Math.max(10,4));
        System.out.println(Math.min(10,4));

    }
}
