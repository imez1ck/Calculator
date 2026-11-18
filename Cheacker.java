import java.util.Scanner;

public class Cheacker { //Проверяем число на четность
    public static void start(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число: ");
        int cheakek=scanner.nextInt();

        if (cheakek%2!=0){
            System.out.println("Число нечетное.");
        }
        else{
            System.out.println("Число четное.");
        }
    }
}
