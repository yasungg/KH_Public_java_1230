package Iterator이터레이터;

import kotlin.jvm.internal.MagicApiIntrinsics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Iterator<E> 인터페이스 : Collection 프레임워크에 저장된 요소를 읽어오는 방법을 Iterator로 표준화하고 있음
//최근에는 향상된 for문을 더 많이 쓰나, 향상된 for 문을 이용하기 어려운 경우 Iterator를 사용.
//public interface Collection<E> extends Iterable<E> {}
//public interface List<E> extends Collection<E> {}
//public interface Set<E> extends Collection<E> {}
//boolean hasNext() : 다음 요소가 있는지 확인, 있으면 true가 반환
//E next() : 요소를 반환
//remove() : next()로 읽어온 요소를 삭제
public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(iterator.next() == 3) iterator.remove();
            System.out.print(iterator.next() + " ");
        }
    }
}
