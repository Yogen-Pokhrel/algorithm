package Lab2;

import java.util.*;

public class PowerSetGenerator {
    
    public static List<Set<Integer>> powerSet(List<Integer> inputSet) {
        List<Set<Integer>> powerSet = new ArrayList<>();
        powerSet.add(new HashSet<>());

        for (Integer element : inputSet) {
            List<Set<Integer>> newSubsets = new ArrayList<>();
            for (Set<Integer> subset : powerSet) {
                Set<Integer> newSubset = new HashSet<>(subset);
                newSubset.add(element);
                newSubsets.add(newSubset);
            }
            powerSet.addAll(newSubsets);
        }
        
        return powerSet;
    }

    public static void main(String[] args) {
        List<Integer> inputSet = Arrays.asList(1, 2, 3, 3);
        List<Set<Integer>> result = powerSet(inputSet);
        
        System.out.println("Power Set:");
        for (Set<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
