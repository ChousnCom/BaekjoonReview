package bruteforce;

import java.util.Scanner;

    public class Baekjoon19532 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();

            int res1 = 0;
            int res2 = 0;
            for(int i = -999; i<=999; i++){
                for(int j = -999; j<=999; j++){
                    if(a*i + b*j ==c){
                        if(d*i + e*j == f)  {
                            res1 = i;
                            res2 = j;
                        }
                    }
                }
            }
            System.out.println(res1 + " " + res2);
        }
    }

//백준 19532 연립 방정식
//두 수식을 만족하는 x,y를 찾아라..
// x의 계수 y의 계수 각 결과값을 서로 곱해서 나오는 값으로 일치 시키면 되지 않을까?
//범위는 -999 ~ 999


    //풀이
    //ax + by = c, dx + ey = f 면
    //a*x + b*y = c인 경우 d*x + e*y = f을 만족하는 x,y의 값을 동시에 탐색 -999 ~ 999까지
