package bruteforce;

//방법을 바꿔보자.. 원래는 노가다 해서 while로 큰수는 5씩 빼서 남은 일의 자릿수로 판단을 하려 했으나
// 12 처럼 3kg 4개로 설탕을 옮길 수 있음에도 불구하고, -1로 출력됨/


// 나누는 조건을 구현해서 해당하는 몫을 더한다면? 어떨까?

    import java.util.Scanner;

    public class Baekjoon2839 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int sugar = sc.nextInt();
            System.out.println(findSugar(sugar));

        }

        public static int findSugar(int sugar){
            int sum = 0;
            if(sugar % 5 == 0){
                sum= sugar/5;
            }
            else if(sugar == 4 || sugar == 7) {
                sum = -1;
            }else if(sugar%5==1 || sugar%5==3 || sugar%5==6 || sugar%5 ==8){
                sum = (sugar/5)+1;
            }else if(sugar%5==2 || sugar%5 ==4 || sugar%5==7|| sugar%5==9) {
                sum = (sugar/5)+2;
            }
            return sum;
        }
    }

//입력받을 sugar 변수 선언
//findSugar ==> 옮길 수 있는 최소 개수의 주머니 findSugar메서드 선언
// 각 분기점에 맞게 sum 변수에 최소 설탕 봉지 갯수 저장
// 고안). 일의 자리가 4 or 7일 경우 3 이나 5로 절대 나눌 수 없은 == 어떠한 방법으로 설탕을 옮길 수 있는 방법이 나오지 않음
// return -1
// 설탕 봉지의 최소 개수를 찾아야 하므로 5의 배수라면 5로나눈 몫을 return == 이때 몫이 설탕 봉지의 갯수임
// 12 같은 경우에는 3으로 4개를 옮길 수 있지만 3의 배수를 이용하여 찾지 않는 이유느 최소 갯수가 보장이 안되기 때문
// 남은 조건에서 두자리 이상의 경우 일의 자리가 1,3,6,8과 같은 경우 기존 몫에 +1을 해줘야 함.
// 일의 자리가 2 4 7 9 와 같은 경우 나눈 몫에 +2를 해주면 알맞은 해를 찾을 수 있음.
