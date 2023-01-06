package 기본배열;
//같은 타입의 변수들로 이루어진 유한집합
//배열을 구성하는 값을 배열의 요소(element)라고 함.
//배열의 인덱스는 0부터 시작하며 음수값을 가질 수 없다.
//타입[] 배열이름 = new 타입[배열의 길이];
public class BasicArray {
    public static void main(String[] args) {
        int[] score = {33, 44, 50, 67, 50};
        //총점과 평균 구하기

        int sum = 0;
        for(int e : score) {
            sum += e;
        }
        System.out.println("총점 : " + sum);
        //System.out.println("평균 : %.2f\n", (double)sum/score.length);
        /*for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총점 : " + sum);
        System.out.println("평균 : %.2f\n", (double)sum/score.length);*/

        /*score[0] = 88;
        score[1] = 90;
        score[2] = 70;
        score[3] = 50;
        score[4] = 77;
        int sum = 0;
        for(int i = 0; i < score.length; i++) { //length는 배열의 길이
            sum += score[i];
        }
        System.out.println("총점 : " + sum);*/
    }
}
