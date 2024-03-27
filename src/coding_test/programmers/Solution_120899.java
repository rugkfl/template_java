package coding_test.programmers;
import java.util.ArrayList;
import java.util.Collections;



public class Solution_120899 {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        int max = Collections.max(list);
        int index = list.indexOf(max);

        answer[0] = max;
        answer[1] = index;
        return answer;
    }

    // vscode 출력을 위한 코드
    public static void main(String[] args){
        Solution_120899 solution = new Solution_120899();
        int[] inputArray = {1, 8, 3};
        int[] result = solution.solution(inputArray);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}