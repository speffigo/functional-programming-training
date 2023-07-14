package programs;

import java.util.List;

public class example01 {

	public static void main(String[] args) {
		evenNumber(List.of(3, 5, 6, 6, 7, 2, 4, 6));
		printNumbers(List.of(2, 3, 44, 556, 456));
		printOddNumbers(List.of(3, 5, 6, 6, 7, 2, 4, 6));

	}

	private static void printNumbers(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);

	}

	private static void evenNumber(List<Integer> n) {
		n.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}

	private static void printOddNumbers(List<Integer> list) {
		list.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}
}
