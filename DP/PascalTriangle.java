import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(dp[i][j]);
            }
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int numRows = 5;
        List<List<Integer>> triangle = pt.generate(numRows);
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
