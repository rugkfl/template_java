import java.util.Scanner;

public class TypeCastIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두개 값 받기
        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();

        int intFrist = Integer.parseInt(strFirst);
        int intSecond = Integer.parseInt(strSecond);
        // str => int로 변환해준다.
        
        /*
        strFirst + strSecond
        "12"
        intFrist + intSecond
        3
         */

        scanner.close();
        
    }
}