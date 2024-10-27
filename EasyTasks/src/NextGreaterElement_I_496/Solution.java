package NextGreaterElement_I_496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
//        int[] numbers = new int[10000];
        Stack<Integer> s = new Stack<>();
        for (int val : nums2) {
            while(!s.empty() && s.peek() < val) {
//                numbers[s.pop()] = val;
                map.put(s.pop(), val);
            }
            s.push(val);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
//            result[i] = numbers[nums1[i]] == 0 ? -1 : numbers[nums1[i]];
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}
