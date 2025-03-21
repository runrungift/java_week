package day5;

public class pro5_6 {
    public static void main(String[] args) {
        int[] data = new int[10];
        int sum = 0,min = 10,max = 0;
        for (int i = 0;i < data.length;i++){
            data[i] = (int) (Math.random() * 10) + 1;
            System.out.print(data[i] + " ");
            if(data[i] < min){
                min = data[i];
            }
            if(data[i] > max){
                max = data[i];
            }
            sum += data[i];
        }
        System.out.println();
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println(sum);
        System.out.println("ave:" + (sum / data.length));
    }
}
