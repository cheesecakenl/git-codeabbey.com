package problems;

/**
 * Created by admin on 12/18/2015.
 */
public class SumInLoop implements Problem<Integer> {

    Integer answer = 0;
    String input = "608 1228 305 56 163 253 782 604 383 260 133 321 543 675 842 1229 989 992 1119 528 828 503 436 970 764 654 992 1083 204 772 197 803 699 493 849 853";

    @Override
    public Integer getAnswer() {
        String[] list = input.split(" ");
        for (int i = 0; i < list.length; i++) {
            answer += Integer.valueOf(list[i]);
        }

        return answer;
    }
}
