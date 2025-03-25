package pro8;

public class pro8_4 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000) + 1;
        System.out.println(n);
        int i = 0;
        while (n > 0){
            i++;
            n /= 10;
//            System.out.println(n);
        }
        System.out.println(i);
    }
}
