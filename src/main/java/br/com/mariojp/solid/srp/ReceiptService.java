package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
		String taxRate = TaxConfig.getTaxRate();

		TaxCalculator taxCalculator = new TaxCalculator();

		double total = taxCalculator.calculate(order, taxRate);
		double subtotal = taxCalculator.getSubtotal();
		double tax = taxCalculator.getTax();

		return ReceiptFormatter.format(order, tax, subtotal, total);
	}
}
