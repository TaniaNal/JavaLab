package Lab4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Processor {
	public String readInputText() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Write text");
		String s = sc.nextLine();
		return s;

	}

	public String processText(String inputText) {
		String txt = new String();
		String[] txtArray = inputText.split(" ");
		Pattern p = Pattern.compile("[aeyuoi]", Pattern.CASE_INSENSITIVE);

		for (String varriable : txtArray) {
			Matcher matcher = p.matcher(varriable);
			int n = 0;
			while (matcher.find()) {
				n++;
			}
			if (varriable.length() - n > +n) {
				txt = txt + varriable + " ";
			}
		}

		return txt;
	}

	public void showResult(String resultText) {
		System.out.print(resultText);
	}

}
