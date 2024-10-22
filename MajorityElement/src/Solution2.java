import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution2 {
    public int majorityElement(int[] nums) {

        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > nums.length/2)
                .findAny().orElseThrow().getKey();

    }
}