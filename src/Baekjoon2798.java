import java.util.Scanner;
//백준 2798(부르트 포스 블랙잭)
//브루트포스? -> 수학적 노가다 가능한 모든 경우의 수를 찾기
//알고리즘 풀이 생각 -> 3장을 뽑아 가장 근접한 수를 찾는거라면 어원에 맞게 첫 idx 부터 마지막 idx 까지 가능한 모든 경우의 수를 찾기
//3중 반복으로 풀이
public class Baekjoon2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardCount = sc.nextInt(); // 최대 카드 갯수 지정
        int targetNum = sc.nextInt(); // 목표할 최종 합 지정
        int [] cardNum = new int[cardCount]; // 카드 번호 입력

        for(int i = 0 ; i < cardNum.length; i++){
            cardNum[i] = sc.nextInt();
        }

        int res = 0; // 결과를 담을 변수 초기화

        //처음부터 ~ 마지막-2까지 탐색 -> ex. 5 6 7 8 9 라면 7까지만 탐색
        for(int i = 0; i < cardCount-2; i++){

            //처음 그 다음 idx 부터 탐색 -> ex. 5 6 7 8 9 라면 처음의 첫 idx다음인 8까지 탐색
            for(int j = i+1 ; j < cardCount-1; j++){

                //3번째 idx부터 마지막까지 탐색 -> ex.5 6 7 8 9라면 9까지 전부 탐색
                //-> 여기까지 5~9까지 빠짐 없이 탐색하게 됨.
                for(int k = j+1 ; k < cardCount; k++){

                    int sum = cardNum[i] + cardNum[j] + cardNum[k]; // 가능한 모든 경우의 합 구하기

                    if(sum == targetNum){ //만약 탐색도중 목표 수와 동일할경우 탐색 stop.
                        res = sum;
                        break;
                    }

                    //만약 총 합계가 목표 수를 넘지 않고 기존 결과값이 다음 합 보다 작은 경우.
                    if(sum<targetNum && res<sum){
                        res = sum; //결과값을 다시 더 큰 수로 갱신 후 반환.
                    }
                }
            }
        }
        System.out.println(res);
    }
}