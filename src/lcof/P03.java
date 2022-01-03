package lcof;

import java.util.HashSet;
import java.util.Set;

public class P03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            if (numsSet.contains(num))
                return num;
            else
                numsSet.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
