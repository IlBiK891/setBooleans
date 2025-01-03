/*import java.util.ArrayList;

public class Combination {
    private int input;
    private ArrayList<Double> multitude;
   public Combination(ArrayList<Double> multitude, int input) {
       this.multitude = multitude;
       this.input = input;
   }
    public double[] finish = new double[factorial(multitude.size())/(factorial(input) * factorial(multitude.size()))];







    static int factorial(int n) {
        int res = 1, i;
        for (i = 2; i <= n; i++) res *= i;
        return res;
    }
}*/
import java.util.ArrayList;
import java.util.List;

public class Combination {
    private int input; // Размер комбинаций
    private ArrayList<Double> multitude; // Исходное множество
    public double[] finish; // Массив для хранения результата

    public Combination(ArrayList<Double> multitude, int input) {
        this.multitude = multitude;
        this.input = input;

        // Число сочетаний
        int combinationCount = factorial(multitude.size()) / (factorial(input) * factorial(multitude.size() - input));
        finish = new double[combinationCount * input]; // Выделяем место под все элементы всех комбинаций

        List<List<Double>> combinations = generateCombinations(multitude, input);

        // Заполнение массива finish
        int index = 0;
        for (List<Double> combination : combinations) {
            for (Double num : combination) {
                finish[index++] = num;
            }
        }
    }

    // Метод для генерации всех сочетаний
    private List<List<Double>> generateCombinations(ArrayList<Double> nums, int k) {
        List<List<Double>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, k, 0);
        return result;
    }

    // Рекурсивный метод для генерации сочетаний
    private void backtrack(List<List<Double>> result, List<Double> current, ArrayList<Double> nums, int k, int start) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.size(); i++) {
            current.add(nums.get(i));
            backtrack(result, current, nums, k, i + 1);
            current.remove(current.size() - 1);
        }
    }


    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }
}

