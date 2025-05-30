import java.util.Scanner;

public class Baekjoon2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetN = sc.nextInt(); //생성자를 구할 자연수를 입력.

        int res = 0;
        for (int i = 0; i < targetN; i++) {
            int number = i;
            int sum = 0;

            while (number!=0) { //0이 종료 조건 == 각 자릿수를 모두 더했다는 뜻
                sum += number % 10; // 각 자릿수의 합
                number /= 10; //각 자릿수를 추출
            }
            if (sum + i == targetN) { //자릿수와 해당 자릿수에 해당하는 값의 합이 목표 값과 같다면
                res = i;
                break; // 탐색 끝.
            }
        }
        System.out.println(res);
    }
}

//발상 -> 브루트포스(분해합 문제)
//245 = 2+4+5+245 =256 따라서 245는 256의 생성자임
//그렇다면 각 자릿수의 1부터 모든 경우의 수를 찾아보면 되지않을까?
//ex. 1+1 + 11 / 1+2+12 + 1+3+13 ....... 9+9까지 이런식으로 전부 탐색해서 값을 찾아보자.

