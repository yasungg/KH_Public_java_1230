package 회원정보예제;
import java.util.Scanner;

public class Member {
    String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.println("이름을 입력하세요. : ");
        name = sc.nextLine();
    }

    public void setAge() {
        while (true) {
            System.out.println("나이를 입력하세요. : ");
            age = sc.nextInt();
            if (age < 0 && age > 200) break;
            else System.out.println("나이를 잘못 입력하셨습니다.");
        }
    }

    public void setGender() {
        while (true) {
            System.out.println("성별을 입력하세요. : ");
            gender = sc.next().charAt(0);
            switch (gender) {
                case ("M"):
                case ("m"):
                case ("F"):
                case ("f"):
                    break;
                default:
                    System.out.println("성별을 잘못 입력하였습니다.");
            }
        }
    }
}