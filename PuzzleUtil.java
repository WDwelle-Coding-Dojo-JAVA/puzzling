import java.util.Random;
public class PuzzleUtil {
    int[] getTenRolls(int rolls){
        Random randMachine = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randMachine.nextInt(20);
            System.out.println(arr[i]);
            }
            return arr;
    }
}