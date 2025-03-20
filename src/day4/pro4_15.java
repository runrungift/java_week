package day4;

public class pro4_15 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            System.out.print(i + " ");
            if(i % 10 == 0){
                System.out.println();
            }
            i++;
        }
    }
}
