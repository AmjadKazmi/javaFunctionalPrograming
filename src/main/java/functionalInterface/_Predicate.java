package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
	public static void main(String[] args) {
		System.out.println("Phone number is :" + isPhoneNumberValid("+919045810110"));
		System.out.println("Phone number is : " + isPhoneNumberValidPredicate.test(("+9190458")));
		System.out.println("Phone number start +91 and contains 3 :"
				+ isPhoneNumberValidPredicate.and(isPhoneNumberContains3Predicate).test("919045810110"));
	}

	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("+91")
			&& phoneNumber.length() == 13;

	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("+91") && phoneNumber.length() == 13;
	}

	static Predicate<String> isPhoneNumberContains3Predicate = phoneNumber -> phoneNumber.contains("3");

}
