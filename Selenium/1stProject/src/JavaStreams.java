import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Aba");
		names.add("UgaBuga");
		names.add("Mictoris");

		List<String> let = names.stream().filter(s -> s.length() < 10).toList();

		List<String> let2 = names.stream().filter(s -> s.length() < 10).collect(Collectors.toList());

		System.out.println(let + " " + let2);

		boolean treste = names.stream().anyMatch(s -> s.contains("Aba"));
		System.out.println(treste);

		List<Integer> values = Arrays.asList(5, 4, 6, 6, 4, 878, 6, 6, 6, 6, 1, 8, 4, 3, 8, 41);

		List<Integer> uniqueNumbers = values.stream().distinct().toList();
		System.out.println(uniqueNumbers.stream().sorted().toList());
		
		

	}
}
