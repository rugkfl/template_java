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


// System.out.print와 System.out.println의 기본 차이
// System.out.print: 이 메소드는 지정된 데이터를 콘솔에 출력하고, 커서를 그대로 둡니다. 즉, 출력 후에 줄바꿈을 하지 않습니다. 
// System.out.println: 이 메소드는 지정된 데이터를 콘솔에 출력한 후, 커서를 다음 줄로 이동시킵니다. 즉, 출력 후에 자동으로 줄바꿈을 합니다. 
// 사용 예시
// System.out.print("intFirst : "); 코드는 사용자에게 입력을 요청하는 메시지를 출력하고, 사용자가 입력을 시작할 수 있도록 커서를 같은 줄에 둡니다. 이는 입력 프롬프트와 사용자의 입력이 같은 줄에 나타나게 하기 위함입니다.
// 반면, System.out.println("Sum : "+intResult); 코드는 계산된 합계를 출력하고, 출력 후에 커서를 다음 줄로 이동시킵니다. 이는 출력 내용을 구분하고 가독성을 높이기 위함입니다.
// System.out.print를 사용하는 이유는 사용자에게 입력을 요청하는 메시지를 출력한 후, 사용자가 바로 그 옆에서 입력할 수 있도록 하기 위함입니다. 반면, System.out.println은 출력 후에 줄바꿈을 하여, 출력 내용을 명확하게 구분하고자 할 때 사용됩니다. 
