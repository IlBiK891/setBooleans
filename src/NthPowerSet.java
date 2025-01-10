import java.util.*;

public class NthPowerSet {
    // Метод для создания булеана n-го порядка
    public static List<Set<?>> generateNthPowerSet(Set<?> set, int order) {
        // Первый булеан множества
        List<Set<?>> currentPowerSet = PowerSetGenerator.generatePowerSet(set);

        for (int i = 1; i < order; i++) {
            // Преобразуем текущий булеан в множество
            Set<Set<?>> nextSet = new HashSet<>(currentPowerSet);
            currentPowerSet = PowerSetGenerator.generatePowerSet(nextSet);
        }

        return currentPowerSet;
    }
}
