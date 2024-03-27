package coding_test.programmers;

public class Solution_120845 {
    public int solution(int[] box, int n) {
        int answer = 0;
        int boxVolume = 1;
        int divide = 0;
       for (int i = 0; i < box.length; i++){
            divide = box[i] / n;
            boxVolume *= divide;
       }
        answer = boxVolume;
        return answer;
    }

    // vscode 출력을 위한 코드
 public static void main(String[] args){
    Solution_120845 solution = new Solution_120845();
    int[] inputBox = {10, 8, 6};
    int n = 3;
    int result = solution.solution(inputBox, n);
    System.out.println(result);
}
}

 


