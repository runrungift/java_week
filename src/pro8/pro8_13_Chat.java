package pro8;

import java.util.Arrays;
import java.util.Random;

public class pro8_13_Chat {
    public static final int MAX = 10;
    public static final int MAX_TESTS = 1000; // 1000回テスト

    public static void main(String[] args) {
        Random rand = new Random();
        boolean hasBug = false;

        for (int i = 0; i < MAX_TESTS; i++) {
            int[] a = new int[MAX];
            for (int j = 0; j < MAX; j++) {
                a[j] = rand.nextInt(100) + 1; // 1~100のランダムな数
            }

            int[] expected = a.clone();
            Arrays.sort(expected); // 正しいソート

            sortUp(a); // 元のソートを実行

            if (!Arrays.equals(a, expected)) {
                System.out.println("バグ発生！元の配列: " + Arrays.toString(expected));
                System.out.println("誤った結果: " + Arrays.toString(a));
                hasBug = true;
                break;
            }
        }

        if (!hasBug) {
            System.out.println("1000回のテストでバグは見つかりませんでした。");
        }
    }

    private static void sortUp(int[] a) {
        int count = 0;
        int min;
        min = a[0];
        while (count < MAX - 1) {
            for (int i = MAX - 1; i > count; i--) {
                if (a[i] < min) {
                    min = a[i];
                    a[i] = a[count];
                    a[count] = min;
                }
            }
            count++;
            min = a[count];
        }
    }
}
