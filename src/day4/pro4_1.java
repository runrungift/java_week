package day4;

public class pro4_1 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1;
        System.out.println(num);
        for (int i = 0;i < num;i++){
            System.out.print("▪️");
        }
    }
}
