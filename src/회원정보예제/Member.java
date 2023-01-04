package 회원정보예제;
//이름, 나이, 직업, 성별 정보를 입력받기
import java.util.Scanner;

public class Member {
    public static void main(String[] args) {
        String name;
        int age;
        char gender;
        int jobs;
        Scanner sc = new Scanner(System.in);
        public void setName() {
            System.out.println("이름을 입력하세요 : ");
            name = sc.nextLine();
        }
        public void setAge() {
            System.out.println("나이를 입력하세요. : ");
            age = sc.nextInt();
        }
        public void setGender() {
            while(true) {
                System.out.println("성별을 입력하세요. : ");
                gender = sc.next().charAt(0);
                switch(gender) {
                    case 'M' :
                    case 'm' :
                    case 'F' :
                    case 'f' :
                        return; //메소드를 호출한 곳으로 결과값을 전달하고 이동.
                    default :
                        System.out.println("성별을 잘못 입력하셨습니다.");
                }
        }
        public void setJobs () {
            System.out.println("직업을 입력하세요. : ");
            jobs = sc.nextInt();
        }
    }
}