package java_0508.animal;

public class Lion extends Animal{
    public Lion (String name){
        super.name=name;
    }
    @Override
    public void sound() {
        System.out.println("어흥~");
    }
}
