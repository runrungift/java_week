package day4;

public class file5 {
    public static void main(String[] args) {
        int i , num;
        num = 1;
        System.out.println("while");
        i = 1;
        while (i < num){
            System.out.println("*");
            i++;
        }
        System.out.println();
        System.out.println("do-while");
        i = 1;
        do {
            System.out.println("*");
            i++;
        }while (i < num);
    }
}
