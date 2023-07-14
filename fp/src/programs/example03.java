package programs;

import java.util.List;

public class example03 {

	public static void main(String[] args) {

		Characters(List.of("effigo", "bob", "procurement"));
		squaresOfOddNumbers(List.of(2, 3, 44, 556, 456));
		squaresOfEvenNumbers(List.of(2, 3, 44, 556, 456));
	}

	private static void Characters(List<String> list) {

		list.stream().map(str -> str + " length is: " + str.length()).forEach(System.out::println);

	}

	private static void squaresOfOddNumbers(List<Integer> list) {
		list.stream().filter(number -> number % 2 != 0).map(c -> c * c).forEach(System.out::println);

	}

	private static void squaresOfEvenNumbers(List<Integer> list) {
		list.stream().filter(number -> number % 2 == 0).map(c -> c * c).forEach(System.out::println);
	}

}
