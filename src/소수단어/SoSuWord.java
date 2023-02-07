package 소수단어;


import java.util.*;

public class SoSuWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList();
        System.out.println("단어를 입력하세요. : ");
        String str = sc.next();
        int num = 0;
        int sum = 0;
        boolean isSosu = true;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                sum += str.charAt(i) - 'a' + 1;
            } else if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                sum += str.charAt(i) - 'A' + 1;
            }
        }
        System.out.println(sum);
        for(int i = 2; i < sum; i ++) {
            if(sum % i == 0) isSosu = false;
        }
        if(isSosu) System.out.println("소수");
        else System.out.println("아님");
    }
}
