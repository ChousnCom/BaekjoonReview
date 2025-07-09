package bruteforce;

import java.util.Scanner;

public class Bakejoon1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int num = 666;
        int count = 1;

        while(count!=N){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);

    }
}

//String.ValueOf();
//-> null 값 처리 가능 해당 값에 null이 들어와도 NullPointer 예외 대신 "null"로 반환.
//-> 기존 정수 1을 "1" 만들 때 (String) num으로 형변환 시도시 -> ClassCastException 던지는 반면 -> valueOf는 의도대로 "1" 반환.


//contains메서드
//대상에 특정 문자열이 포함되어 있는지를 확인하는 역할.
//특정 문자열이 포함되어 있다면 true, 없다면 false 반환
//contains는 대소문자 구분 / 공백도 구분


// 그래서 if문 조건문 해석은 => 기존에 선언했던 정수형 666을 "666"으로 형변환 후 -> 해당 문자열에 "666"이라는 값이 포함되어 있는지를
// true or false로 반환.