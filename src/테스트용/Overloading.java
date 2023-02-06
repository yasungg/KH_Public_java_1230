package 테스트용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        List arr = new ArrayList<>();
        int n = 0;
        int cnt = 0;
        while (true) {
            if (n < 10) {
                n++;
                arr.add(n);

            }else
            /*(int i = 0; i < 10; i ++) {
                arr.add(i+1);
            }
            System.out.println(arr);*/
                break;
        }
        System.out.println(arr);
    }
}
