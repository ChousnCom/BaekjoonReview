package bruteforce;

import java.util.Scanner;

//백준 2798 복습
public class BaekjoonReview2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cardCount = sc.nextInt();
        int targetNum = sc.nextInt();
        int[] cards = new int[cardCount];

        for (int i = 0; i < cardCount; i++) {
            cards[i] = sc.nextInt();
        }

        int res = 0;

        for (int i = 0; i < cardCount-2; i++) {
            if(cards[i] > targetNum) continue; //분석 -> 첫 번째로 뽑은 카드가 목표 카드보다 크면? skip

            for(int j = i+1; j < cardCount-1; j++){
                if(cards[i] + cards[j] > targetNum) continue; // 분석 -> 두 카드의 합이 이미 목표 수 보다 크다면? skip

                for(int k = j+1; k < cardCount; k++){

                    int sum = cards[i] + cards[j] + cards[k];

                    if(sum == targetNum){ // 만약 세 카드의 합이 동일하다면? 합 반환 -> 목표 수와 동일한 합이 최대이기 때문.
                        res = sum;
                    }

                    if(sum<targetNum && res<sum){ //만약 세 카드의 합이 목표 보다 작고, 이전 카드의 합이 다른 합 보다 작다면?
                        res = sum; //더 큰 합으로 갱신.
                    }
                }
            }

        }
        System.out.println(res);

    }
}
