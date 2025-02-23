package Lab1;

import java.util.*;

public class SubsetSum {

    public static List<Integer> subsetSum(int[] S, int k) {
        Arrays.sort(S);
        List<Integer> result = new ArrayList<>();
        if (findSubset(S, 0, k, result)) {
            return result;
        }
        return null;
    }

    private static boolean findSubset(int[] S, int index, int target, List<Integer> subset) {
        if (target == 0) return true;
        if (index >= S.length || target < 0) return false;

        subset.add(S[index]);
        if (findSubset(S, index + 1, target - S[index], subset)) return true;

        subset.removeLast();
        return findSubset(S, index + 1, target, subset);
    }

    public static void main(String[] args) {
        int[] S = {3, 1, 7, 5, 3, 4};
        int k = 10;
        List<Integer> result = subsetSum(S, k);

        if (result != null) {
            System.out.println("Subset found: " + result);
        } else {
            System.out.println("No subset found.");
        }
    }
}
