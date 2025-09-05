package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private double subtotal;
    private double total;
    private double tax;

    public double calculate(Order order, String taxRate) {
        this.subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        this.tax = subtotal * Double.parseDouble(taxRate);
        this.total = this.subtotal + this.tax;
        return total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public double getTax() {
        return tax;
    }
}
