package 스트림8번;

import java.util.ArrayList;
import java.util.List;

//스트림에서 제공하는 메소드를 이용해 조건문과 반복문 없이 일관된 방법으로 처리
public class StreamEx8 {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("안유진", 21, 160000));
        customerList.add(new TravelCustomer("김채원", 21, 200000));
        customerList.add(new TravelCustomer("예슈화", 23, 120000));
        customerList.add(new TravelCustomer("해인", 20, 170000));
        System.out.println("=========== 목록 ============");
        customerList.stream().map(c -> c.getName()).forEach(System.out::println);
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 비용 : " + total);
        System.out.println("===========21세 이상 명단============");
        customerList.stream()
                .filter(a -> a.getAge() >= 21)
                .map(a -> a.getName())
                .sorted()
                .forEach(a -> System.out.println(a));
        System.out.println("===========가성비 명단===========");
        customerList.stream()
                .filter(p -> p.getPrice() <= 160000)
                .map(p -> p.getName())
                .sorted()
                .forEach(p -> System.out.println(p));
    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
