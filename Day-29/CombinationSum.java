import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remaining) {
                continue;
            }

            current.add(candidates[i]);

            backtrack(candidates, remaining - candidates[i],
                      i, current, result);

            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum.combinationSum(candidates, target);
        System.out.println(result);
    }
}
