package day6;

public class file2 {
    public static void main(String[] args) {
        classfile1 s1,s2;
        s1 = new classfile1();
        s2 = new classfile1();
        s1.n = 100;
        s2.n = 200;
        s1.s = "ABC";
        s2.s = "あいう";
        System.out.println(s1.add("DEF"));
        System.out.println(s2.add("えお"));
        s1.showNum();
        s2.showNum();
    }
}
