package pro8;

public class pro8_8 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000) + 1;
        System.out.printf("%d\n",n);
        for (int i = 1;i <= n;i++){
            if(n % i == 0){
                System.out.printf("%d ",i);
            }
        }
        System.out.printf("\n");
    }
}
