package accenturejava;

import accenturejava.model.Order;
import accenturejava.model.Payment;
import accenturejava.model.Price;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {
	public List<Order> loadOrders () {
		List<Order> orders = new ArrayList<>();
		try {
			InputStream inJson = Order.class.getResourceAsStream("/orders.json");
			orders = new ObjectMapper().readValue(inJson, new TypeReference<List<Order>>() {
				@Override
				public Type getType() {
					return super.getType();
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return orders;
	}

	public List<Payment> loadPayments () {
		List<Payment> payments = new ArrayList<>();
		try {
			InputStream inJson = Order.class.getResourceAsStream("/payments.json");
			payments = new ObjectMapper().readValue(inJson, new TypeReference<List<Payment>>() {
				@Override
				public Type getType() {
					return super.getType();
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return payments;
	}

	public List<Price> loadPrices () {
		List<Price> prices = new ArrayList<>();
		try {
			InputStream inJson = Order.class.getResourceAsStream("/prices.json");
			prices = new ObjectMapper().readValue(inJson, new TypeReference<List<Price>>() {
				@Override
				public Type getType() {
					return super.getType();
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prices;
	}
}
