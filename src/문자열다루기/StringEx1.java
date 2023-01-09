package 문자열다루기;
//String 다루기
public class StringEx1 {
    public static void main(String[] args) {
        //equals() : 두 개의 문자열의 동일 여부를 비교하여 결과를 리턴.
        String a = "hello";
        String b = "Java";
        String c = "hello";
        System.out.println(a.equals(b)); // A 문자열과 B문자열을 비교
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase("Hello"));
        //대소문자 구분을 하지 않음.
        System.out.println(a == c); // 문자열의 값이 같은지 주소가 같은지 물어보는 것

        //indexOf() : 문자열에서 특정 문자가 시작되는 인덱스를 리턴
        String d = "Hello J Java Java";
        System.out.println(d.indexOf("J"));

        //contains() : 문자열에서 특정 문자열 포함여부를 리턴 (대소문자 구분한다.)
        System.out.println(d.contains("Java"));

        //charAt() : 문자열에서 인덱스에 해당하는 문자를 반환
        String str = "Hello Java";
        System.out.println(str.charAt(6));

        String str1 = "Apple, Banana, Pineapple, Kiwi, Melon";
        //replace(), replaceAll() : 문자열에서 특정 문자열을 다른 문자열로 대체
        System.out.println(str1.replaceAll("Pineapple", "Orange"));

        //substring(시작인덱스 ) : 문자열에서 특정 문자를 추출할때 사용. (시작인덱스부터 끝까지)
        //substring(시작인덱스에서 종료인덱스)
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(7, 13)); //시작인덱스부터 종료인덱스 미만까지

        //toUpperCase() / toLowerCase : 문자열을 전부 대문자 / 소문자로 변경
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        //trim() : 문자열 앞뒤의 공백 제거
        String str2 = "         자바 기반 공공데이터 과정 입니다 . !!!!!!!       ";
        System.out.println(str2.trim());

        //split() : 문자열을 특정 구분자 기준으로 분리하는 메소드
        String str3 = "안유진/카즈하/유나/장원영";
        String[] result = str3.split("/"); // 입력받은 이름을 /기준으로 나누어 담음
        for(String e : result) System.out.print(e + " ");

        //문자열 포매팅 : String.format() / System.out.printf()
        //문자열 내에서 서식을 이용해 값을 삽입하는 방법
        System.out.printf("오늘의 %s는 %d입니다.\n", "온도", 10);
        String str4 = String.format("오늘의 %s는 %d 입니다.", "온도", 10);
        System.out.print(str4);

        //toCharArray() : 문자열을 문자 배열로 전환
        char[] word = str3.toCharArray();
        System.out.println(word);
        for(int i = 0; i < word.length; i++) {
            System.out.print(word[i] + ",");
        }
    }
}
