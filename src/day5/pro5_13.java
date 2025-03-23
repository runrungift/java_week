package day5;

public class pro5_13 {
    public static void main(String[] args) {
        int[][] ran = new int[3][3];
        int min = 9,max = 0;
        for (int i = 0;i < ran.length;i++){
            for (int j = 0;j < ran[i].length;j++){
                ran[i][j] = (int) (Math.random() * 10);
                if(ran[i][j] < min)
                    min = ran[i][j];
                if(ran[i][j] > max)
                    max = ran[i][j];
                System.out.print(ran[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("min:" + min);
        System.out.println("max:" + max);
    }
}
