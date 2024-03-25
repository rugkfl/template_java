// refer : https://www.w3schools.com/java/java_arraylist.asp
import java.util.ArrayList;

public class DataTypeArrayLists {
    public static void main(String[] args) {
        ArrayList listFirst = new ArrayList();

        // 값 넣기
        listFirst.add("Volve");
        listFirst.add("BMW");
        listFirst.add("Ford");
        
        // listFirst.get(1)
        // "BMW"

        // 값 가져오기
        // listFirst.get(1)
        // "BMW"
        // listFirst.get(3)
        // IndexOutOfBoundsException@37 "java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3"
        // listFirst.size()
        // 3

        //  값 삭제하기
        // listFirst.remove(1)
        // "BMW"
        // listFirst.size()
        // 2
        System.out.println("Hello World!");
       // return 0; 
    }
}

//ArrayList = list of python 
// array에서는 length라고 안하고 size라고 함