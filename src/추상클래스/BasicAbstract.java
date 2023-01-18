package 추상클래스;

public class BasicAbstract {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
        Dog dog = new Dog();
        dog.cry();

        Animal animal = new Cat();
        animal.cry();
    }
}
abstract class Animal {
        abstract void cry();

}
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("멍멍멍");
    }
}