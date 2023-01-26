package Calender클래스;

import java.util.Calendar;

//Calender 클래스는 추상클래스이므로 객체를 생성할 수 없다.
//정적메소드인 getInstance() 메소드로 운영체제의 시간을 가져온다.
//Calender 클래스에 포함된 모든 필드는 정적 변수(클래스 변수)임.
public class CalenderEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.MONTH) + 1); // 달의 정보는 배열의 인덱스로 넘어오기 때문에 1을 더해주어야 한다.
        System.out.println(now.get(Calendar.DAY_OF_MONTH)); //달에서 몇 번째 날짜이냐
        System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 주에서 몇 번째 날짜이냐
        System.out.println(now.get(Calendar.AM_PM));
        System.out.println(now.get(Calendar.HOUR));
        System.out.println(now.get(Calendar.MINUTE));
        System.out.println(now.get(Calendar.SECOND));

        System.out.print(now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH) + 1)  + "월 " + now.get(Calendar.DAY_OF_MONTH) + "일 ");
        System.out.println(now.get(Calendar.HOUR) + "시 " + now.get(Calendar.MINUTE) + "분 " + now.get(Calendar.SECOND) + "초");
    }

}
