package 회원정보예제;

public class MemberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setName();
        memberInfo.setAGE();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.viewinfo(); //정적 할당인지? 실행 중에 할당받으면 여러가지 이점이 있다.
    }
}
