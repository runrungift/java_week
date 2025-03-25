package pro8;

public class pro8_1 {
    public static final int MAX = 100;

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1;i <= MAX;i++){
            for (int j = 1;j <= MAX;j++){
                for (int k = 1;k <= MAX;k++){
                    if(i * i + j * j == k * k){
                        count++;
                        System.out.println(count + ":" + i + " " + j + " " +  k + " " + (i * i + j * j) + " " + (k * k));
                    }
                }
            }
        }
    }
}
