package coding_test.programmers;
// import java.util.ArrayList;


public class Solution_120850 {
    public static void main(String[] args){
        String my_string = "hi12392";
        String intStr = my_string.replaceAll("[^0-9]", "");
        int[] intArray = new int[intStr.length()];
        System.out.println(intArray);
        // ArrayList<Integer> list = new ArrayList<>();
        
        
    }
}
// // public class Solution_120850 {
// //     public int[] solution(String my_string) {
// //         int[] answer = {};

// //         ArrayList<Integer> list = new ArrayList<>();
// //         String intstr = my_string.replaceAll("[^0-9]", "");
// //         // 숫자가 아닌 부분을 공백으로 바꿔달라는 의미
        
        
// //         return answer;
// //     }

// //     // vscode 출력을 위한 코드
// //  public static void main(String[] args){
// //     Solution_120850 solution = new Solution_120850();
// //     int[] inputBox = {10, 8, 6};
// //     int n = 3;
// //     int result = solution.solution(inputBox, n);
// //     System.out.println(result);
// // }
// }