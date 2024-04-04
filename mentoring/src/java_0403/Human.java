package java_0403;

public class Human {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Human(String name, int age, int height,int weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    public void print(){
        System.out.println("내 이름은 "+name+"이고, 나이는 "+age+"이고 키는"+height+", 몸무게는 "+weight+"야 만나서 반가워");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
