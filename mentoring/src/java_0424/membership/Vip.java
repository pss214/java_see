package java_0424.membership;

public class Vip extends Gold{
    public Vip(String name) {
        super(name);
        accumulate = 0.2;
        discount = 20;
        rank = "VIP";
    }

    public void counselor(){
        System.out.println(name+"님 무엇을 도와드릴까요?");
    }
}
