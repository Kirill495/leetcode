public class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            steps++;
            if (num % 2 == 0) {
                num/=2;
            } else {
                num--;
            }
        }
        return steps;
    }

    public int numberOfSteps_1(int num) {
        int steps = 0;
        while (num > 0) {
            steps++;
            if ((num & 1) == 0) {
                num>>=1;
            } else {
                num--;
            }
        }
        return steps;
    }
}
