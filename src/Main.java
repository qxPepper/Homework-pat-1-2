import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        //1
        logger.log("Запускаем программу");

        //2
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int N = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int M = scanner.nextInt();

        //3
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < N; i++) {
            Random random = new Random();
            list.add(random.nextInt(M));
        }
        System.out.print("Вот случайный список: ");
        for (int i = 0; i < N; i++) {
            if (i != N - 1) {
                System.out.print(list.get(i) + " ");
            } else {
                System.out.println(list.get(i));
            }
        }

        //4
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int threshold = scanner.nextInt();
        Filter filter = new Filter(threshold);
        result = filter.filterOut(list);

        //5
        logger.log("Прошло фильтр " + result.size() + " элемента из " + list.size());

        //6
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) {
                System.out.print(result.get(i) + " ");
            } else {
                System.out.println(result.get(i));
            }
        }

        //7
        logger.log("Завершаем программу");
    }
}
