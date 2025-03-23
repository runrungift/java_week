package day5;

public class pro5_9 {
    public static void main(String[] args) {
        int[] ran = new int[10];
        for (int i = 0;i < ran.length;i++){
            ran[i] = (int) (Math.random() * 100) + 1;
            System.out.print(ran[i] + " ");
        }
        System.out.println();
        System.out.print("50以上: ");
        for (int i = 0;i < ran.length;i++){
            if(ran[i] >= 50)
                System.out.print(ran[i] + " ");
        }
        System.out.println();
        System.out.print("50未満: ");
        for (int i = 0;i < ran.length;i++){
            if(ran[i] < 50)
                System.out.print(ran[i] + " ");
        }
        System.out.println();
    }
}
