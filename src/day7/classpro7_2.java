package day7;

public class classpro7_2 {
    private String string1;
    private String string2;

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public String getConnectedString(){
        return string1 + string2;
    }
}
