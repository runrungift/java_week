package pro8;

public class pro8_13 {
    public static final int MAX = 10;
    public static final int MAX_NUM = 10;

//    public static void main(String[] args) {
//        int[] a = new int[MAX];
//        int[] b = new int[MAX];
//        int[] t = new int[MAX];
//        int[] f = new int[MAX];
//        int count = 0;
//        addRandom(a);
//        addRandom(b);
//        showArray(a);
//        showArray(b);
//        sortUp(a);
//        sortUp(b);
//        for (int i = 0;i < MAX;i++){
//            for (int j = 0;j < MAX;j++){
//                if(a[i] == b[j]){
//                    if(count != 0){
//                        if(a[i] != t[count - 1]){
//                            t[count] = a[i];
//                            count++;
//                        }
//                    }else{
//                        t[count] = a[i];
//                        count++;
//                    }
//                    a[i] = 0;
//                    b[j] = 0;
//                }
//            }
//        }
//        rmDup(a,t);
//        rmDup(b,t);
//        sortUp(a);
//        sortUp(b);
//        count = 0;
//        int min_a = getMin(a);
//        int min_b = getMin(b);
//        while (min_a != 0 || min_b != 0){
//            if(min_a == 0){
//                if(count != 0){
//                    if(min_b != f[count - 1]){
//                        f[count] = min_b;
//                        count++;
//                        min_b = getMin(b);
//                    }else {
//                        min_b = getMin(b);
//                    }
//                }else {
//                    f[count] = min_b;
//                    count++;
//                    min_b = getMin(b);
//                }
//            }else if(min_b == 0){
//                if(count != 0){
//                    if(min_a != f[count - 1]){
//                        f[count] = min_a;
//                        count++;
//                        min_a = getMin(a);
//                    }else {
//                        min_a = getMin(a);
//                    }
//                }else {
//                    f[count] = min_a;
//                    count++;
//                    min_a = getMin(a);
//                }
//            }else if(min_a < min_b){
//                if(count != 0){
//                    if(min_a != f[count - 1]){
//                        f[count] = min_a;
//                        count++;
//                        min_a = getMin(a);
//                    }else {
//                        min_a = getMin(a);
//                    }
//                }else{
//                    f[count] = min_a;
//                    count++;
//                    min_a = getMin(a);
//                }
//            }else {
//                if(count != 0){
//                    if(min_b != f[count - 1]){
//                        f[count] = min_b;
//                        count++;
//                        min_b = getMin(b);
//                    }else {
//                        min_b = getMin(b);
//                    }
//                }else{
//                    f[count] = min_b;
//                    count++;
//                    min_b = getMin(b);
//                }
//            }
//        }
//        System.out.print("共通:");
//        showArray0(t);
//        System.out.println();
//        System.out.print("どちらか:");
//        showArray0(f);
//        System.out.println();
//    }

    public static void main(String[] args) {
        int[] a = {8,3,7,4,2,5,9,1,6,0};
        sortUp(a);
        showArray(a);
    }

    private static void sortUp(int[] a){
        int count = 0;
        int min;
        min = a[0];
        while (count < MAX - 1){
            for (int i = MAX - 1;i > count;i--){
                if(a[i] < min){
                    min = a[i];
                    a[i] = a[count];
                    a[count] = min;
                }
            }
            count++;
            min = a[count];
        }
    }

    private static void showArray(int[] a){
        for (int i : a) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    private static void showArray0(int[] a){
        for (int i : a) {
            if (i != 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static void addRandom(int[] a){
        for (int i = 0;i < a.length;i++){
            a[i] = (int) (Math.random() * MAX_NUM) + 1;
        }
    }

    private static int getMin(int[] a){
        int min = 0;
        for (int i = 0;i < a.length;i++){
            if(a[i] != 0){
                min = a[i];
                a[i] = 0;
                break;
            }
        }
        return min;
    }

    private static void rmDup(int[] a,int[] b){
        for (int i = 0;i < a.length;i++){
            for (int j : b) {
                if (a[i] == j && a[i] != 0) {
                    a[i] = 0;
                }
            }
        }
    }
}
