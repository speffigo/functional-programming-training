package programs;

import java.util.List;
import java.util.Optional;
//import java.util.*;
import java.util.function.Predicate;

public class example02 {

	public static void main(String[] args) {

		List<String> list = List.of("Effigo", "bob", "procure");

		Predicate<? super String> Predicate = str -> str.startsWith("E");

		Optional<String> optional = list.stream().filter(Predicate).findFirst();

		System.out.println(optional.get());
		System.out.println(optional.isPresent());
	}
}
