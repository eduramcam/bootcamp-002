package com.bootcamp.helper;

public class DiscountCalculator {

    private static final double MAX_PERCENTAGE = 100.0;

    public double calculatePercentageDiscount(double price, double percentage) {
        if (price <= 0 || percentage <= 0) {
            return 0;
        }

        double effectivePercentage = Math.min(percentage, MAX_PERCENTAGE);
        return price * effectivePercentage / MAX_PERCENTAGE;
    }

    public double calculateDirectDiscount(double price, double discount) {
        if (price <= 0 || discount <= 0) {
            return 0;
        }

        return Math.min(discount, price);
    }
}
