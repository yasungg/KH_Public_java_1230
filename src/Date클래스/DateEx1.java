package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

//Date 클래스 : 1970년 1월1일 0시0분0초로부터 msec단위로 경과시간을 운영체제로부터 얻어냅니다.
//SimpleDateFormat() : 얻어낸 시간 정보를 우리가 원하는 날짜와 시간 형태로 변환하여 출력하는 포맷
public class DateEx1 {
    public static void main(String[] args) {
        Date now = new Date(); // Date 클래스로 객체 생성 후 사용해야 함
        //yyyy : 연도를 4자리로 표현
        //yy : 연도를 2자리로 표현
        //MM : 월을 표시(월이 한자리인 경우 앞에 0에 포함. 반드시 대문자.
        //dd : 일을 표시
        //HH : 24시간제 표시
        //hh : 12시간제 표시
        //mm : 분을 표시(분이 한자리인 경우 앞에 0 포함
        //W : 월에서 몇주차인지 표시
        //w : 연에서 몇주차인지 표시
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy-MM-dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W째 주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");

        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.print(f7.format(now));

    }
}
