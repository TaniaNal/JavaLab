package Lab4;

public class Main {

	public static void main(String[] args) {

		Processor processor = new Processor();
		String txt = processor.readInputText();
		processor.showResult(processor.processText(txt));
	}
}
