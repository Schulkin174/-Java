import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите число:"); // какие символы допустимы для ввода?
        
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            
            if (number > 7) {
                System.out.println("Привет");
            }
        } else {
            String inputText = scanner.next();
            System.out.println("Ошибка ввода. Вы ввели текст. Введите число.");
        }
    }
}
