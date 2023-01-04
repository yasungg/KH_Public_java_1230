package 비트연산자;

public class BitOp {
    public static void main(String[] args) {
        int num1 = 10; // 0000 1010(2)
        int num2 = 12; // 0000 1100(2)
                       // 0000 1000(2) = 8 AND
                       // 0000 1110(2) = 14 OR
                       // 0000 0110(2) = 6 XOR
                       // 0000
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1); // 비트 연산에서 음수는 많은 의미를 지니지 않는다.
        System.out.println(num1 << 1);
        System.out.println(num1 >> 1);
    }
}
