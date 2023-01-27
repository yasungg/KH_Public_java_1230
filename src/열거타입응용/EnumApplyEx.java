package 열거타입응용;

import java.util.Scanner;

public class EnumApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberInfo memberInfo = new MemberInfo();
        System.out.println("직업을 입력하세요. : ");
        int in = sc.nextInt();
        switch(in) {
            case 1 :
                memberInfo.jobs = Jobs.Student; break;
            case 2 :
                memberInfo.jobs = Jobs.Student; break;
            case 3 :
                memberInfo.jobs = Jobs.HouseWife; break;
            case 4 :
                memberInfo.jobs = Jobs.None; break;
        }
        System.out.println(memberInfo.jobs);
    }
}
