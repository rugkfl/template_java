public class Ifs {
    public static void main(String[] args){
        // if (condition) {
        // } else if (condition) {
        // } else {
        // }
        // 상황에 따라서는 if만 써도 됨
        // 두가지 조건일 경우 if, else
        // 여러개의 조건일 경우 if, else if, else

        /* 
            예제 : 시간에 따른 영어 인사
            Good morning : 6 ~ 11 
            Good day : 11 ~ 17
            Good evening : 17 ~ 23
        */ 
        
        int hour = 11;
        if (hour <= 11 ) { // Good morning : 6 ~ 11 
            System.out.println("Good morning !");
        } else if (hour <= 17) { // Good day : 11 ~ 17
            System.out.println("Good day !");
        } else { //  Good evening : 17 ~ 23
            System.out.println("Good evening !");
        }
        System.out.println("Hello Main !");



        /* 
            예제 : 시간에 따른 영어 인사, and 조건 추가 개선
            Good morning : 6 ~ 11 
            Good day : 11 ~ 17
            Good evening : 17 ~ 23
        */ 
        
        // error : Duplicate local variable hourJava, 해결 Datatype 정리
        // int hour = 11; => 수정전
        hour = 24; // =>  수정 후
        if ((6 <= hour) && (hour <= 11) ) { // Good morning : 6 ~ 11 
            System.out.println("Good morning !");
        } else if ((11 <= hour) && (hour <= 17)) { // Good day : 11 ~ 17
            System.out.println("Good day !");
        } else if ((18 <= hour) && (hour <= 23)) {  //  Good evening : 17 ~ 23
            System.out.println("Good evening !");
        } else { 
            System.out.println("Don't know !");
        }
        System.out.println("Hello Main !");

        /*
         (6 <= hour) && (hour <= 11)
        false
        (6 <= hour)
        true
        (hour <= 11)
        false
         */
    }
}




