package 셋으로구현하는중복없는로또;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class SetLotto {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while(true) {
            int tmp = (int)((Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}
