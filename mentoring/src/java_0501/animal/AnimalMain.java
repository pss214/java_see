package java_0501.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Lion lion = new Lion("사자");
        Dog dog = new Dog("강아지");

        lion.eat();
        dog.eat();
        System.out.println("");
        lion.sound();
        dog.sound();
    }
}
