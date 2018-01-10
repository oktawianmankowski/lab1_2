package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxCalculatorInterface {

    public Tax calculateTax(RequestItem requestItem);
}
