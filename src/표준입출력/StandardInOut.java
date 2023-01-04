package 표준입출력;

public class StandardInOut {
    public static void main(String[] args) {
        String name = "잘생긴곽용석";
        String addr = "나는잘생겼어";
        char gender = '남'; // char형은 외부적으로 문자를 보여주지만 내부적으로는 정수값이 보인다. 문자에 대한 정수값이 움직인다.
        int age = 30;
        int kor = 99;
        int toeic = 915;
        int mat = 100;
        //자바 스타일
        System.out.println("==========Java Style introducing myself");
        System.out.println("이름 : " + name);
        System.out.println("상태 : " + addr);
        System.out.println("성별 " + gender);
        System.out.println("나이 " + age);
        System.out.println("한국어 실력 " + kor);
        System.out.println("토익 성적 " + toeic);
        System.out.println("수학 성적 " + mat); // 아무것도 안 해도 char, String, int 타입을 알아서 매칭해서 찍어준다. 오버로딩
        System.out.println("총점 : " + (kor + toeic + mat));
        System.out.println("평균 : " + (double)(kor + toeic + mat)/3);
        //C언어 스타일
        System.out.printf("===========C Style===========\n");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("한국어 성적 : %d\n", kor);
        System.out.printf("토익 성적 : %d\n", toeic);
        System.out.printf("수학 성적 : %d\n", mat);
        System.out.printf("총점 : %d\n", kor + toeic + mat);
        System.out.printf("평균 : %.2f\n", ((double)(kor + toeic + mat)/3)); //%.2f 소수점 두자리 숫자에서 끊는다.
        System.out.printf("AppleBanana \b\b\b\n");
        System.out.println("\"ㅎㅇㅎㅇ\"");
        System.out.printf("오늘의습도는%d%%입니다.", 25);
    }
}
