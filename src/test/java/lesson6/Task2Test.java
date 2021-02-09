package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task2Test {


    private static final Task2 task2 = new Task2();

    @ParameterizedTest
    @MethodSource("dataForOneOrFour")
    void findFourOrOne(int[] numbers, boolean expectedResult) {
        boolean result = task2.findNumber(numbers);
        Assertions.assertEquals(expectedResult, result);

    }

    private static Stream<Arguments> dataForOneOrFour() {
        List<Arguments> numbers = new ArrayList<>();
        numbers.add(Arguments.arguments(new int[]{1, 1, 4, 4, 4}, true));
        numbers.add(Arguments.arguments(new int[]{1, 1, 2, 4, 4, 4}, false));
        numbers.add(Arguments.arguments(new int[]{4, 4, 1, 4}, true));
        numbers.add(Arguments.arguments(new int[]{1, 1, 1, 1}, false));

        return numbers.stream();
    }
}
