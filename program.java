/**
 * program
 */
import java.util.Scanner;

public class program { 
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели число: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Введите дробное число (типа float): ");
            if (scanner.hasNextFloat()) {
                result = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                scanner.nextLine(); // Очистка буфера ввода
            }
        }
        
        scanner.close();
        return result;
    }
}