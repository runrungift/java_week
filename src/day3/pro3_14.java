package day3;

public class pro3_14 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        System.out.println("a = " + a + " b = " + b);
        if(a > b){
            System.out.println("aのほうが大きいです");
        }else if (b > a){
            System.out.println("bのほうが大きいです");
        }else {
            System.out.println("等しいです");
        }
    }
}
