package project;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task6MeasurementConverterTest {

    @ParameterizedTest
    @MethodSource
    public void checkConversion(Task6ConversionType type, double expected) {
        //when
        double result = Task6MeasurementConverter.convert(50, type);

        //then
        assertThat(result).isEqualTo(expected);
    }

    public static Stream<Arguments> checkConversion() {
        return Stream.of(
                Arguments.of(Task6ConversionType.METERS_TO_YARDS, 54.680665d),
                Arguments.of(Task6ConversionType.INCHES_TO_CENTIMETERS, 127.0d),
                Arguments.of(Task6ConversionType.MILES_TO_KILOMETERS, 80.4672d));
    }
}
