import java.util.*;

public class HuffmanDecode {
	public void convertor(String value) {
		HashMap<String, Character> map = new HashMap<>();
		map.put("0", 'A');
		map.put("10", 'B');
		map.put("110", 'C');
		map.put("1110", 'D');
		map.put("1111", 'E');
		String result = "";
		int count = 0;
		for (int i = 0; i < value.length(); i++) {
			count++;
			result += value.charAt(i);
			if (value.charAt(i) == '0' || count == 4) {
				if (count == 4 && value.charAt(i) == '0') {
					System.out.print(map.get(result));
				} else {
					System.out.print(map.get(result));
				}
				result = "";
				count = 0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String value = sc.nextLine();
		HuffmanDecode obj = new HuffmanDecode();
		obj.convertor(value);

	}

}
