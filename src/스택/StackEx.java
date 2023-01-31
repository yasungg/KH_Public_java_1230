package 스택;

import java.util.Scanner;
import java.util.Stack;

//LIFO : Last In First Out, 프로그램 메소드 및 호출이 대표적인 스택 구조
//push(item) : 객체를 저장
//peak() : 스택의 맨 위 값 확인
//pop() : 스택의 맨 위 값을 추출해서 보여줌
//empty() : 스택이 비어있는지 확인
//contains() : 매개변수로 전달한 값이 있는지 확인
//괄호의 열림과 닫힘을 확인
public class StackEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        for(int i = 0; i <exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                st.push(ch);
            } else if(ch == ')') {
                if(!st.empty()) st.pop();
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }
            }
        }
    }
}
