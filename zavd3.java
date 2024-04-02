import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Просимо користувача ввести прізвище одногрупника
        System.out.println("Введіть прізвище одногрупника:");
        String прізвище = scanner.nextLine();

        // Використовуємо оператор switch для визначення імені одногрупника за прізвищем
        switch (прізвище) {
            case "Соколовський":
                System.out.println("Ім'я: Степан");
                break;
            case "Костенюк":
                System.out.println("Ім'я: Любомир");
                break;
            case "Дирда":
                System.out.println("Ім'я: Михайло");
                break;
            case "Князький":
                System.out.println("Ім'я: Ігор");
                break;
            case "Франк":
                System.out.println("Ім'я: Діана");
                break;
            case "Мельницький":
                System.out.println("Ім'я: Майк");
                break;
            case "Ігнатюк":
                System.out.println("Ім'я: Іван");
                break;
            default:
                System.out.println("одногрупника з таким прізвищем не знайдено.");
        }
    }
}

