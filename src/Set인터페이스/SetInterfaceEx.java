package Set인터페이스;

import java.util.*;

//Set 인터페이스 : 중복 허용 x, 순서유지 x
//HashSet : HashCode() 메소드 리턴값을 사용하여 객체와 동일여부 판단
public class SetInterfaceEx {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1001, "박채영"));
        hashSet.add(new Member(1002, "안유진"));
        hashSet.add(new Member(1003, "노윤서"));
        hashSet.add(new Member(1004, "김지수"));
        hashSet.add(new Member(1003, "채연"));

        for(Member e : hashSet) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("--------------------");
        }
    }
}
