package day5;

public class pro5_12 {
    public static void main(String[] args) {
        int[][] ran = new int[3][3];
        for (int i = 0;i < ran.length;i++){
            for (int j = 0;j < ran[i].length;j++){
                ran[i][j] = (int) (Math.random() * 10);
                System.out.print(ran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
