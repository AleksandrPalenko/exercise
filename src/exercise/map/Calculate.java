package exercise.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Calculate {

    /**
     * Подсчитать количество всех элементов списка/массива и вернуть ассоциативных массив,
     * где ключ – элемент списка, значение – количество этих элементов в списке. Порядок не имеет значения.
     * Подсчитать количество всех элементов списка/массива и вернуть ассоциативных массив,
     * где ключ – элемент списка, значение – количество этих элементов в списке. Порядок не имеет значения.
     * @param input - Пример: [1, 3, 4, 5, 1, 5, 4]
     * @return Map<Integer, Integer> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
     */
    public static Map<Integer, Integer> calculateNumbers(List<Integer> input) {

        Map<Integer, Integer> integersCount = new HashMap<>();

        if (input == null || input.isEmpty()) {
            return integersCount;
        }

        return input.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum, HashMap::new));
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);
        System.out.println(calculateNumbers(list));
    }
}
