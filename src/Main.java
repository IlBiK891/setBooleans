import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput();
        ArrayList<Double> multitude = numberInput.getNumbersFromUser();
        System.out.println("Введённые значения: " + multitude);
        int input = numberInput.getOrderFromUser();
        numberInput.closeScanner();
        if (input > multitude.size()){
            System.out.println("Пустое множество");
        }
        Combination combination = new Combination(multitude, input);
        System.out.println("Все комбинации:");
        for (int i = 0; i < combination.finish.length; i += input) {
            // Вывод элементов одной комбинации
            for (int j = 0; j < input; j++) {
                System.out.print(combination.finish[i + j] + " ");
            }
            System.out.println(); // Перевод строки
        }
    }
}
