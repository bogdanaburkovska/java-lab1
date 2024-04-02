import java.util.Scanner;
//А) З використанням скороченої форми оператора розгалуження if:

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Введіть ціле число a:");
         int a = scanner.nextInt();
         System.out.println("Введіть дійсне число c:");
         double c = scanner.nextDouble();

         double b;

         if (a == 0 || (Math.pow(a, 2) - 4 * c) == 0 || a * c < 0) {
             System.out.println("Неможливо обчислити значення виразу");
         } else {
             b = (Math.pow(a, 2) - 4 * c) / (a * c);
             System.out.println("Результат обчислення: " + b);
         }
     }
 }
