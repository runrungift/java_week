package day5;

public class pro5_3 {
    public static void main(String[] args) {
        int[] data = new int[10];
        for (int i = 0;i < data.length;i++) {
            data[i] = (int) (Math.random() * 100) + 1;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.print("奇数:");
        for (int i = 0;i < data.length;i++){
            if(data[i] % 2 != 0){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
        System.out.print("偶数:");
        for (int i = 0;i < data.length;i++){
            if(data[i] % 2 == 0){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}
