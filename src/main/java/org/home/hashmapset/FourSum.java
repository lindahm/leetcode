package org.home.hashmapset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourSum {

    public List<List<Integer>> fourSum( int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<List<Integer>>> pairBySum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for ( int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                List<List<Integer>> pairs = pairBySum.computeIfAbsent(sum, k -> new ArrayList<>());
                pairs.add(List.of(nums[i], nums[j]));
            }
        }

        for (Map.Entry<Integer, List<List<Integer>>> entry : pairBySum.entrySet()) {
            Integer sum = entry.getKey();
            Integer distance = target - sum;
            
        }
        return result;
    }

    private class Pair {
        Integer left;
        Integer right;
    }
}
