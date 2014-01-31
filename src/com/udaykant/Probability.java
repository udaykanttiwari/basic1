package com.udaykant;

class Probability {
    private double probability;

    public Probability(double probability) {
        if (probability < 0 && probability > 1) {
            throw new IllegalArgumentException();
        }
        this.probability = probability;
    }

    public Probability(double v1, double v2) {
        this(v1 / v2);
    }

    public double getValue() {
        return probability;
    }

    public Probability negativeProbability() {
        return new Probability(1 - probability);
    }

    public Probability and(Probability second) {
        return new Probability(second.probability * this.probability);
    }

    public Probability or(Probability second) {
        Probability and = this.and(second);
        return new Probability(this.probability + second.probability - and.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }


}
