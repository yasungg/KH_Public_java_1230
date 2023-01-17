package 평균은넘겠지;

import java.util.Scanner;

public class Background {
    double scoreAver() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요. : ");
        int student = sc.nextInt();
        int[] score = new int[student];
        int sum = 0;
        int upperClass = 0;
        int upperClassSum = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.print("점수를 입력하세요. :");
            score[i] = sc.nextInt();
            sum += score[i];
        }
        double average = (double) sum / student;
        for (int e : score) {
            if (e > average) upperClass++;
        }
        return (double)upperClass / student;
    }
}
/*double average = (double)sum / student;
            for(int j = i; j < score.length; j++) {
                if(score[i] > (double)sum / student) {
                    upperClass[j] = score[i];
                    upperClassSum += upperClass[j];
                }
            }
        }
        System.out.printf("%.3f\n", ((double)upperClass.length/student) * 100);*/