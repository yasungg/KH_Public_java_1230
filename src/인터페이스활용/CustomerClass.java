package 인터페이스활용;

public class CustomerClass {
    public static void main(String[] args) {
        CustomerTest customer = new CustomerTest();
        Buy buyer = customer; // Customer  Type의 참조변수를 Buy 타입에 대입하여 형변환
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        CustomerTest customer1 = (CustomerTest) seller;
    }
}
