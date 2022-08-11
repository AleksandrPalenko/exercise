package exercise.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    public void convertListToMap() {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, 2);
        result.put(3, 1);
        result.put(4, 2);
        result.put(5, 2);
        assertEquals(result, (Calculate.calculateNumbers(list)));
    }

}