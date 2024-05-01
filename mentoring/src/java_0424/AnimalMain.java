package java_0424;

public class AnimalMain {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Lion lion = new Lion();

        lion.eat();
        lion.run();
        lion.sleep();

        eagle.eat();
        eagle.fly();
        eagle.sleep();
    }
}
