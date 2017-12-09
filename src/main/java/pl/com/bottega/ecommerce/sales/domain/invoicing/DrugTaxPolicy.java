package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class DrugTaxPolicy implements TaxPolicy {

    public Tax getTax(RequestItem requestItem) {
        Money net = requestItem.getTotalCost();
        BigDecimal ratio = null;
        String desc = null;

        ratio = BigDecimal.valueOf(0.05);
        desc = "5% (D)";

        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}
