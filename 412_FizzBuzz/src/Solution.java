import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Solution {
    private static final IntFunction<String> IS_DIVISIBLE_BY_3 = i -> (i % 3) == 0 ? "Fizz" : "";
    private static final IntFunction<String> IS_DIVISIBLE_BY_5 = i -> (i % 5) == 0 ? "Buzz" : "";
    private static final IntFunction<String> NUM_MAPPER = i -> {
        String result = IS_DIVISIBLE_BY_3.apply(i);
        result += IS_DIVISIBLE_BY_5.apply(i);
        if (result.isBlank()) {
            result = String.valueOf(i);
        }
        return result;
    };

    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1)
                .mapToObj(NUM_MAPPER)
                .toList();
    }

    public List<String> fizzBuzz0(int n) {
        List<String> answer = new ArrayList<>(n);
        String fullString = "FizzBuzz";
        String fizz = fullString.substring(0, 4);
        String buzz = fullString.substring(4);
        for (int i = 1; i <= n; i++) {
            answer.add(((i % 3) + (i % 5) == 0) ? fullString : (i % 3 == 0) ? fizz : (i % 5 == 0) ? buzz : Integer.toString(i));
        }
        return answer;
    }
}
