package day5;

public class pro5_8 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int up = 0,down = 0;
        for (int i = 0;i < num.length;i++){
            num[i] = (int) (Math.random() * 20) + 1 - 10;
            System.out.print(num[i] + " ");
            if(num[i] > 0){
                up++;
            }else if(num[i] < 0){
                down++;
            }
        }
        System.out.println();
        System.out.println("0より大きい:" + up);
        System.out.println("0より小さい:" + down);
        System.out.println("0の数:" + (num.length - up - down));
    }
}
