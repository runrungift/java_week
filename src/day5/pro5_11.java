package day5;

public class pro5_11 {
    public static void main(String[] args) {
        int[] ran = new int[5];
        for (int i = 0;i < ran.length;i++){
            ran[i] = (int) (Math.random() * 100) + 1;
            System.out.print(ran[i] + " ");
        }
        System.out.println();
        System.out.print("0~59:");
        for (int i = 0;i < ran.length;i++){
            if(ran[i] < 60)
                System.out.print(ran[i] + " ");
        }
        System.out.println();
        System.out.print("60~79:");
        for (int i = 0;i < ran.length;i++){
            if(ran[i] >= 60 && ran[i] < 80)
                System.out.print(ran[i] + " ");
        }
        System.out.println();
        System.out.print("80~:");
        for (int i = 0;i < ran.length;i++){
            if(ran[i] >= 80)
                System.out.print(ran[i] + " ");
        }
        System.out.println();
    }
}
