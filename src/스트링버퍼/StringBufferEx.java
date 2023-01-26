package 스트링버퍼;
import java.lang.*; // 자동으로 컴파일러에 의해서 추가됨.(기본 패키지)
//StringBuffer = 문자열을 추가하거나 변경할 때 사용되는 자료형(동기화 처리가 있음)
//String Builder = 문자열을 추가하거나 변경할 때 사용되는 자료형(동기화 처리가 없음)
//동기화 처리 ? :
//String = 문자열을 + 연산자로 추가하면 매번 더할때마다 새로운 문자열이 생성됨.
//append(), delete(), insert(), substring()
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuffer 클래스로 객체를 만들어주어야 한다. Scanner와 마찬가지.
        sb.append("hello");
        sb.append(" ");
        sb.append("to java");
        sb.append("javascript");
        sb.delete(1, 3); //1번 인덱스 초과부터 3번 인덱스 이하까지 삭제
        sb.insert(0, "test"); // offset번째 인덱스에 문자열을 추가함.

        System.out.println(sb);
        System.out.println(sb.substring(0, 4));
    }
}