package day4;

public class pro4_9 {
    public static void main(String[] args) {
        while (true){
            int i = (int) (Math.random() * 100) + 1;
            System.out.println(i);
            if(i % 10 == 0){
                break;
            }
        }
        System.out.println("end");
    }
}
