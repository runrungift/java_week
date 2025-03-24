package day7;

public class classfile1 {
    public classfile1(){
        System.out.println("コンストラクタ");
    }

    private void method1(){
        System.out.println("method1(private)");
    }

    public void method2(){
        System.out.println("method2(public)");
    }

    public void method3(){
        method1();
        System.out.println("method3(public) : num = " + this.num);
    }

    private int num = 1;
}
