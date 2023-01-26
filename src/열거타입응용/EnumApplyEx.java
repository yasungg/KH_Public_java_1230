package 열거타입응용;

import java.util.Scanner;

public class EnumApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberInfo.Jobs jobs = null;
        System.out.println("직업을 입력하세요. : ");
        int in = sc.nextInt();
        switch(in) {
            case 1 :
                jobs = MemberInfo.Jobs.Student; break;
            case 2 :
                jobs = MemberInfo.Jobs.Student; break;
            case 3 :
                jobs = MemberInfo.Jobs.HouseWife; break;
            case 4 :
                jobs = MemberInfo.Jobs.None; break;
        }
        System.out.println(jobs);
    }
}
