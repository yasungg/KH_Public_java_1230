package ArrayList응용;

import 클론메소드.Member;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestEx3 {
    public static void main(String[] args) {
        List<MemberInfo> memList = new ArrayList<>();
        memList.add(new MemberInfo("박채영", "rosesarerosie", "1poiuy147k", "rosesarerosie@instagram.com", "01033762096", 26));
        memList.add(new MemberInfo("김지수", "jisoooo___", "j1s0000", "jisooo___@instagram.com", "01022382096", 28));
        memList.add(new MemberInfo("김채원", "kimchaewonn", "1231126", "kimchaewonn@instagram.com", "01020762096", 23));
        for(MemberInfo info : memList) {
            info.viewInfo();
        }
    }
}
