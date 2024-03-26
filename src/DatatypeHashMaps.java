import java.util.HashMap;

public class DatatypeHashMaps {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        // 넣는 값이 key-value => String-String이 들어가기 때문에 두개의 String을 넣어줘야한다.(넣는 Datatype의 개수와 형태를 넣어줘야 한다.)
        // 값 넣기
        hashMap.put("England", "London");
        hashMap.put("Germany", "Berlin");
        hashMap.put("Norway", "Oslo");
        /*
            hashMap.get("Norway")
            "Oslo"
            hashMap.size()
            3
            hashMap.remove("Germany")
            "Berlin"
            hashMap.size()
            2
         */

        for (String key:hashMap.keySet()) {
            System.out.println("hashMap value with key : " + key + ", value : " +hashMap.get(key));
        }

        System.out.println("Hello World!");
       // return 0; 
    }
}
// haspmap은 python의 dictionary랑 유사한 개념
// haspmap은 key : value로 이루어진 자료구조
// hampmap은 순서가 없다.
// keySet() => key값만 보고싶을 때
// values() => value들만 보고싶을 때