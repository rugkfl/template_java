public class DataTypes {
    public static void main(String[] args){
        // Numbers
        int intFirst = 3; // 숫자
        System.out.println("Numbers int First : "+intFirst);
        // Type mismatch in case
        // intFirst = 5.2;
        // intFirst = "5.2";
        // mis result in case
        // intFirst = 2 / 3 => 0
        
        boolean boolFirst = true; // true(1), false(0) => condition(조건문)에서 사용
        System.out.println("Boolean bool First : "+boolFirst);
        // Type mismatch in case
        // Cannot evaluate because of compilation error(s): bool cannot be resolved to a variable.
        // boolFirst = 5
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from int to boolean.
        // boolFirst = false
        // false

        String stringFirst = "Hello DataTypes!"; // 문자열 
        System.out.println("String string First : "+stringFirst);

        float floatFirst = 2 / 3;
        System.out.println("float First : "+floatFirst);

        return ;
    }
}

// string을 사용할 떄 ''은 사용 불가/ 무조건 ""
// 처음 변수에 datatype을 지정하면 처음 지정한 그 datatype으로 사용해야 함
// println => 코딩테스트때를 제외하고는 사용하지 않는 것을 권장
// 대신 디버깅 모드를 사용하는 것을 권장

