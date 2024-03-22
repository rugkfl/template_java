// 외부 입력울 받을 수 있음
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // 자원을 할당을 받고
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt(); // 숫자 / 파이썬의 int(input())
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt(); // 숫자


        scanner.close(); // 자원을 반납한다. => 자바에서는 이 과정을 해줘야지 나중에 문제가 안생긴다
    }
}

