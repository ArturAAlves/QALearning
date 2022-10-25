import java.util.ArrayList;
import java.util.Collections;

public class coreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String website = "www.sapo.pt";
		double dec = 5.9;
		boolean present = true;

		System.out.println(num + " Number stored in numb vriable");
		System.out.println(website + " webiste");
		System.out.println("print all variables" + num + " - " + website + " - " + dec + " - " + present);

		int[] arr = new int[4];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 20;
		arr[3] = 20;

		// String teste = "";

		// for (int numer : arr) {
		// teste = teste + " " + numer;
		// }

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		Collections.sort(cars); // Sort cars
		for (String i : cars) {
			System.out.println(i);
		}

		String one = " hello rauuul ";

		String[] after = one.split(" ");
		String trimer = one.trim();
		System.out.println(after[1] + "" + after[0]);
		System.out.println(one);
		System.out.println(trimer);

//		for (int a : one) {
//			System.out.println(a);
//		}
		one = one.trim();

		for (int itres = 0; itres < one.length(); itres++) {
			System.out.println(one.charAt(itres));
		}

		// System.out.println(teste);
		 System.out.println(getData());
		
		
	}

	public static String getData() {
		return "hello world";

	}
}
