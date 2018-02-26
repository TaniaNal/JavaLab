
package Main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Birds.Bird;
import Birds.Duck;
import Birds.Sparrow;
import Birds.Stock;
import enums.DepartingBirds;
import Manager.ZooManager;

public class Main {

	public static void printList(List<Bird> List) {
		List.forEach((Bird x) -> {
			System.out.println(x.toString());
		});
	}

	public static void main(String[] args) {
		ZooManager tania = new ZooManager();

		List<Bird> arrayList = new LinkedList<>();
		arrayList.add(new Duck("Duck", 2));
		arrayList.add(new Sparrow("Sparrow", 8));
		arrayList.add(new Stock("Stock", DepartingBirds.FLYAWAY));

		boolean menu = true;
		while (menu) {

			System.out.println("Menu");
			System.out.println(" 1 - Print list of birds;");
			System.out.println(" 2 - Search departing birds;");
			System.out.println(" 3 - Print list of birds sorted by weight;");
			System.out.println(" 4 - Exit;");

			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			switch (num) {
			case 1:

				printList(arrayList);
				break;

			case 2: {
				List<String> someDeparting = new LinkedList<>();
				someDeparting.add("Duck");
				someDeparting.add("Stock");

				List<Bird> arrayList1 = tania.searchDepartingBirds(someDeparting);
				System.out.println("Find departing birds " + someDeparting);
				System.out.println(arrayList1);
				break;
			}
			case 3: {
				System.out.println();
				break;
			}
			case 4:
				break;
			default: {
				System.out.println("Exited programm");
				menu = false;
				break;

			}
			}
		}
	}
}
