package bruteforce;

import java.util.Scanner;

public class BaekjoonAdvanced2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String targetN = sc.nextLine(); //각 자리의 길이를 알기 위해 문자열로 입력 받음.

        int len = targetN.length(); //각 자리의 자릿수

        int N = Integer.parseInt(targetN); //입력받은 문자열을 다시 정수로 변환

        int res = 0;

        for(int i = N - (len*9); i<N; i++){ //N-(자릿수*9)부터 시작해서 탐색
            int num = i;
            int sum = 0;

            while(num!=0){
                sum+=num%10; //각 자릿수의 합
                num/=10; //각 자릿수 추출하기
            }
            if(sum+i == N){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}

//백준 2231(분해합 다른버전)
//기존에는 0~targetN값까지 모든 경우의 수를 탐색하여 시간이 걸림. -> 탐색 범위를 줄여 볼 순 없을까?
//특정 자연수 N을 만드는 생성자는 임의의 K+K..의 값임
//ex. 4자리 자연수라면 N(4) = K+k1+k2+k3+k4...가 됨.
// 식을 다르게 보면 K = N(4)-(k1+k2+k3+k4) 이게 된다.
// 그렇다면 K를 만족 시키는 가장 최소 범위는 무엇인가? 바로 각 자릿수가 모두 최대일때. 즉 N(4)-36이라면
// 해당 범위 미만의 수는 K의 가 될 수 있는 조건을 만족 시키지 못한다.
// 즉, 우리는 N-(9*자릿수) 목표 수에서 자릿수 갯수만큼 9를 빼준 곳에서 탐색을 시작하면 기존 방법보다 탐색 범위가 줄어듬


//결과 기존 196ms -> 176ms 단축.
