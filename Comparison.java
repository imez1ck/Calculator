import java.util.Scanner;

public class Comparison {   //Сравниваем 3 числа

    public static void start(){
        Scanner scanner=new Scanner(System.in);
            System.out.print("Введите первое число:");
            double num1 = scanner.nextDouble();
            System.out.println("Введите второе число:");
            double num2 = scanner.nextDouble();
            System.out.println("Введите третье число:");
            double num3 = scanner.nextDouble();
            if(num1==num2 && num2==num3) {
                System.out.println("Все числа равны" + num1);
            }
            else if(num1 > num2 && num2 >= num3) {
                System.out.println("Большее число: "+ num1);
            }
            else if(num1<=num2 && num2>=num3){
                System.out.println("Большее число: "+ num2);
            }
            else{
                System.out.println("Большее число: "+ num3);
            }
        }
    }