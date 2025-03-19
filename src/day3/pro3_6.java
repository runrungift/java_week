package day3;

public class pro3_6 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println(num);
        if(num >= 3){
            System.out.println("3以上です");
        }
    }
}
