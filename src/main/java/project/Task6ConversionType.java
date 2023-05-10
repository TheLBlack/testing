package project;

public enum Task6ConversionType {
    METERS_TO_YARDS (1.0936133),
    YARDS_TO_METERS (0.9144),
    CENTIMETERS_TO_INCHES(0.3937),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621371),
    MILES_TO_KILOMETERS(1.609344);

    private double conversionValue;

    private Task6ConversionType(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    public double getConversionValue() {
        return this.conversionValue;
    }
}
