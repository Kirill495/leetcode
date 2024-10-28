package DistributeCandies_575;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candyType) {
        int maxCandies = candyType.length / 2;
        Set<Integer> difCandies = new HashSet<>();
        for (int type : candyType) {
            if (difCandies.add(type) && difCandies.size() >= maxCandies) {
                return maxCandies;
            }
        }
        return difCandies.size();
    }
}
