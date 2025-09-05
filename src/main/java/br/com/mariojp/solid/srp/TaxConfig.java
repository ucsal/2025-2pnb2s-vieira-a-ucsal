package br.com.mariojp.solid.srp;

import java.util.Properties;

public class TaxConfig {
    public static String getTaxRate() {
        return System.getProperty("tax.rate", "0.08");
    }
}
