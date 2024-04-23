package java_0424.membership;

public class MembershipMain {
    public static void main(String[] args) {
        Silver pss = new Silver("박성수");
        System.out.println(pss.buy(10000));
        pss.print();

        Gold kya = new Gold("김연아");
        System.out.println(kya.buy(10000));
        kya.print();

        Vip shm = new Vip("손흥민");
        System.out.println(shm.buy(10000));
        shm.print();
        shm.counselor();
    }
}
