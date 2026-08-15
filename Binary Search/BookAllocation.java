import java.util.Arrays;

public class BookAllocation {
     public int minimizedMaximum(int n, int[] A) {
        int left = 1;
        int right = Arrays.stream(A).max().getAsInt();

        while (left < right) {
            int mid = (left + right) / 2;
            int req = 0;
            for (int num : A) {
                req += (int) Math.ceil((double) num / mid);
            }

            if (req > n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
