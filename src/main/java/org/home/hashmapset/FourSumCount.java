package org.home.hashmapset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> rightPairSumFrequency = new HashMap<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                Integer sum = num1 + num2;
                rightPairSumFrequency.put(sum, rightPairSumFrequency.getOrDefault(sum, 0) + 1);
            }
        }

        int tupleCount = 0;
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                Integer distanceToZero = -(num3 + num4);
                tupleCount += rightPairSumFrequency.getOrDefault(distanceToZero, 0);
            }
        }
        return tupleCount;
    }
}
