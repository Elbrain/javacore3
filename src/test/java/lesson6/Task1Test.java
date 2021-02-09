package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task1Test {


    private static final Task1 task1 = new Task1();

    @ParameterizedTest
    @MethodSource("dataForGettingFours")
    void valuesAfterFour(int[] numbers, int[] newNumbers) {
        int[] resultNumbers = task1.arrayAfterFour(numbers);
        Assertions.assertArrayEquals(newNumbers, resultNumbers);
    }

    @Test
    void valuesExpetion() {
        int[] numbers = {1, 2, 3};
        Assertions.assertThrows(RuntimeException.class, () -> task1.arrayAfterFour(numbers));
    }

    private static Stream<Arguments> dataForGettingFours() {
        List<Arguments> numbers = new ArrayList<>();
        numbers.add(Arguments.arguments(new int[]{1, 11, 8, 4, 2}, new int[]{2}));
        numbers.add(Arguments.arguments(new int[]{9, 1, 2, 4, 12, 13}, new int[]{12, 13}));
        numbers.add(Arguments.arguments(new int[]{4, 22, 14, 3}, new int[]{22, 14, 3}));
        numbers.add(Arguments.arguments(new int[]{1, 11, 8, 4}, new int[]{}));

        return numbers.stream();
    }
}
