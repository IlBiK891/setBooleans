import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаём обработчик ввода
        InputHandler inputHandler = new InputHandler();

        // Ввод множества
        Set<String> set = inputHandler.getSetFromUser();

        // Ввод порядка булеана
        int order = inputHandler.getOrderFromUser();

        // Генерация булеана n-го порядка
        List<?> nthPowerSet = NthPowerSet.generateNthPowerSet(set, order);

        // Вывод результата
        System.out.println("Булеан " + order + "-го порядка: ");
        System.out.println(nthPowerSet);

        // Закрываем сканер
        inputHandler.closeScanner();
    }
}
