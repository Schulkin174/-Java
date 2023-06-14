public class Array {
    public static void main(String[] args) {
        int[] numbers = {0, 3, 7, 9, 12, 15, 18, 30}; // ТЗ не указывает какие конкретно числа должны использоваться для заполнения массива
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) { // выводим кратные трем
                System.out.println(numbers[i]);
            }
        }
    }
}
