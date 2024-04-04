package java_0403;

public class ObjectEx {
    public static void main(String[] args) {
        Human pss = new Human("박성수",25,170,100);


        pss.print();

        //pss.name = pss (private 설정으로 직접 불러 올 수 없음)
        pss.setName("pss");
        pss.setAge(26);
        pss.print();

    }

}
