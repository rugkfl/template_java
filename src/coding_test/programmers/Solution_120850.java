package coding_test.programmers;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;



// public class Solution_120850 {
//     public static void main(String[] args){
//         String my_string = "p2o4i8gj2";
//         ArrayList<Integer> numbers = new ArrayList<>();
//         String intStr = my_string.replaceAll("[^0-9]", "");
//         for (int i = 0; i < intStr.length(); i++){
//             int changeInt = Character.getNumericValue(intStr.charAt(i)); // 숫자 형태의 char를 int형으로 변환/char는 단일 문자를 나타내는 데이터 타입(='H', 'e', 'l', 'l', 'o')
//             numbers.add(changeInt);
//         }

//        // 리스트 정렬
//        Collections.sort(numbers);

//         System.out.println(numbers);        
        
//     }
// }


public class Solution_120850 {
    public int[] solution(String my_string) {
        int[] answer = {};

        // ArrayList<Integer> list = new ArrayList<>();
        String intstr = my_string.replaceAll("[^0-9]", "");
        answer = new int[intstr.length()]; // 배열 크기 할당
        // 숫자가 아닌 부분을 공백으로 바꿔달라는 의미
        for (int i = 0; i < intstr.length(); i++) {
            int changeInt = Character.getNumericValue(intstr.charAt(i));
            answer[i] = changeInt; // 배열에 값을 할당
        }
        
        // 배열(int[]) 정렬
        Arrays.sort(answer);
        return answer;
    }

        // vscode 출력을 위한 코드
    public static void main(String[] args){
    Solution_120850 solution = new Solution_120850();
    String inputInt = "hi12392";
    int[] result = solution.solution(inputInt);
    System.out.println(result);
    }

}
