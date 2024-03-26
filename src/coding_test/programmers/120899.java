package coding_test.programmers;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


class Solution_120899 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayResult = new ArrayList<>();
 
        array.add(9);
        array.add(10);
        array.add(11);
        array.add(8);


        
        int intMax = Collections.max(array);
        arrayResult.add(intMax);
        int index = array.indexOf(intMax);
        arrayResult.add(index);
        System.out.println(arrayResult);
        

        scanner.close();
       
        
    }
    
}


