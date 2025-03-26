package pro8;

public class pro8_12 {
    public static final int MAX = 30;
    public static void main(String[] args) {
        int[] s = new int[MAX];
        s[0] = 1;
        s[1] = 1;
        s[2] = 2;
        System.out.printf("%d %d %d ",s[0],s[1],s[2]);
        for (int i = 3;i < MAX;i++){
            s[i] = s[i - 1] + s[i - 2] + s[i - 3];
            System.out.printf("%d ",s[i]);
        }
        System.out.printf("\n");
    }
}
