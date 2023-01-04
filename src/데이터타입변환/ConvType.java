package 데이터타입변환;

public class ConvType {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double rst1 = (double)num1 / num2;
        System.out.println(rst1);
        String phoneNumber = "01030142096";
        int number = Integer.parseInt(phoneNumber);
        System.out.println(number);
        String Tmp = "36.5";
        double numberTmp = Double.parseDouble(Tmp);
        System.out.println(numberTmp);
    }
}
