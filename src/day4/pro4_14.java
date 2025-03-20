package day4;

public class pro4_14 {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 10) + 1;
        char c;
//        System.out.println(i);
        if(i % 2 == 0){
            c = '★';
        }else {
            c = '☆';
        }
        for (int j = 0;j < i;j++){
            System.out.print(c);
        }
        System.out.println();
    }
}
