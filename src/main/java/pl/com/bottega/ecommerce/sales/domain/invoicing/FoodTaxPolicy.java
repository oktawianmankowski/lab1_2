package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class FoodTaxPolicy implements TaxPolicy {

    public Tax calculateTax(RequestItem item) {
        Money net = item.getTotalCost();
        BigDecimal ratio = null;
        String desc = null;

        switch (item.getProductData().getType()) {
            case FOOD:
                ratio = BigDecimal.valueOf(0.07);
                desc = "7% (F)";
                break;

            default:
                throw new IllegalArgumentException(item.getProductData().getType() + " not handled");
        }

        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}
