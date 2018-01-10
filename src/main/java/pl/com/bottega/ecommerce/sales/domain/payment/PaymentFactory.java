package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PaymentFactory {

    public Payment getPayment(ClientData clientData, Money money) {
        Id id = Id.generate();
        return new Payment(id, clientData, money.multiplyBy(-1));
    }
}
