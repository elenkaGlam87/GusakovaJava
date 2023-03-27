import java.util.Arrays;
import java.util.Random;

/**
 * Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */
public class Task03 {

    public static void main(String[] args) {

        int[] numbers = new int[(int) (Math.random() * ((20 - 10) + 1)) + 10];
        prepareArray(numbers);

        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void prepareArray(int[] numbers) {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
    }
}
