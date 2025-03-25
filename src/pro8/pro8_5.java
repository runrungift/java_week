package pro8;

public class pro8_5 {
    public static final int MAX = 100;
    public static void main(String[] args) {
        for (int i = 1;i <= MAX;i++){
            if(i % 3 == 0 || ch(i,3) == 1){
                System.out.println(i);
            }
        }
    }

    private static int ch(int j, int a){
        while(j > 0){
            if(j % 10 == a){
                return 1;
            }else {
                j /= 10;
            }
        }
        return 0;
    }
}
