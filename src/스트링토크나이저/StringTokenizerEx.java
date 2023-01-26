package 스트링토크나이저;
import java.util.Scanner;
import java.util.StringTokenizer;
//StringTokenizer : 구분자 기준으로 문자열을 처리
//countTokens() : 꺼내지 않고 남아있는 토큰의 수
//hasMoreTokens() : 남아있는 토큰이 있는지 물어봄 (있으면 true)
//nextToken() : 토큰을 한 개씩 꺼내옴.
public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 연속 입력하세요. : ");
        String names = sc.nextLine();
/*        String[] nameStr = new String[st.countTokens()]; // 쪼개진 문자열의 갯수만큼 배열을 확보
        int idx = 0;
        while(st.hasMoreTokens()) {
            nameStr[idx++] = st.nextToken();
        }
        for(String e : nameStr) System.out.print(e + " ");*/
        String[] nameArr = names.split("/");
        for(String e : nameArr) System.out.print(e + " ");
    }
}
