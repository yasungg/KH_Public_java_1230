package 예외처리예제7;

import java.util.Scanner;

//사용자 정의 예외 클래스 만들기
public class ExceptionEx7 {
    public static void main(String[] args) {
        CheckEvent check = new CheckEvent();
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        try {
            System.out.println(check.printEvent(num));
        } catch(EventException e) {
            e.printStackTrace();
        }
    }
}
class EventException extends Exception {
    private Integer number = null;
    public EventException(int number) {
        this.number = number;
    }
    @Override
    public String getMessage() {
        if(number == null) {
            return "숫자가 아닙니다.";
        } else {
            return Integer.toString(number) + "는 짝수가 아닙니다.";
        }
    }
}
class CheckEvent {
    private int num;
    void setNum(int num) {
        this.num = num;
    }
    int printEvent(int number) throws EventException {
        this.num = number;
        if(num % 2 != 0) {
            throw new EventException(num);
        } else {
            return num;
        }
    }
}