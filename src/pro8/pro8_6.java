package pro8;

public class pro8_6 {
    public static void main(String[] args) {
        int a = 11;
        int b = 37;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    private static int gcd(int a,int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b,a % b);
    }

    private static int lcm(int a,int b){
//        return (a * b) / gcd(a,b);
        return a / gcd(a,b) * b;
    }
}
