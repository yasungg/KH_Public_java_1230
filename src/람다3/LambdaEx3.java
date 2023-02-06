package 람다3;

import java.nio.channels.MembershipKey;

//return값이 있는 타입 : MyFuncInterface fi = (x, y) -> x < y ? x : y;
@FunctionalInterface
interface MyFuncInterface {
    public int min(int x, int y); //메소드가 한개만 존재해야 함
}
public class LambdaEx3 {
    public static void main(String[] args) {
        MyFuncInterface fi = (x, y) -> x < y ? x : y;
        System.out.println(fi.min(3,4));
    }
}
