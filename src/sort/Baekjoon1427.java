package sort;

import java.util.Scanner;

public class Baekjoon1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] counting = new int[10];

        int n = sc.nextInt();

        while(n!=0){
            counting[n%10]++;
            n/=10;
        }

        for(int i = 9; i>=0; i--){
            while(counting[i]-->0){
                System.out.print(i);
            }
        }
    }
}

//counting sort를 사용한 정렬
//데이터의 값이 몇번 나왔는지를 카운팅.
//배열을 순회하면서 나온 값을 하나씩 count+1시킴
//그렇게 나온 모든 값으 누적합을 구함
//그렇게 기존 배열과 비교하여 값이 있다면 해당 idx - 1 한 값의 인덱스의 배열에 삽입하여 배열 정렬.