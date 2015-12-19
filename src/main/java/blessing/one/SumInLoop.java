package blessing.one;

public class SumInLoop {

    public int loop(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}
