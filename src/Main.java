import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();

        Set<String> set = inputHandler.getSetFromUser();

        // Ввод порядка булеана
        int order = inputHandler.getOrderFromUser();

        // Генерация булеана n-го порядка
        List<?> nthPowerSet = NthPowerSet.generateNthPowerSet(set, order);

       System.out.println("Булеан " + order + "-го порядка: ");
        System.out.println(nthPowerSet);

        inputHandler.closeScanner();
    }
}
