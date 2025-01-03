import java.util.ArrayList;
import java.util.Scanner;

public class NumberInput {
    private Scanner scanner;

    public NumberInput() {
        scanner = new Scanner(System.in);
    }


    public ArrayList<Double> getNumbersFromUser() {

        ArrayList<Double> multitude = new ArrayList<>();

        while (true) {
            System.out.print("Введите число (или 'stop' для завершения): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                multitude.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Некорректное число. Попробуйте снова.");
            }
        }


        return multitude;
    }
    public int getOrderFromUser() {


        System.out.print("Введите порядок булеана  ");
        int input = scanner.nextInt();


        return input;
    }

    public void closeScanner(){
        scanner.close();
    }

}
