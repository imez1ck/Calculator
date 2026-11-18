import java.util.Scanner;

public class Calculator{
    public static void start() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число: ");
            double num1=scanner.nextDouble();
            System.out.println("Введите символ*(+,-,*,/: ");
            char char1=scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            double num2=scanner.nextDouble();
            double res;
            switch (char1){
                case '+':
                    res=num1+num2;
                    System.out.println("Результат: "+ res);
                    break;
                case '-':
                    res=num1-num2;
                    System.out.println("Результат: "+ res);
                    break;
                case '*':
                    res=num1*num2;
                    System.out.println("Результат: "+ res);
                    break;
                case '/':
                    if (num2==0){
                        System.out.println("На нуль делить нельзя!!!+");
                        break;}
                    else{
                        res=num1/num2;
                        System.out.println("Результат: "+ res);
                        break;}
                default:
                    System.out.println("!!!Неизвестная операция!!!");
            }
        }
    }