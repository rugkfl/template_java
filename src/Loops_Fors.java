// refer : https://www.w3schools.com/java/java_for_loop.asp
public class Loops_Fors {
    public static void main(String[] args){
        /*
            for 동작 위한 조건 : 반복 횟수, 종료 조건
            statement 1 : 시작점
            statement 2 : 종료 조건
            statement 3 : 반복 횟수
          for (statement 1 ; statement 2 ; statement 3) {
          }
         */
        /*
        예제 : 1 부터 5 까지 1씩 증가하며 출력하는 것
         */
        // for (int count = 1; count <= 5; count = count + 1 ) {
        // }
        for (int count = 1; count <= 5; count++) {
            System.out.println("For Count : "+count);    
        }
        System.out.println("Hello Main !");
    }
}



