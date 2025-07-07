package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //응시자 수 
        int k = sc.nextInt(); // 상을 받는 사람 수
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[N-k]);
    }
}
