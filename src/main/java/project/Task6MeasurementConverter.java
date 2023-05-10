package project;

public class Task6MeasurementConverter {

    public static double convert(int value, Task6ConversionType conversionType) {
        return value * conversionType.getConversionValue();
    }
}
