import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Просимо користувача ввести координату x
        System.out.println("координата x:");
        int x = scanner.nextInt();

        // Просимо користувача ввести координату y
        System.out.println("координата y:");
        int y = scanner.nextInt();

        // Перевіряємо в якому квадранті знаходиться точка
        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в першому квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в другому квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в третьому квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в четвертому квадранті.");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка знаходиться в початку координат.");
        } else if (x == 0) {
            System.out.println("Точка знаходиться на вісі Y.");
        } else if (y == 0) {
            System.out.println("Точка знаходиться на вісі X.");
        }
    }
}
