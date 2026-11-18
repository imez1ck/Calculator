import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("=== ГЛАВНОЕ МЕНЮ ===");
            System.out.println("1. Калькулятор");
            System.out.println("2. Сравнение чисел");
            System.out.println("3. Проверка чётности");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            int mov=scanner.nextInt();
            switch (mov) {
                case 1:
                    Calculator calc = new Calculator();
                    calc.start();
                    break;
                case 2:
                    Comparison comp = new Comparison();
                    comp.start();
                    break;
                case 3:
                    Cheacker cheak = new Cheacker();
                    cheak.start();
                    break;
                case 4:
                    System.out.println("Выход из приложения...");
                    System.exit(0);
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        }
    }
}
