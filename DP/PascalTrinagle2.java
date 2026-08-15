import java.util.ArrayList;
import java.util.*;

public class PascalTrinagle2 {
    public List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        List<Integer> result = new ArrayList<>(rowIndex + 1);
        for (int j = 0; j <= rowIndex; j++) {
            result.add(dp[rowIndex][j]);
        }
        return result;
    }
    public static void main(String[] args) {
        PascalTrinagle2 pt = new PascalTrinagle2();
        int rowIndex = 3;
        List<Integer> row = pt.getRow(rowIndex);
        System.out.println(row);
    }
}
