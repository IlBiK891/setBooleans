import java.util.*;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    // Метод для получения множества от пользователя
    public Set<String> getSetFromUser() {
        System.out.println("Введите элементы множества через пробел:");
        String[] elements = scanner.nextLine().split(" ");
        return new HashSet<>(Arrays.asList(elements));
    }

    // Метод для получения порядка булеана от пользователя
    public int getOrderFromUser() {
        System.out.println("Введите порядок булеана:");
        return scanner.nextInt();
    }

    // Закрытие сканера
    public void closeScanner() {
        scanner.close();
    }
}
