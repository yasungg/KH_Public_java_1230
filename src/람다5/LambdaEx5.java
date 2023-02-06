package 람다5;

import java.util.function.IntBinaryOperator;

//메소드 참조 : 메소드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내서 생략 가능한 매개변수를 제거하는 목적
class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }
    public int instanceMethod(int x, int y) {
        return x + y;
    }
}
//intBinaryOperator : 두 개의 int 타입에 대한 연산(인터페이스)
//ApplyAsint() : 두 개의 int 타입 매개변수에 대한 연산(추상메소드)
public class LambdaEx5 {
    public static void main(String[] args) {
        IntBinaryOperator operator; // 얘가 두 개의 int값을 return받기 때문에 매개변수 생략이 가능한 것
        // 정적 메소드 참조
        operator = (x, y) ->Calculator.staticMethod(x,y);
        System.out.println("결과 1 : " + operator.applyAsInt(1,2));

        operator = Calculator::staticMethod;
        System.out.println("결과 2 : " + operator.applyAsInt(3,4));
        //:: 소속 지정자
        //인스턴스 메소드
        Calculator cal = new Calculator();
        operator = (x, y) -> cal.instanceMethod(x, y);

        //메소드 참조
        operator = cal::instanceMethod;
        System.out.println("결과 4 : " + operator.applyAsInt(7,8));

    }
}
