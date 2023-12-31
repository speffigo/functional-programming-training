package programs;

import java.util.List;

public class example4 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		courses.stream().forEach(System.out::println);

		System.out.println();

		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		System.out.println();

		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);

		System.out.println();

		courses.stream().map(course -> course + " = " + course.length()).forEach(System.out::println);

	}

}
