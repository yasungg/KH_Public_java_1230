package Map응용커피메뉴;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenuEx {
    Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) {
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();

    }

    void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 3500, "Caffein", "에스프레소에 물을 탄 커피"));
        map.put("Espresso", new MenuInfo("Espresso", 3000, "Caffein", "기본 커피입니다."));
        map.put("Latte", new MenuInfo("Latte", 4500, "Caffein", "따뜻한 우유에 Espresso를 첨가해 부드럽게 즐길 수 있는 커피 입니다."));
        map.put("Matcha", new MenuInfo("Matcha", 4500, "Tea variation", "일본식 말차"));
    }

    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key = "";
        while (true) {
            System.out.println("[1]메뉴 보기, [2]메뉴 조회, [3]메뉴 추가, [4]메뉴 삭제, [5]메뉴 수정, [6]종료");
            System.out.println("주문 도와드릴까요?");
            int sel = sc.nextInt();

            switch (sel) {
                case 1:
                    System.out.println("========= 메뉴 =========");
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("=======================");
                    }
                case 2:
                    System.out.println("조회할 메뉴를 입력하세요.");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                    } else System.out.println("본 점에 해당 메뉴는 준비되어 있지 않습니다.");
                    break;
                case 3:
                    System.out.println("추가할 메뉴를 입력하세요.");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴는 이미 판매하고 있습니다.");
                    } else {
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String group = sc.next();
                        sc.nextLine();
                        System.out.print("설명 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, group, desc));
                    }
                    break;
                case 4:
                    System.out.println("어떤 메뉴를 삭제하시겠습니까?");
                    for(String e : map.keySet()) {
                        System.out.println(map.get(e).name);
                    }
                    System.out.println("메뉴를 선택하세요.");
                    System.out.print(" : ");
                    key = sc.next();
                    map.remove(key);
                    System.out.println("메뉴가 삭제되었습니다.");
                    for(String e : map.keySet()) {
                        System.out.println(map.get(e).name);
                    }
                case 5:
                case 6:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("올바른 동작 메뉴를 선택해주세요.");
            }
        }
    }
}
enum MenuName {
    AMERICANO, ESPRESSO, LATTE, MATCHA
}