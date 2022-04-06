import java.util.Scanner;

public class IntegerToRoman {
	public static void integerToRoman(int num) {
		System.out.println("Integer: " + num);
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num -= values[i];
				roman.append(romanLiterals[i]);
			}
		}
		System.out.println("Roman: " + roman.toString());
		System.out.println("---------------------------------------------------");
	}

	public static void main(String[] args) {
		System.out.println("              Integer to Roman         ");
		System.out.println("---------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a input:");
		int num = scan.nextInt();
		integerToRoman(num);

	}
}
