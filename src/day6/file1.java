package day6;

public class file1 {
    public static void main(String[] args) {
        classfile1 s = new classfile1();
        s.n = 100;
        s.s = "Hello";
        int ans = s.add(1,2);
        String str = s.add("World");
        System.out.println(ans);
        System.out.println(str);
        s.showNum();
    }
}
