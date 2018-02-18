package lab;

public class Main {
public static void main(String[] args) {
		
		Action action1 = new Action();
		Action action2 = new Action("VOC", 2017, 201, 1);
		Action action3 = new Action("Security", 2006, 1256, 75, 452);
		
		System.out.println(action1.toString());
		System.out.println(action2.toString());
		System.out.println(action3.toString());
		
		Action.printStaticSum();
		action3.printSum();
		
		action1.resetValues("Love", 2018, 653, 10, 47);
		action3.resetValues("Security", 2007, 45, 202, 758);
		action2.setPrice(1255);
		
		System.out.println(action1.toString());
		System.out.println(action2.toString());
		System.out.println(action3.toString());
		
		Action.printStaticSum();
		action1.printSum();
	}
}
