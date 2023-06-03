package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String arr[]) {
		Customer Ali = new Customer("Ali", "99999");
		greetCustomer(Ali);
		greetCustomer.accept(Ali);
		greetCustomerV1.accept(Ali, false);
		greetCustomerV1(Ali,true);
	}

	static void greetCustomer(Customer customer) {
		System.out.println("Hello," + customer.name + " thanks for registering phone number " + customer.phoneNumber);
	}

	// Consumer Functional interface
	static Consumer<Customer> greetCustomer = customer -> System.out
			.println("Hello," + customer.name + " thanks for registering phone number " + customer.phoneNumber);

	static BiConsumer<Customer, Boolean> greetCustomerV1 = (customer, showPhoneNumber) -> System.out
			.println("Hello," + customer.name + " thanks for registering phone number "
					+ (showPhoneNumber ? customer.phoneNumber : "********"));

	static void greetCustomerV1(Customer customer, boolean showPhoneNumber) {
		System.out.println("Hello," + customer.name + " thanks for registering phone number "
				+ (showPhoneNumber ? customer.phoneNumber : "********"));
	}

	static class Customer {
		private final String name;
		private final String phoneNumber;

		public Customer(String name, String phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}

	}

}
