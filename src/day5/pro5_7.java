package day5;

public class pro5_7 {
    public static void main(String[] args) {
        int[] data = new int[5];
        int sum = 0,min = 10,max = 0,ave;
        for (int i = 0;i < data.length;i++){
            data[i] = (int) (Math.random() * 10) + 1;
            System.out.print(data[i] + " ");
            sum += data[i];
        }
        ave = sum / data.length;
        System.out.println();
        System.out.println(sum);
        System.out.println("ave:" + ave);
        System.out.print("平均より大きい:");
        for (int i = 0;i < data.length;i++){
            if(data[i] > ave){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
        System.out.print("平均より小さい:");
        for (int i = 0;i < data.length;i++){
            if(data[i] < ave){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}
