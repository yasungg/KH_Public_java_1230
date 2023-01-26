package 제네릭예제3;

public class GenericTestEx3 {
    public static void main(String[] args) {
        GenericPrint<Powder> powderPrinter = new GenericPrint<>();
        powderPrinter.setMaterial(new Powder()); // Powder 타입의 객체를 만들어서 주입
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);

        GenericPrint<Plastic> plasticPrinter = new GenericPrint<>();
        plasticPrinter.setMaterial(new Plastic()); // Powder 타입의 객체를 만들어서 주입
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

        /*GenericPrint<Water> WaterPrinter = new GenericPrint<>();
        WaterPrinter.setMaterial(new Water()); // Powder 타입의 객체를 만들어서 주입
        Water water = WaterPrinter.getMaterial();
        System.out.println(water);*/
    }
}
