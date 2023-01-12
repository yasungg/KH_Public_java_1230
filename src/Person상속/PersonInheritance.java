package Person상속;
//인간(Person) 클래스 만들기
// - sleep (잠을 잔다. 정수값 : 시간) : 필드와 세터/게터
// - age (나이를 먹음 정수값 : 나이) : 필드와 세터/게터
//인간의 특성을 상속받아서 직장인 만들기
// - work (일함 정수값 : 몇시간 일하는지) : 필드와 세터/게터
//인간의 특성을 상속받아 학생 만들기
// - study (공부 열심히/적당히/놀면서 정수값 : 얼마나 공부하는지) : 필드와 세터/게터
public class PersonInheritance {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setWork(12);
        worker.setAge(30);
        worker.setSleep(6);
        System.out.println("직장인이 " + worker.getWork() + "시간동안 일을 합니다.");
        System.out.println("직장인의 나이는 " + worker.getAge() + "살 입니다.");
        System.out.println("직장인은 하루에 " + worker.getSleep() +"시간 동안 잠을 잡니다.");

        Student student = new Student();
        student.setStudy(3); // 1/2/3
        student.setAge(18);
        student.setStudy(8);
        System.out.println("학생이 " + student.getStudy() + "공부합니다.");
        System.out.println("학생의 나이는 " + student.getAge() + "살 입니다.");
        System.out.println("학생은 " + student.getSleep() + "시간 동안 잠을 잡니다.");




    }
}
