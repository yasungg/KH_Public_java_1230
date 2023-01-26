package 로또번호만들기응용;

import java.util.Random;

public class LottoApplyEx {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int tmp1 = 0;
        int tmp, index = 0;
        for(int i = 0; i < lotto.length; i++) {
            tmp = (int)(Math.random() * 50);
            lotto[index++] = tmp;
        }
        Random ran = new Random();
        tmp1 = (ran.nextInt(100));

        System.out.print("[");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.print(tmp1 + 50);
        System.out.print("\b]");
        }
    }
