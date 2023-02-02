package 예외처리예제;
//java에는 대응 불가능한 Error와 대응이 가능한 Exception으로 나누어진다.
//Exception은 예외처리 구문을 통해 해결할 수 있다.
//예외 이전에 프로그램에서 조건문 등을 통해 발생할 수 있는 문제는 사전에 차단해야 함.
//try catch 문을 말하는 것
//ArrayIndexOutOfBoundException : 할당되지 않은 배열의 인덱스에 접근할 때 발생.
public class ExceptionEx {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) { // 배열의 범위 초과
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("예외처리하였습니다.");
        }
        System.out.println("프로그램 정상 종료");
    }
}
