package 중복없는로또번호생성Ex1;
//6개의 로또번호 생성해서 출력하기(배열 사용)
//중복없는 로또번호 생성 후 출력
//array list를 사용한 출력으로 어떻게 간단해지는지 확인
//set을 이용해서 로또 번호 출력
public class LottoEx1 {
    public static void main(String[] args) {
        //6개의 배열 생성
        //반복문을 순회하면서 랜덤함수를 이용해 배열에 로또번호추가
        //마지막에 배열에 포함된 로또번호 출력
        int[] lotto = new int[6];
        int tmp, index = 0;
        boolean isExist = false;// 로또 배열에 같은 값이 존재하는지 확인

            while(true) {
                tmp = ((int)(Math.random() * 45) + 1);
                for(int i = 0; i < lotto.length; i++) {
                    if(lotto[i] == tmp) isExist = true;
                }
                if(isExist == false) lotto[index++] = tmp; // 해당 인덱스 값에 반영하고 증가시킴
                if(index == 6) break;
                isExist = false;
            }
            System.out.print("[");
            for (int i = 0; i < lotto.length; i++) {
                System.out.print(lotto[i] + " ");
            }
            System.out.print("\b]");
        }
    }