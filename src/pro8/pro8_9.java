package pro8;

public class pro8_9 {
    public static void main(String[] args) {
        for (int i = 1;i <= 10000;i++){
            if(i == sum(i)){
                System.out.printf("%d ",i);
            }
        }
        System.out.printf("\n");
    }

    private static int sum(int n){
        int sum = 0;
        for (int i = 1;i < n;i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        return sum;
    }
}
