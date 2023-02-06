package 람다2;
//매개변수가 있는 람다식 : MyFuncinterface fa = x-> {....}
@FunctionalInterface // 함수형 인터페이스의 문법이 맞지 않을 경우 에러를 체크해주는 어노테이션
interface MyFuncInterface {
    public void method(int x); // 원래는 함수만 있으면 되는데 자바 문법의 특성 때문에 Interface가 필요.
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);
    }
}
