package 리모컨인터페이스;

import java.util.Scanner;

public class RemoConInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용할 기기를 선택하세요. [1]Audio [2] Television : ");
        int choice = sc.nextInt();
        RemoteControl remoCon;
        if(choice == 1) {
            System.out.println("Audio를 선택하셨습니다.");
            System.out.println("Audio를 켜시겠습니까? [0] 끈다 [1] 켠다");
            int turn = sc.nextInt();
            remoCon = new Audio();
            switch(turn) {
                case 0 :
                    remoCon.turnOff();
                    break;
                case 1 :
                    remoCon.turnOn();
                    remoCon.setMaxVolume(120);
                    ((Audio)remoCon).getInfo();
            }
        }
        if(choice == 2) {
            System.out.println("TV를 선택하셨습니다.");
            System.out.println("TV를 켜시겠습니까? [0] 끈다 [1] 켠다");
            int turn = sc.nextInt();
            remoCon = new Television();
            switch(turn) {
                case 0:
                    remoCon.turnOff();
                    break;
                case 1:
                    remoCon.turnOn();
                    remoCon.setMaxVolume(120);
                    ((Television)remoCon).getInfo();
            }
        }
    }
}
