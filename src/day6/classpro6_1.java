package day6;

public class classpro6_1 {
    public int max (int n1,int n2,int n3){
        if(n1 > n2){
            if(n1 > n3){
                return n1;
            }else if(n3 > n1){
                return n3;
            }
        }else if(n2 > n3){
            return n2;
        }
            return n3;
    }

    public int min (int n1,int n2,int n3){
        if(n1 < n2){
            if(n1 < n3){
                return n1;
            }else if(n3 < n1){
                return n3;
            }
        }else if(n2 < n3) {
            return n2;
        }
            return n3;
    }
}
