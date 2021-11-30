import java.util.Random;
public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleUtil appTest = new PuzzleUtil();
        System.out.println("random numbers: " + appTest.getTenRolls(10));
        System.out.println("random letter:" + appTest.getLetter(""));
        System.out.println("random letter:" + appTest.getLetter(""*8));
    }
}