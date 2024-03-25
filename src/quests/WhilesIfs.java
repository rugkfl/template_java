package quests;

import java.util.Scanner;

public class WhilesIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Score : ");
            int intScore = scanner.nextInt();
            if (intScore >= 90) {
                System.out.println("A등급 입니다");   
            } else if (intScore < 90 && intScore >= 80) {
                System.out.println("B등급 입니다");  
            } else if (intScore < 80 && intScore >= 70) {
                System.out.println("C등급 입니다"); 
            } else if (intScore == -1) {
                System.out.println("종료 입니다");
                break;   
            } else {
                System.out.println("F등급 입니다");  
            }  
        }
        scanner.close();      
    }
}
