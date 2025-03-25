package pro8;

public class pro8_3 {
    public static final int MAXN = 12;
    public static void main(String[] args) {
        int ans = 1;
        for (int i = MAXN;i > 0;i--){
            ans *= i;
        }
        System.out.println(ans);
    }
}
