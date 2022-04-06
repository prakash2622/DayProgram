import java.util.*;

public class HuffmanDecoder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String numValue = sc.nextLine();
		String result = decoder(numValue);
		System.out.println(result);
		sc.close();
	}

	public static String decoder(String numValue) {
		String decode = "";
		int count = 0;
		for (int i = 0; i < numValue.length(); i++) {
			if (numValue.charAt(i) == '0') {
				if (count == 0) {
					decode = decode + "A";
				} else if (count == 1) {
					decode = decode + "B";
				} else if (count == 2) {
					decode = decode + "C";
				} else {
					decode = decode + "D";
				}
				count = 0;
			} else {
				count++;
				if (count == 4) {
					decode = decode + "E";
					count = 0;
				}

			}
		}

		return decode;
	}
}
