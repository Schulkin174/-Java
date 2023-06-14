import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        
        if (name.equals("Вячеслав")) {  // при выводе в консоли windows проверить кодировку, при необходимости указать UTF-8
            System.out.println("Привет, Вячеслав"); // стандартные кодировки windows CP1251/OEM могут выдавать ложный результат
        } else {
            System.out.println("Нет такого имени"); // возможна ошибка консоли windows при сравнении со строкой в кириллическом формате, при работе с латиницей ошибок не возникает
        }
    }
}