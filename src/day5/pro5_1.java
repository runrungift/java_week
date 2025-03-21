package day5;

public class pro5_1 {
    public static void main(String[] args) {
        int[] a = new int[7];
        for (int i = 0;i < 7;i++){
            a[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 0;i < 7;i++){
            System.out.print("a[" + i + "]=" + a[i] + " ");
        }
        System.out.println();
    }
}
