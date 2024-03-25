package quests;

import java.util.Scanner;

public class ForsIfs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intFirst = 2; // 고정값
        System.out.print("intSecond : "); 
        int intSecond = scanner.nextInt(); // 거듭제곱 해줄 수 입력
        for (int i = 1; i <= intSecond; i++) { // 입력받은 거듭제곱만큼 반복
            int intMul = (int) Math.pow(intFirst, i); // 2 ** (1~입력받은 거듭제곱)
            if (intMul % 4 == 0) { // 2에 거듭제곱 된 값 중에 4의 배수일 경우에만 출력
                System.out.println("answer:"+intMul);
            }
        }
        scanner.close();
    }
}

