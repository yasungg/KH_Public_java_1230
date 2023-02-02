package 피타고라스정리;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] line = new int[3];
        while(true) {
            for(int i = 0; i < line.length; i++) {
                line[i] = sc.nextInt();
            }
            Arrays.sort(line);
            if(line[0] == 0 && line[1] == 0 && line[2] == 0) break;
            else if(line[2] * line[2] == (line[1] * line[1]) + (line[0] * line[0])) {
                System.out.println("right");
            }else System.out.println("wrong");
        }
    }
}
