package com.udaykant;

public enum  Unit {
    Millimeter(1),
    Centimeter(10),
    Inch(25.4d),
    Feet(304.8d),
    Yard(914.4d),
    Meter(1000),
    Kilometer(1000000),
    Miles(1609344);

    private double conversionValue;

    Unit(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    public double getConversionFactor(Unit unit) {
        return this.conversionValue/unit.conversionValue;
    }
}
