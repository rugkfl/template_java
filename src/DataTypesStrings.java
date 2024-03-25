// refer: https://www.w3schools.com/java/java_strings.asp

public class DataTypesStrings {
    public static void main(String[] agrs){        
        // String
        String strFirst = "Hello !";
        String strSecond = new String("World !");
        // strFirst instanceof String
        // true
        // strSecond instanceof String
        // true

        // strFirst.length()
        // 7

        // strSecond.length()
        // 7

        // strSecond.concat(strFirst)
        // "World !Hello !"

        //strFirst.replaceAll("l", "R")
        // "HeRRo !"
        // String strThird = strFirst.replaceAll("l", "R") => 가능
        // strThird = strFirst.replaceAll("ll", "RR")  => 가능

        System.out.println("String First : "+strFirst);
        System.out.println("String Second : "+strSecond);

        return;

    }
}

// length() : 문자열 길이
// concat() : 변수끼리 병합
// replace() : 하나만 지정해서 바꾸고 싶을 때 => A중에 하나만 B로 change
// replaceAll("A", "B") : 전체를 바꾸고 싶을 때 => A인 부분들을 다 B로 change
