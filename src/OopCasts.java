import java.util.ArrayList;
import java.util.HashMap;
public class OopCasts {
    public static void main(String[] args) {
        ArrayList<String> listFirst = new ArrayList<>();
        // Array에 값 입력
        listFirst.add("Volvo");
        listFirst.add("3");
        listFirst.add("Ford");
        int index = 0;
        for(String obj:listFirst) {
            String temp = obj;
        }

        HashMap<String, Object> question = new HashMap<>();
        question.put("문제", "Python에서 변수를 선언하는 방법은? (점수: 10점)");
        question.put("답항", "1) var name, 2) name=value, 3) set name, 4) name == value");
        question.put("사용자답", 3);
        question.put("Cars", listFirst);

        String strFirst = (String) question.get("문제");
        int intSecond = (int) question.get("사용자답");
        ArrayList<String> arrayList = (ArrayList<String>) question.get("Cars");
        System.out.println("Hello World!");
    }
}

// ArrayList를 할 때 동일한 데이터타입의 값을 넣어주는게 좋다
// 왜냐하면 다른 데이터타입을 넣는 경우 object로 선언해주는데 이렇게 될 경우 for문에서 변수로 받을 수가 없다
// hashmap은 object를 넣어준다