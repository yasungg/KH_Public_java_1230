package 손익분기점;

import java.util.Scanner;

public class ExSellingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("solid : ");
        int solid = sc.nextInt();
        System.out.print("var : ");
        int var = sc.nextInt();
        System.out.print("price : ");
        int price = sc.nextInt();
        System.out.print(solid);
        System.out.print(" ");
        System.out.print(var);
        System.out.print(" ");
        System.out.println(price);
        int sellCnt = 1;
        if(price < var) {
            System.out.println("-1");
            return;
        }
        System.out.println(solid / (price - var) + 1);
    }
}

