package day4;

public class file6 {
    public static void main(String[] args) {
        System.out.println("6が出るまで");
        while (true){
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println(dice);
            if (dice == 6){
                break;
            }
        }
        System.out.println("end");
    }
}
