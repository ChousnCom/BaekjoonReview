package bruteforce;

import java.util.Scanner;

public class Baekjoon1018 {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        arr = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true; //W일때는 True.
                } else {
                    arr[i][j] = false; //B일때는 False;
                }
            }
        }
        int M_row = M - 7;
        int N_row = N - 7;
        for (int i = 0; i < M_row; i++) {
            for (int j = 0; j < N_row; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }
    public static void find(int x, int y){
        int end_x = x+8;
        int end_y = y+8;
        int count = 0;

        boolean TF = arr[x][y];
        for(int i = x; i < end_x; i++){
            for(int j = y; j < end_y; j++){

                if(arr[i][j] != TF) {
                    count++;
                }
                TF = (!TF);
            }
            TF = !TF;
        }
        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}


//백준 1018 체스판 다시 칠하기
//체스판을 다시 칠하는 경우 왼쪽 위칸이 W or B 일 경우
//크기가 8x8이 아닌 그 이상인 경우 다시 칠할 수 있는 최소 경우의 수를 찾아 8x8로 잘라야 함.
//8x8크기로 자를 수 있는 경우의 수를 구해야함.

//*풀이
//체스판을 만들기 위해서는 한 칸이 상하좌우 색과 다르면 됨. 체스판이 잘못 칠해져 있다면,
// 최소 개수로 칠할 수 있는 부분을 찾아야 함.
// 8x8로 잘라야 할때 나올 수 있는 체스판의 경우의 수
// 8x8일때 최소 크기일때 경우의 수 = 1개
// 8x9일때 8x8로 자를 수 있는 경우의 수 = 2개
// 9x9일때 8x8로 자를 수 있는 경우의 수 = 4개
// 즉, 입력 받은 행과 열이 확장됨에 따라 자를 수 있는 경우의 수는 (M-7)*(N-7);
// 체스판을 다시 칠하는 경우의 수 = 맨 왼쪽 위가 B or W일 경우 = 2;
// 총 경우의 수는 = 2*(M-7)(N-7);

