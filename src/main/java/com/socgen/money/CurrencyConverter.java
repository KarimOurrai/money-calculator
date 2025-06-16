package com.socgen.money;

import java.util.Map;

public class CurrencyConverter {
    private final Map<String, Double> rates;

    public CurrencyConverter(Map<String, Double> rates) {
        this.rates = rates;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
       throw new UnsupportedOperationException("Conversion logic not implemented yet");
    }
}