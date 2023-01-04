package While문기본;

public class WhileEx1 {
    public static void main(String[] args) {
        int treeHit = 0;
        while(true) { // 무한의 반복조건
            treeHit++; // 변수값을 1 증가시킨다.
            System.out.println("나무를 " + treeHit + "번 " + "찍었습니다.");
            if(treeHit == 10) {
                System.out.println("나무가 넘어갑니다.");
                break; //반복문의 수행을 종료시키고 탈출한다.
            }
        }
    }
}
