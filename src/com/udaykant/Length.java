package com.udaykant;

public class Length {
    private double length;
    private Unit unit;

    public Length(double length, Unit unit) {
        if (length < 0)
            throw new IllegalArgumentException("Length can't be negative.");
        this.length = length;
        this.unit = unit;
    }

    public double getLength() {
        return length;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;

        Length length1 = (Length) o;
        if (Double.compare(length1.length, this.convertTo(length1.unit).length) != 0) return false;

        return true;
    }


    public Length convertTo(Unit unit) {
        return new Length(this.length*this.unit.getConversionFactor(unit) , unit);
    }
}
