import java.util.ArrayList;
import java.util.List;

public class problem54 {
    public static void main(String[] args) {
        
    }
    public List<Integer> spiralOrder(int[][] arr) {
        int strow = 0;
    int stcol = 0;
    int endrow = arr.length - 1;
    int endcol = arr[0].length - 1;

    List<Integer> spList = new ArrayList<>();
    
    while (strow <= endrow && stcol <= endcol) {
        // Top boundary
        for (int j = stcol; j <= endcol; j++) {
            spList.add(arr[strow][j]);
        }
        // Right boundary
        for (int i = strow + 1; i <= endrow; i++) {
            spList.add(arr[i][endcol]);
        }
        // Bottom boundary
        for (int j = endcol - 1; j >= stcol; j--) {
            if (strow == endrow) {
                break;
            }
            spList.add(arr[endrow][j]);
        }
        // Left boundary
        for (int i = endrow - 1; i >= strow + 1; i--) {
            if (stcol == endcol) {
                break;
            }
            spList.add(arr[i][stcol]);
        }
        strow++;
        stcol++;
        endrow--;
        endcol--;
    }
    return spList;
    }
}
