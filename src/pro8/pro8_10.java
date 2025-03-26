package pro8;

public class pro8_10 {
    public static void main(String[] args) {
        int[] n = new int[10];
        int[] even = new int[10]; // 偶数
        int[] odd = new int[10]; // 奇数
        for (int i = 0;i < n.length;i++){
            n[i] = (int) (Math.random() * 100) + 1;
            System.out.printf("%d ",n[i]);
            even[i] = 0;
            odd[i] = 0;
            if(n[i] % 2 == 0){
                even[i] = n[i];
            }else{
                odd[i] = n[i];
            }
        }
        System.out.printf("\n偶数:");
        for (int i = 0;i < even.length;i++){
            if(even[i] != 0){
                System.out.printf("%d ",even[i]);
            }
        }
        System.out.printf("\n奇数:");
        for (int i = 0;i < odd.length;i++){
            if(odd[i] != 0){
                System.out.printf("%d ",odd[i]);
            }
        }
        System.out.printf("\n");
    }
}
