package pro8;

public class pro8_11 {
    public static final int MAX = 40;
    public static void main(String[] args) {
        int[] s = new int[MAX];
        s[0] = 1;
        s[1] = 1;
        System.out.printf("%d %d ",s[0],s[1]);
        for (int i = 2;i < MAX;i++){
            s[i] = s[i - 1] + s[i - 2];
            System.out.printf("%d ",s[i]);
        }
        System.out.printf("\n");
    }
}
