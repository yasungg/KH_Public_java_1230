package 중복없는로또번호생성Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

//6개의 로또번호 생성해서 출력하기(배열 사용)
//중복없는 로또번호 생성 후 출력
//array list를 사용한 출력으로 어떻게 간단해지는지 확인
//set을 이용해서 로또 번호 출력
public class LottoEx1 {
    public static void main(String[] args) throws InterruptedException {
        //6개의 배열 생성
        //반복문을 순회하면서 랜덤함수를 이용해 배열에 로또번호추가
        //마지막에 배열에 포함된 로또번호 출력
        List<Integer> lottoArr = new ArrayList<>();
        Random ran = new Random();
        int[] lotto = new int[6];
        int tmp, index = 0;
        boolean isExist = false;// 로또 배열에 같은 값이 존재하는지 확인

        while(true) {
            tmp = ((int)(Math.random() * 45) + 1);
            if(!lottoArr.contains(tmp)) lottoArr.add(tmp);
            if(lottoArr.size() == 6) break;
        }
        System.out.println("이번주 행운의 번호는!!" + lottoArr);
        for(int i = 0; i < 5; i++) {
            System.out.println(".");
            sleep(1000);
        }
        System.out.println("두근세근네근!!!");
        sleep(1000);
        System.out.println("보너스번호!!! " + "'" + ran.nextInt(45) + "'");
    }
}