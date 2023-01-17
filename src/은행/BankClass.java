package 은행;
//클래스 내의 변수 = 멤버라고 부른다. 정적 멤버 = 정적 변수 = 한 번만 만들어지는 변수.
public class BankClass {
    private static int cnt = 0; // 같은 클래스 내에서만 접근 가능, 외부에서 접근 불가한 정적 변수.
    private int account;// 계좌
    private String bank;//은행 이름
    public BankClass(String name, int account) { // 생성자 앞에는 반환 타입 x void마저도 x
        cnt++; // 클래스가 객체로 만들어질 때마다 값이 증가된다.
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌를 개설합니다. 잔액은 " + account + "입니다.");
    }
    public static int getCnt() { // 정적 메소드
        return cnt;
    }
    public void setDeposit(final int dep) {
        this.account += dep;
        System.out.println(dep + "을 입금했습니다.");
    }
    public void setWithdraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= with;
            System.out.println(with + "원을 출금합니다.");
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 " + account + "원 입니다.");
    }
}
