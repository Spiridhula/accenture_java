package accenturejava;

import accenturejava.model.DrinkPrice;
import accenturejava.model.Order;
import accenturejava.model.Payment;
import accenturejava.model.Price;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AccentureJava {

	public static void main(String[] args) {
		FileLoader fileLoader = new FileLoader();

		// load all files
		List<Payment> allPayments = fileLoader.loadPayments();
		List<Order> allOrders = fileLoader.loadOrders();
		List<Price> allPrices = fileLoader.loadPrices();

		// convert payments to a key-value pair with user as a key an total payment as a value
		Map<String, Double> allUserPayments = new HashMap<>();
		allPayments.forEach(payment -> {
			Double previousPayment = allUserPayments.get(payment.getUser()) != null ? allUserPayments.get(payment.getUser()) : 0.0;
			allUserPayments.put(payment.getUser(), previousPayment + payment.getAmount());
		});

		// convert all prices to a hashmap for ease of access
		Map<String, DrinkPrice> drinkPriceMap = allPrices.stream().collect(Collectors.toMap(Price::getDrinkName, Price::getPrice));

		// calculate users total expense for all orders
		Map<String,Double> allUserExpenses = new HashMap<>();
		allOrders.forEach(order -> {
			Double oldOrderPrice = allUserExpenses.get(order.getUser()) != null ? allUserExpenses.get(order.getUser()) : 0.0;
			Double drinkPrice = drinkPriceMap.get(order.getDrink()).getBySizeName(order.getSize());
			allUserExpenses.put(order.getUser(), oldOrderPrice + drinkPrice);
            
            System.out.println(order.getUser());
		});


		allUserExpenses.forEach((user, expense) -> System.out.println(
				"user: " + user +
						", total expense: " + expense +
						", payed until now: " + allUserPayments.get(user) +
						", owes still: " + (expense - allUserPayments.get(user))
				));
	}
}
