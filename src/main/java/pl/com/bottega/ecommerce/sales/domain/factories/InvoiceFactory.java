package pl.com.bottega.ecommerce.sales.domain.factories;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.invoicing.Invoice;

public class InvoiceFactory {
	public Invoice createInvoice(ClientData client) {
		return new Invoice(Id.generate(), client);
	}
}
