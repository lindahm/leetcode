package org.home.hashmapset;

import java.util.*;

public class RandomizedSet {
    List<Integer> values = new ArrayList<>();
    Map<Integer, Integer> valueIndices = new HashMap<>();
    Random random = new Random();
    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if (valueIndices.containsKey(val)) {
            return false;
        } else {
            values.add(val);
            valueIndices.put(val, values.size() - 1);
            return true;
        }
    }

    public boolean remove(int val) {
        if (valueIndices.containsKey(val)) {
            int lastIndex = values.size() - 1;
            int newIndex = valueIndices.get(val);
            Integer lastValue = values.get(lastIndex);

            values.set(newIndex, lastValue);
            values.remove(lastIndex);

            valueIndices.put(lastValue, newIndex);
            valueIndices.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        return values.get(random.nextInt(values.size()));
    }
}
