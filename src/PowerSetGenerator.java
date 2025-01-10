import java.util.*;

public class PowerSetGenerator {
    public static List<Set<?>> generatePowerSet(Set<?> set) {
        List<Set<?>> powerSet = new ArrayList<>();
        powerSet.add(new HashSet<>()); // Добавляем пустое множество

        for (Object element : set) {
            List<Set<?>> newSubsets = new ArrayList<>();
            for (Set<?> subset : powerSet) {
                Set<Object> newSubset = new HashSet<>(subset);
                newSubset.add(element);
                newSubsets.add(newSubset);
            }
            powerSet.addAll(newSubsets);
        }

        return powerSet;
    }
}
