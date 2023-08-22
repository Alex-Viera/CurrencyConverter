package viera;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
    private String name;
    private String shortName;
    private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();

    // "Currency" Constructor
    public Currency(String nameValue, String shortNameValue) {
        this.name = nameValue;
        this.shortName = shortNameValue;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for shortName
    public String getShortName() {
        return this.shortName;
    }

    // Setter for shortName
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    // Getter for exchangeValues
    public HashMap<String, Double> getExchangeValues() {
        return this.exchangeValues;
    }

    // Setter for exchangeValues
    public void setExchangeValues(String key, Double value) {
        this.exchangeValues.put(key, value);
    }

    // Set default values for a currency
    public void defaultValues() {
        String currency = this.name;

        switch (currency) {
            case "US Dollar":
                this.exchangeValues.put("USD", 1.00);
                this.exchangeValues.put("EUR", 0.93);
                this.exchangeValues.put("GBP", 0.66);
                this.exchangeValues.put("CHF", 1.01);
                this.exchangeValues.put("CNY", 6.36);
                this.exchangeValues.put("JPY", 123.54);
                this.exchangeValues.put("KRW", 1336.75);
                this.exchangeValues.put("BTC", 0.000038);
                this.exchangeValues.put("ADA", 3.81);
                this.exchangeValues.put("SVC", 8.75);
                break;
            case "Euro":
                this.exchangeValues.put("USD", 1.073);
                this.exchangeValues.put("EUR", 1.00);
                this.exchangeValues.put("GBP", 0.71);
                this.exchangeValues.put("CHF", 1.08);
                this.exchangeValues.put("CNY", 6.83);
                this.exchangeValues.put("JPY", 132.57);
                this.exchangeValues.put("KRW", 1458.57);
                this.exchangeValues.put("BTC", 0.000042);
                this.exchangeValues.put("ADA", 4.16);
                this.exchangeValues.put("SVC", 9.55);
                break;
            case "British Pound":
                this.exchangeValues.put("USD", 1.51);
                this.exchangeValues.put("EUR", 1.41);
                this.exchangeValues.put("GBP", 1.00);
                this.exchangeValues.put("CHF", 1.52);
                this.exchangeValues.put("CNY", 9.60);
                this.exchangeValues.put("JPY", 186.41);
                this.exchangeValues.put("KRW", 1707.44);
                this.exchangeValues.put("BTC", 0.000049);
                this.exchangeValues.put("ADA", 4.87);
                this.exchangeValues.put("SVC", 11.17);
                break;
            case "Swiss Franc":
                this.exchangeValues.put("USD", 0.99);
                this.exchangeValues.put("EUR", 0.93);
                this.exchangeValues.put("GBP", 0.66);
                this.exchangeValues.put("CHF", 1.00);
                this.exchangeValues.put("CNY", 6.33);
                this.exchangeValues.put("JPY", 122.84);
                this.exchangeValues.put("KRW", 1523.25);
                this.exchangeValues.put("BTC", 0.000044);
                this.exchangeValues.put("ADA", 4.35);
                this.exchangeValues.put("SVC", 9.97);
                break;
            case "Chinese Yuan Renminbi":
                this.exchangeValues.put("USD", 0.16);
                this.exchangeValues.put("EUR", 0.15);
                this.exchangeValues.put("GBP", 0.11);
                this.exchangeValues.put("CHF", 0.16);
                this.exchangeValues.put("CNY", 1.00);
                this.exchangeValues.put("JPY", 19.41);
                this.exchangeValues.put("KRW", 185.56);
                this.exchangeValues.put("BTC", 0.0000053);
                this.exchangeValues.put("ADA", 0.53);
                this.exchangeValues.put("SVC", 1.21);
                break;
            case "Japanese Yen":
                this.exchangeValues.put("USD", 0.008);
                this.exchangeValues.put("EUR", 0.007);
                this.exchangeValues.put("GBP", 0.005);
                this.exchangeValues.put("CHF", 0.008);
                this.exchangeValues.put("CNY", 0.051);
                this.exchangeValues.put("JPY", 1.000);
                this.exchangeValues.put("KRW", 9.16);
                this.exchangeValues.put("BTC", 0.000000263020199);
                this.exchangeValues.put("ADA", 0.026);
                this.exchangeValues.put("SVC", 0.060);
                break;
            case "South Korean won":
                this.exchangeValues.put("USD", 0.00075);
                this.exchangeValues.put("EUR", 0.00068);
                this.exchangeValues.put("GBP", 0.00058);
                this.exchangeValues.put("CHF", 0.00066);
                this.exchangeValues.put("CNY", 0.0054);
                this.exchangeValues.put("JPY", 0.11);
                this.exchangeValues.put("KRW", 1.0);
                this.exchangeValues.put("BTC", 0.000000029);
                this.exchangeValues.put("ADA", 0.0028);
                this.exchangeValues.put("SVC", 0.0065);
                break;
            case "Bitcoin":
                this.exchangeValues.put("USD", 26057.20);
                this.exchangeValues.put("EUR", 23889.24);
                this.exchangeValues.put("GBP", 20408.52);
                this.exchangeValues.put("CHF", 22874.96);
                this.exchangeValues.put("CNY", 187721.28);
                this.exchangeValues.put("JPY", 3806370.63);
                this.exchangeValues.put("KRW", 34897105.10);
                this.exchangeValues.put("BTC", 1.0);
                this.exchangeValues.put("ADA", 99357.88);
                this.exchangeValues.put("SVC", 227953.13);
                break;
            case "Cardano":
                this.exchangeValues.put("USD", 0.26);
                this.exchangeValues.put("EUR", 0.24);
                this.exchangeValues.put("GBP", 0.21);
                this.exchangeValues.put("CHF", 0.23);
                this.exchangeValues.put("CNY", 1.89);
                this.exchangeValues.put("JPY", 38.33);
                this.exchangeValues.put("KRW", 351.31);
                this.exchangeValues.put("BTC", 0.000010);
                this.exchangeValues.put("ADA", 1.0);
                this.exchangeValues.put("SVC", 2.30);
                break;
            case "Salvadoran Colón":
                this.exchangeValues.put("USD", 0.11);
                this.exchangeValues.put("EUR", 0.10);
                this.exchangeValues.put("GBP", 0.090);
                this.exchangeValues.put("CHF", 0.10);
                this.exchangeValues.put("CNY", 0.82);
                this.exchangeValues.put("JPY", 16.71);
                this.exchangeValues.put("KRW", 152.99);
                this.exchangeValues.put("BTC", 0.0000044);
                this.exchangeValues.put("ADA", 0.44);
                this.exchangeValues.put("SVC", 1.0);
                break;
        }
    }

    // Initialize currencies
    public static ArrayList<Currency> init() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();

        currencies.add( new Currency("US Dollar", "USD") );
        currencies.add( new Currency("Euro", "EUR") );
        currencies.add( new Currency("British Pound", "GBP") );
        currencies.add( new Currency("Swiss Franc", "CHF") );
        currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
        currencies.add( new Currency("Japanese Yen", "JPY") );
        currencies.add( new Currency("South Korean won", "KRW"));
        currencies.add( new Currency("Bitcoin", "BTC") );
        currencies.add( new Currency("Cardano", "ADA") );
        currencies.add( new Currency("Salvadoran Colón", "SVC") );

        for (Integer i =0; i < currencies.size(); i++) {
            currencies.get(i).defaultValues();
        }

        return currencies;
    }

    // Convert a currency to another
    public static Double convert(Double amount, Double exchangeValue) {
        Double price;
        price = amount * exchangeValue;
        price = Math.round(price * 100d) / 100d;

        return price;
    }
}
