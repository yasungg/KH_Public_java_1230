package 저항;

import java.util.Arrays;
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int fst = 0, sec = 0, thrd = 0;

        System.out.println("[0]black, [1]brown, [2]red, [3]orange, [4]yellow, [5]green, [6]blue, [7]violet, [8]grey, [9]white");
        System.out.print("원하는 저항의 색을 입력하세요. : ");
        String fstColor = sc.next();
        System.out.print("두 번째 저항의 색은 무엇입니까?. : ");
        String secColor = sc.next();
        System.out.print("세 번째 저항의 색은 무엇입니까? : ");
        String thrdColor = sc.next();

        for(int i = 0; i < color.length; i++) {
            if(fstColor.equals(color[i])) fst = i;
            if(secColor.equals(color[i])) sec = i;
            if(thrdColor.equals(color[i])) thrd = i;
        }
        System.out.println((long)((fst * 10) + sec) * (long)(Math.pow(10, thrd)));
    }
}
