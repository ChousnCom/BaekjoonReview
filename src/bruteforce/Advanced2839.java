package bruteforce;

import java.util.Scanner;

public class Advanced2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        System.out.println(findSugar(sugar));

    }
    public static int findSugar(int sugar) {
        int sum=0;
        if(sugar==4 || sugar==7){
            sum=-1;
        }else if(sugar%5==0){
            sum=sugar/5;
        }else if(sugar%5==1 || sugar%5==3){
            sum =(sugar/5)+1;
        }else if(sugar%5==2 || sugar%5==4){
            sum =(sugar/5)+2;
        }
        return sum;
    }
}

//기존에 구성했던 코드에서 아쉬운 부분이 있음
// }else if(sugar%5==1 || sugar%5==3 || sugar%5==6 || sugar%5 ==8){
//sum = (sugar/5)+1;
//        }else if(sugar%5==2 || sugar%5 ==4 || sugar%5==7|| sugar%5==9) {
//sum = (sugar/5)+2;
//        }

//생각 해보니 후의 조건이 중복 적용 된다는 사실임
//sugar%5 == 1 sugar%5==3 인데 사실 6%5== 1 8%5 == 이므로 뒤에 조건은 굳ㅇ 써주지 않아도 됨.
//해당 조건을 만족하여 리팩토링 해보겠음
//최대한 조건을 빼고 작성한 완성 코드임
