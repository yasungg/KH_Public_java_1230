package 열거형연습;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("곽용석", DevType.BACKEND, Career.JUNIOR, Gender.MALE);
        developer.devInfo();
        System.out.println(" ");
        Developer developer1 = new Developer("이아영", DevType.FRONTEND, Career.JUNIOR, Gender.FEMALE);
        developer1.devInfo();
    }
}
