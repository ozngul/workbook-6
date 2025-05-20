package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    @Override
    public double getValue() {
        // Assuming the value is adjusted by karat quality (e.g., 24K gold is pure)
        return getMarketValue() * (karat / 24.0);
    }
}