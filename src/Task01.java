import java.util.Scanner;

/**
 * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */
public class Task01 {

    public static void main(String[] args) {

        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число");
            number = scanner.nextInt();

            if (number > 7) {
                System.out.println("Привет");
            }
        } catch (Exception e) {
            System.err.println("Введено не число");
        }
    }
}
