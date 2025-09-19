// 1 Задача
//public class Main {
//    public static void main(String[] args) {
//        var str = "AaBbCcDd"; // Исходная строчка букв
//        System.out.print("str[::2] - ");
//        for (int i = 0; i < str.length(); i += 2){  // Перебираем каждый 2-ой эл-т начиная с 0-ого
//            System.out.print(str.charAt(i)); // Выводим все подходящие эл-ты
//        }
//        System.out.print("\nstr[1::2] - ");
//        for (int i = 1; i < str.length(); i += 2){  // Перебираем каждый 2-ой эл-т начиная с 1-ого
//            System.out.print(str.charAt(i)); // Выводим все подходящие эл-ты
//        }
//    }
//}


// 2 Задача
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        char[] original = {'a', '1', 'b', '2', 'c', '3'}; // Исходный массив символов
        List<Character> letters = new ArrayList<>(); // Динамический массив для букв
        List<Character> numbers = new ArrayList<>(); // Динамический массив для чисел(цифр)

        // Разделение символов на буквы и цифры
        for (char c : original) { // Перебо всех эл-тов исходного массива
            if (Character.isLetter(c)) { // Отбираем буквы
                letters.add(c); // Добавляем в конец массива
            } else if (Character.isDigit(c)) { // Отбираем цифры
                numbers.add(c); // Добавляем в конец массива
            }
        }

        // Вывод букв
        for (char c : letters) {
            System.out.print(c);// Выводим буквы
        }
        System.out.println();

        original = null; //Удаление массива
        System.gc();

        // Вывод цифр
        for (char c : numbers) {
            System.out.print(c);// Выводим цифры
        }
    }
}