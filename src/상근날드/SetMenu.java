package 상근날드;

import java.util.Scanner;

//상근날드에 3가지 햄버거와 2가지 음료를 판매한다.
//3가지 햄버거의 가격 중 가장 싼 메뉴의 가격을 선택하고, 음료 중 가장 싼 메뉴의 가격을 선택\
//세트 메뉴는 50원 할인됨.
public class SetMenu {
    public static void main(String[] args) {
        int[] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        for(int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int minBurger = menu[0];
        int minDrink = menu[3];
        for(int i= 0; i < menu.length; i++) {
            if((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if((i < 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50);
    }
}
