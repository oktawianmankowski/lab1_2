package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Justyna on 10.01.2018.
 */
public class PaymentCreator {

    public static Payment createPayment(ClientData clientData, Money amount) {
        return new Payment(Id.generate(), clientData, amount);
    }
}
