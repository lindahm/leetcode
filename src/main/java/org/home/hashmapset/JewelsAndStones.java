package org.home.hashmapset;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        final Set<Integer> jewelsSet = jewels.chars()
                .boxed()
                .collect(Collectors.toSet());

        return Long.valueOf(stones.chars()
                .filter(jewelsSet::contains)
                .count()).intValue();
    }
}
