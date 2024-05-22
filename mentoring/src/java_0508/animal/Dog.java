package java_0508.animal;

public class Dog extends Animal{
    public Dog(String name){
        super.name=name;
    }

    @Override
    public void sound() {
        System.out.println("멍멍~");
    }
}
