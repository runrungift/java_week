package day4;

public class pro4_13 {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 10) + 1;
//        System.out.println(i);
        if(i >= 5){
            for (int j = 0;j < i;j++){
                System.out.print("★");
            }
            System.out.println();
        }else {
            System.out.println(i);
        }
    }
}
