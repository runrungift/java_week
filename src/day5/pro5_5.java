package day5;

public class pro5_5 {
    public static void main(String[] args) {
        int[] data = new int[10];
        for (int i = 0;i < data.length;i++) {
            data[i] = (int) (Math.random() * 10) + 1;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.print("3の倍数:");
        for (int i = 0;i < data.length;i++){
            if(data[i] % 3 == 0){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
        System.out.print("3の倍数以外:");
        for (int i = 0;i < data.length;i++){
            if(data[i] % 3 != 0){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}
