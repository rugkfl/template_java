// refer : https://www.w3schools.com/java/java_for_loop.asp

import java.util.ArrayList;

public class LoopsFors {
    public static void main(String[] args){
        ArrayList<String> listFirst = new ArrayList<String>();
        // casting : list안에 어떤 Datatype이 들어가는지 명시해줘야 함 => ArrayList<String> listFirst

        // 값 넣기
        listFirst.add("Volve");
        listFirst.add("BMW");
        listFirst.add("Ford");
        // => listFirst("Volve", "BMW", "Ford")
        /*
            for 동작 위한 조건 : 반복 횟수, 종료 조건
            statement 1 : 시작점
            statement 2 : 종료 조건
            statement 3 : 반복 횟수
          for (statement 1 ; statement 2 ; statement 3) {
          }
         */

        // for-loop
        for (int i = 0; i < listFirst.size(); i++) {
            System.out.println("for count : "+listFirst.get(i));
        }

        /*
        예제 : 1 부터 5 까지 1씩 증가하며 출력하는 것
         */
        // for (int count = 1; count <= 5; count = count + 1 ) {
        // }

        for (int count = 1; count <= 5; count++) {
            System.out.println("For Count : "+count);    
        }

        // for-each
        // for (type variableName : arrayName) {
        //     // code block to be executed
        //   }
        for (String str:listFirst) {
            System.out.println("for each :"+str);
        }
        

        System.out.println("Hello Main !");
        // return 0;
    }
}



