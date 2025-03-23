package day5;

public class pro5_10 {
    public static void main(String[] args) {
        int[] ran = new int[7];
        for (int i = 0;i < ran.length;i++){
            ran[i] = (int) (Math.random() * 10) + 1;
            System.out.print(ran[i] + " ");
        }
        System.out.println();
        for (int i = 0;i < ran.length;i++){
            for (int j = 0;j < ran[i];j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
