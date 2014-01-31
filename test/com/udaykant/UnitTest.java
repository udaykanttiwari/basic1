package com.udaykant;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by udaykant on 1/31/14.
 */
public class UnitTest {

    @Test
    public void testConversionFactorOfConvertingMillimeterToCentiMeter() throws Exception {
        assertEquals(10d,Unit.Centimeter.getConversionFactor(Unit.Millimeter));
    }

    @Test
    public void testConversionFactorOfConvertingCentimeterToMillimeter() throws Exception {
        assertEquals(0.1d,Unit.Millimeter.getConversionFactor(Unit.Centimeter));
    }

    @Test
    public void testConversionFactorOfConvertingInchToMillimeter() throws Exception {
        assertEquals(25.4d, Unit.Inch.getConversionFactor(Unit.Millimeter));
    }

    @Test
    public void testConversionFactorOfConvertingFeetToMillimeter() throws Exception {
        assertEquals(304.8d, Unit.Feet.getConversionFactor(Unit.Millimeter));
    }

    @Test
    public void testConversionFactorOfConvertingFeetToInch() throws Exception {
        assertEquals(12d , Unit.Feet.getConversionFactor(Unit.Inch),0.0005);
    }
    @Test
    public void testConversionFactorOfConvertingYardToMillimeter() throws Exception {
        assertEquals(914.4d, Unit.Yard.getConversionFactor(Unit.Millimeter));
    }
    @Test
    public void testConversionFactorOfConvertingMeterToMillimeter() throws Exception {
        assertEquals(1000d, Unit.Meter.getConversionFactor(Unit.Millimeter));
    }

    @Test
    public void testConversionFactorOfConvertingMillimeterToMeter() throws Exception {
        assertEquals(0.001d, Unit.Millimeter.getConversionFactor(Unit.Meter));
    }

    @Test
    public void testConversionFactorOfConvertingKilometerToMillimeter() throws Exception {
        assertEquals(1000000d, Unit.Kilometer.getConversionFactor(Unit.Millimeter));
    }
    @Test
    public void testConversionFactorOfConvertingMilesToMillimeter() throws Exception {
        assertEquals(1609344d, Unit.Miles.getConversionFactor(Unit.Millimeter));
    }

    @Test
    public void testConversionFactorOfConvertingMilesToYard() throws Exception {
        assertEquals(1760d, Unit.Miles.getConversionFactor(Unit.Yard));
    }
}
