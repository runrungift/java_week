package day4;

public class pro4_3 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1;
        System.out.println(num);
        int i = 0;
        do {
            System.out.print("▪️");
            i++;
        }while (i < num);
    }
}
