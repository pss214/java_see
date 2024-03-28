package java_0327;

public class Loop_Training {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            //sum += i; 아래 코드와 같은 식.
            sum = i + sum;
        }
        System.out.println("합한 값은 "+sum);
        sum = 0;
        for (int i = 0; i < 20; i++) {
            if( i%2== 0 ){
                sum += i;
            }
        }
        System.out.println("합한 값은 "+sum);
        sum = 0;
        for (int i = 0; i < 20; i += 2) {
                sum += i;
        }
        System.out.println("합한 값은 "+sum);

    }
}
