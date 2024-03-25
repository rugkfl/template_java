package quests;

import java.util.Scanner;
import java.util.ArrayList;

public class pollsWithoutDB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listQuestion = new ArrayList<String>();
        ArrayList<String> listOption = new ArrayList<String>();
        ArrayList<String> listAnswer = new ArrayList<String>();

        listQuestion.add("1. 인터스텔라 선호도");
        listQuestion.add("2. 해리포터 선호도");
        listQuestion.add("3. 아바타 선호도");

        listOption.add("1) 좋음 2) 중간 3) 나쁨");

        for (int i = 0; i < listQuestion.size(); i++) {
            System.out.println("question :" +listQuestion.get(i));
            System.out.println("option:" +listOption);
            System.out.print("answer : ");
            String strAnswer = scanner.nextLine();
            listAnswer.add(strAnswer);
        }
        System.out.println("답한 내용 출력 : "+listAnswer);
        scanner.close();
    }
}
