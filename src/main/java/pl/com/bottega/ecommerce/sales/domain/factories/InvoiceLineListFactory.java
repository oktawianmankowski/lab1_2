package pl.com.bottega.ecommerce.sales.domain.factories;

import java.util.ArrayList;
import java.util.List;

import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceLine;

public class InvoiceLineListFactory {
	public List<InvoiceLine> createInvoiceLineList() {
		return new ArrayList<InvoiceLine>();
	}
}
