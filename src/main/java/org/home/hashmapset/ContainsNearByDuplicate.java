package org.home.hashmapset;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearByDuplicate {

    public boolean solution(int[] nums, int k) {
        Map<Integer, Integer> numByLastIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer sameNumIndex = numByLastIndex.get(nums[i]);
            if (sameNumIndex != null && Math.abs(sameNumIndex - i) <= k) {
                return true;
            }
            numByLastIndex.put(nums[i], i);
        }

        return false;
    }
}
