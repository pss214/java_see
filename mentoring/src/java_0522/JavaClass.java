package java_0522;

import java.util.ArrayList;
import java.util.List;

public class JavaClass {
    public static void main(String[] args) {
        String number = "10000";

        int num = Integer.parseInt(number);
        System.out.println(num);

        int[] num2= new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            num2[i] = number.charAt(i)-'0';
            System.out.print(num2[i] + " ");
        }
        System.out.println("\n");
        List<String> name = new ArrayList<>();

        name.add("박성수");
        name.add("홍길동");
        name.add("김철수");
        System.out.println(name);
        name.remove(0); //name.removeFirst()
        System.out.println(name);

        for (String s : name){
            System.out.println(s);
        }
        System.out.println(name.get(1));
    }
}
