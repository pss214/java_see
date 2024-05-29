package java_0529;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(arr[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("예외 사유 : "+e);
        }finally {
            System.out.println("끝나유");
        }
    }
}
