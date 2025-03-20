package day4;

public class pro4_8 {
    public static void main(String[] args) {
        while (true){
            int i = (int) (Math.random() * 10) + 1;
            System.out.println(i);
            if(i == 10){
                break;
            }
        }
        System.out.println("end");
    }
}
