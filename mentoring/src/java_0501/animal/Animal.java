package java_0501.animal;

public abstract class Animal {
    protected String name;
    public void eat(){
        System.out.println(name+"이(가) 밥을 먹습니다.");
    }
    public abstract void sound();
}
