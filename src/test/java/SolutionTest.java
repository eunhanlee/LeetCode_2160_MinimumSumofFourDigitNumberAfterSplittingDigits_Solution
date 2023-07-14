import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();

        int expected1 = 52;
        int actual1 = solution.minimumSum(2932);
        assertEquals(expected1, actual1);

        int expected2 = 13;
        int actual2 = solution.minimumSum(4009);
        assertEquals(expected2, actual2);

        int expected3 = 0;
        int actual3 = solution.minimumSum(0000);
        assertEquals(expected3, actual3);

        int expected4 = 37;
        int actual4 = solution.minimumSum(4321);
        assertEquals(expected4, actual4);

        int expected5 = 176;
        int actual5 = solution.minimumSum(8888);
        assertEquals(expected5, actual5);

        int expected6 = 147;
        int actual6 = solution.minimumSum(9876);
        assertEquals(expected6, actual6);

        int expected7 = 81;
        int actual7 = solution.minimumSum(3456);
        assertEquals(expected7, actual7);

        int expected8 = 49;
        int actual8 = solution.minimumSum(5413);
        assertEquals(expected8, actual8);

        int expected9 = 3;
        int actual9 = solution.minimumSum(1200);
        assertEquals(expected9, actual9);

        int expected10 = 2;
        int actual10 = solution.minimumSum(1001);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
