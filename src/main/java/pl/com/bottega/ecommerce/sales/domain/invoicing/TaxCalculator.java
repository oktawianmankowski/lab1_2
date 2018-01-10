package pl.com.bottega.ecommerce.sales.domain.invoicing;

/**
 * Created by Justyna on 10.01.2018.
 */
public interface TaxCalculator {
    public Tax calculateTax(RequestItem item);
}
