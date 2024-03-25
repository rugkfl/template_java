package quests;

import java.util.Scanner;

public class ForsIfs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intFirst = 2;
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();
        for (int i = 1; i <= intSecond; i++) {
            int intMul = (int) Math.pow(intFirst, i);
            if (intMul % 4 == 0) {
                System.out.println("answer:"+intMul);
            }
        }
        scanner.close();
    }
}

