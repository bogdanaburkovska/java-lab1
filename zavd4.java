import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запит користувача на введення значень x та y
        System.out.println("Введіть значення x:");
        int x = scanner.nextInt();

        System.out.println("Введіть значення y:");
        int y = scanner.nextInt();

        // Перевірка на допустимість вхідних параметрів
        if (x == 0 && y == 0) {
            System.out.println("Помилка: ділення на 0.");
            return;
        }

        if (x * y < 0) {
            System.out.println("Помилка: логарифм з від'ємного числа.");
            return;
        }

        // Обчислення значення функції
        double f;
        try {
            f = (Math.pow(x, 2) + Math.log(x * y) - Math.pow(y, 2)) / (1 + Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println("Значення функції f = " + f);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: невизначений результат.");//Якщо виникає виключення типу ArithmeticException, виводиться повідомлення про невизначений результат.


        }
    }
}

