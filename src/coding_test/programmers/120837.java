package coding_test.programmers;
import java.util.Scanner;

// /*
//     장군개미 = 5
//     병정개미 = 3
//     일개미 = 1
//  */

class Solution_120837 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = 999;
        int captin = 5;
        int soldier = 3;
        int worker = 1;

        int intCaptin = hp / captin; // 4 => captin

        int intMod = hp % captin; // captin의 나머지

        int intSolider = intMod / soldier; // => solider
        int modSecond = intMod % soldier; // solider의 나머지

        int intWorker = modSecond / worker; // => worker

        int answer = intCaptin + intSolider + intWorker;
        
        // int hp = 999;
        // int captin = 5;
        // int soldier = 3;

        // int answer = hp / captin; // 4 => captin

        // hp = hp % captin; // captin의 나머지

        // answer = hp / soldier +  hp % soldier + answer; // => solider + worker
        


      
        scanner.close(); 
    }
}
