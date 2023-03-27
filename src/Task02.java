import java.util.Scanner;

/**
 * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет,
 * то вывести "Нет такого имени"
 */
public class Task02 {

    public static void main(String[] args) {

        String standardName = "Вячеслав";
        String name;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите имя");
            name = scanner.next();

            if (standardName.equalsIgnoreCase(name)) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
