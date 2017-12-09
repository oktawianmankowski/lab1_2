package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class StandardTaxPolicy implements TaxPolicy {

    public Tax calculateTax(RequestItem item) {
        Money net = item.getTotalCost();
        BigDecimal ratio = null;
        String desc = null;

        switch (item.getProductData().getType()) {
            case STANDARD:
                ratio = BigDecimal.valueOf(0.23);
                desc = "23%";
                break;

            default:
                throw new IllegalArgumentException(item.getProductData().getType() + " not handled");
        }

        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}
