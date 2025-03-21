package day5;

public class file2 {
    public static void main(String[] args) {
        double[] d = new double[3];
        double sum , avg;
        d[0] = 1.2;
        d[1] = 3.7;
        d[2] = 4.1;
        sum = 0.0;
        for (int i = 0;i < d.length;i++){
            System.out.print(d[i] + " ");
            sum +=d[i];
        }
        System.out.println();
//        avg = sum / d.length;
//        System.out.printf("sum:%f ave:%f\n",sum,avg);
        avg = sum / 3.0;
        System.out.println(sum);
        System.out.println(avg);
    }
}
