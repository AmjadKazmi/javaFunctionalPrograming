package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String arr[]) {
		int number = incrementByOne(0);
		System.out.println(number);
        
		//Function takes one argument and produce one result
		int number2 = incrementByOneFunction.apply(1);
		System.out.println(number2);

		Function<Integer, Integer> AddBy1ThenMultiplyBy10 = incrementByOneFunction.andThen(mutliplyBy10Function);

		int addMultiply = AddBy1ThenMultiplyBy10.apply(2);
		System.out.println(addMultiply);
		
		System.out.println(AddBy1ThenMultiplyBy10.apply(4));
		
		//BiFunction takes two arguments and produce one result
		System.out.println(incrementByOneAndMutliplyBiFunction.apply(4,100 ));
	}

	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

	static Function<Integer, Integer> mutliplyBy10Function = number -> number * 10;

	static BiFunction<Integer, Integer, Integer> incrementByOneAndMutliplyBiFunction = (numberAddbyOne,
			numberMutliply) -> (numberAddbyOne + 1) * numberMutliply;

	static int incrementByOne(int number) {
		return number + 1;
	}

}
