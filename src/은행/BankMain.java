package 은행;

import static 은행.Util.KH_SERVER_DOMAIN;

public class BankMain {
    public static void main(String[] args) {
        BankClass kakao = new BankClass("kakao", 0);
        BankClass shinHan = new BankClass("ShinHan", 0);
        BankClass NH = new BankClass("농협", 0);
        kakao.setDeposit(12000);
        kakao.setWithdraw(15000);
        kakao.viewAccount();
        System.out.println(Util.getCurrentDate("yyyyMMdd일 hh:mm:ss"));
        System.out.println("서버 주소 : " + KH_SERVER_DOMAIN);
    }
}
