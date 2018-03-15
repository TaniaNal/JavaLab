
package Manager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Birds.Bird;
import Birds.Duck;
import Birds.Sparrow;
import Birds.Stock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Manager.ZooManager.printList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class ZooManagerTest {
    private ZooManager zooManager;
    private ArrayList<Bird> arrayList;

    @BeforeEach
    void setUp() {
        ZooManager tania = new ZooManager();

        arrayList = new ArrayList<>();
        arrayList.add(new Sparrow("Sparrow", 8, 6));
        arrayList.add(new Stock("Stock", 6, 89, 56));
        arrayList.add(new Duck("Duck", 2, 5));

        tania.setBird(arrayList);

        System.out.println(" List of all birds;");
        System.out.println(" Search departing birds;");
        System.out.println(" Print list of birds sorted by weight;");

        printList(arrayList);

        List<String> someDeparting = new LinkedList<>();
        someDeparting.add("Duck");
        someDeparting.add("Stock");

        List<Bird> arrayList1 = tania.searchDepartingBirds(someDeparting);
        System.out.println("Find departing birds " + someDeparting);
        System.out.println(arrayList1);

        System.out.println("\nSorted list:\n");
        tania.sortByWeight(tania.getBird());
        tania.getBird().forEach((Bird o1) -> System.out.println(o1.toString()));
    }

    @Test
    void testGetLength() {
        Sparrow sparrow = new Sparrow("Jack", 8, 10);
        assumingThat(sparrow != null, () -> assertEquals(8, sparrow.getLengthOfWings()));
    }

    @Test
    void testGetWeight() {
        Sparrow sparrow = new Sparrow("Jack", 8, 10);
        assumingThat(sparrow != null, () -> assertEquals(10, sparrow.getWeight()));
    }

    @Test
    void testAdd() {
        arrayList = new ArrayList<>();
        arrayList.add(new Sparrow("Sparrow", 8, 6));
        arrayList.add(new Stock("Stock", 6, 89, 56));
        arrayList.add(new Duck("Duck", 2, 5));
        assertEquals(6, arrayList.get(0).getWeight());
    }

    @Test
    void testFindBird() {
        ZooManager tania = new ZooManager();

        arrayList = new ArrayList<>();
        arrayList.add(new Sparrow("Sparrow", 8, 6));
        arrayList.add(new Stock("Stock", 6, 89, 56));
        arrayList.add(new Duck("Duck", 2, 5));

        tania.setBird(arrayList);

        List<String> someDeparting = new LinkedList<>();
        someDeparting.add("Duck");
        someDeparting.add("Stock");

        List<Bird> arrayList1 = tania.searchDepartingBirds(someDeparting);

        assertEquals(6, arrayList.get(0).getWeight());
        assertEquals(56, arrayList.get(1).getWeight());
    }

    @AfterEach
    void tearDown() {
        zooManager = null;
    }
}
