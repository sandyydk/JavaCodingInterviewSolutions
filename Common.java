import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Common{
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        List<Integer> common = new ArrayList<Integer>();
        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 2, 9, 10, 11, 12};
        // mostFrequent(array2) should return 3.
        int[] array2 = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};

        common = commonElements(array1, array2);

       // System.out.println(mf);

       for(int i: common) {
           System.out.println(i);
       }
    }

    // Implement your solution below.
    public static List<Integer> commonElements(int[] n, int[] m) {
        List<Integer> common = new ArrayList<Integer>();
        int nIndex = 0;
        int mIndex = 0;
        int i = 0;
        while (nIndex < n.length && mIndex < m.length) {
            int nItem = n[nIndex];
            int mItem = m[mIndex]; 

            if (nItem == mItem) {
                common.add(nItem);
                nIndex++;
                mIndex++;
            } else {
                if (nItem < mItem) {
                    nIndex++;
                } else {
                    mIndex++;
                }
            }
        }
    return common;
    }
}
