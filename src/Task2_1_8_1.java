import java.util.stream.IntStream;

public class Task2_1_8_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 8. Optional. (в каталоге Учебных материалов раздел указан как 
                    Модуль 2, Тема 1, Урок 14. Optional).
                    Задание: Вам необходимо из массива “-10 –10” взять числа меньше 10, которые 
                    получатся в результате функции x2 –5x –10 и вывести квадрат максимального.

                Решение:\s""");

        IntStream.range(-10, 10).map(x -> x * x - 5 * x - 10).filter(x -> x < 10).max().ifPresentOrElse((n) ->
                System.out.println(n * n), () -> System.out.println("Число, удовлетворяющее условиям, не найдено"));
    }
}
