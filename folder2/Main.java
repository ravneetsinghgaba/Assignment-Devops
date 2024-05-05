package Codechef;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int num = s.nextInt();
            int n = Integer.toString(num).length();
            int[] arr = new int[n];
            for (int i = 0; num > 0; i++) {
                arr[i] = num % 10;
                num = num / 10;
            }
            Arrays.sort(arr);
            int a = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j + 1] - arr[j] > 2) {
                    a++;
                } else {
                    a = 0;
                }
            }
            if (a == 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            t--;
        }
    }
}