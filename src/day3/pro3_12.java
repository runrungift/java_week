package day3;

public class pro3_12 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 20) + 1 - 10;
        System.out.println(num);
        if(num < 0){
            System.out.println("負の値です");
        }else if(num > 0){
            System.out.println("正の値です");
        }else {
            System.out.println("0です");
        }
    }
}
