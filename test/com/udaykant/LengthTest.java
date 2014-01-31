package com.udaykant;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {

    @Test
    public void shouldCreateLengthInMeter() throws Exception {
        Length tenMeter = new Length(10d, Unit.Meter);

        assertEquals(10d, tenMeter.getLength());
        assertEquals(Unit.Meter, tenMeter.getUnit());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfUserGiveNegativeLength() throws Exception {
        new Length(-10d, Unit.Meter);
    }

    @Test
    public void testAreTwoLengthEqual() throws Exception {
        Length oneMeter = new Length(1d, Unit.Meter);
        Length hundredCentimeter = new Length(100d, Unit.Centimeter);

        assertEquals(oneMeter, hundredCentimeter);
    }

    @Test
    public void shouldConvertCentimeterToMillimeter() throws Exception {
        Length oneMeter = new Length(1d, Unit.Meter);
        Length hundredCentimeter = new Length(100d, Unit.Centimeter);

        assertEquals(hundredCentimeter, oneMeter.convertTo(Unit.Centimeter));
    }

}