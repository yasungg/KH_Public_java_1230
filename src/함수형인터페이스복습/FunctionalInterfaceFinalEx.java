package 함수형인터페이스복습;
// 함수형 인터페이스 : 자바에서는 메소드가 단독으로 존재할 수 없다.
// 따라서 함수형 프로그래밍을 하기 위해서는 함수형 인터페이스가 필요하다.
@FunctionalInterface
interface Calculator {
    void sum(int a, int b);
}
public class FunctionalInterfaceFinalEx {
    public static void main(String[] args) {
        Calculator mc = (a, b) -> {
            int rst = a + b;
            System.out.println(rst);
        };
        mc.sum(3,4);
    }
}
