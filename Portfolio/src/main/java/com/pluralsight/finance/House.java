package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public double getValue() {
        // Assuming the value depends on square footage and age
        return getMarketValue() + (squareFeet * 100) + (bedrooms * 5000) - (2025 - yearBuilt) * 1000;
    }
}