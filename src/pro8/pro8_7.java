package pro8;

public class pro8_7 {
    public static void main(String[] args) {
//        n[0] , n[2] = 分子 , n[1] , n[3] = 分母
        int[] n = new int[4];
//        ans[0] = 分子 , ans[1] = 分母 , ans[2] = 整数部
        int[] ans = new int[3];
        for (int i = 0;i < n.length;i++){
            n[i] = (int) (Math.random() * 10)  + 1;
        }
        add(n,ans);
        show(ans);
        System.out.printf("\n");
    }

//    最大公約数を求める
    private static int gcd(int a,int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b,a % b);
    }

//    最小公倍数を求める
    private static int lcm(int a,int b){
//        return (a * b) / gcd(a,b);
        return a / gcd(a,b) * b;
    }

//    aをかけたらbになる数を求める
    private static int lcmmul(int a,int b){
        return b / a;
    }

//    約分をする
//    a[0] = 分子 , a[1] = 分母
//    配列の値を変更する
    private static void sim(int[] a){
        int gcd = gcd(a[0],a[1]);
        a[0] /= gcd;
        a[1] /= gcd;
    }

//      通分する
    private static void intoDiv(int[] a){
        int lcm = lcm(a[1],a[3]);

//        分子をそろえる
//        分子にかける数を求める
        a[0] *= lcmmul(a[1],lcm);
        a[2] *= lcmmul(a[3],lcm);

//        分母をそろえる
        a[1] = lcm;
        a[3] = lcm;
    }

//    整数部を求める
    private static void mix(int[] a){
        while (a[0] >= a[1]){
            a[0] -= a[1];
            a[2]++;
        }
    }

//    分数の足し算
    private static void add(int[] a,int[] b){
        showPlus(a);
//        分母が同じでないなら通分する
        if(a[1] != a[3]){
            intoDiv(a);
        }
        b[0] = a[0] + a[2];
        b[1] = a[1];
        b[2] = 0;

        simP(b);
    }

//    約分・帯分数化
    private static void simP(int[] a){
        sim(a);
        if (a[0] >= a[1]){
            mix(a);
        }
    }

//    分数を表示する
//    a[0] = 分子 , a[1] = 分母 , a[2] = 整数部
    private static void show(int[] a){
        if(a[0] == 0){
            System.out.printf("%d",a[2]);
        }else if(a[2] == 0){
            System.out.printf("%d / %d",a[0],a[1]);
        }else {
            System.out.printf("%d . %d / %d",a[2],a[0],a[1]);
        }
    }

//    値を変えないで帯分数表示または整数表示または約分済み表示する
    private static void showPlus(int[] a){
        int[] b = new int[3];
        b[0] = a[0];
        b[1] = a[1];
        b[2] = 0;
        simP(b);
        show(b);
        System.out.printf(" + ");
        b[0] = a[2];
        b[1] = a[3];
        b[2] = 0;
        simP(b);
        show(b);
        System.out.printf(" = ");
    }
}
