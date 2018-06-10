//package com.company;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.platform.runner.JUnitPlatform;
//import org.junit.platform.suite.api.IncludeEngines;
//import org.junit.runner.RunWith;
//
//import java.util.LinkedList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(JUnitPlatform.class)
//@IncludeEngines("junit-jupiter")
//class ConcertHallTest {
//    private ConcertHall broadway;
//
//    @BeforeEach
//    final void init() {
//        broadway = new ConcertHall("Brodway", "USA", "New York", "24/7");
//
//        broadway.addPerformance(new Orchestra(20, 30, 40, true, 3, 5, 10));
//        broadway.addPerformance(new CircusShow(14, 36, 90, true, "Ben", "american", 22, 3));
//        broadway.addPerformance(new RockConcert(50, 8, 70, true, 5, 4, 8));
//    }
//
//    @Test
//    void testPrintList() {
//        List<Bird> result =  broadway.getBirdList();
//        broadway.printList(result);
//        List<Bird> expected = new LinkedList<>();
//        assertNotEquals(expected, result, "Lists don't match");
//    }
//
//    @Test
//    void testAddPerformance() {
//        broadway = new ConcertHall();
//        List<Bird> performanceList = new LinkedList<>();
//        assertTrue(performanceList.isEmpty());
//        performanceList.add(new Orchestra(20, 30, 40, true, 3, 5, 10));
//        assertFalse(performanceList.isEmpty());
//    }
//
//    @Test
//    void testFindPerformanceByType() {
//        broadway = new ConcertHall();
//        Orchestra orchestra = new Orchestra(20, 30, 40, true, 3, 5, 10);
//        CircusShow circusShow = new CircusShow(14, 36, 90, true, "Ben", "american", 22, 3);
//        broadway.addPerformance(orchestra);
//        broadway.addPerformance(circusShow);
//        List<Bird> result;
//        result = broadway.findByShowWithMusician(PerformanceType.ORCHESTRA);
//        assertEquals(orchestra, result.get(0), "Type doesn't match");
//    }
//
//    @Test
//    void testSortByPrice() {
//        List<Bird> result = broadway.getBirdList();
//        broadway.sortByPrice(result);
//
//        assertEquals(50.0, result.get(2).getPrice(), "Price doesn't match");
//    }
//
//    @Test
//    void testGeneralToString() {
//        assertFalse(broadway.getBirdList().toString().contains("@"));
//        assertFalse(broadway.toString().contains("@"));
//    }
//
//    @Test
//    void testWriter() {
//        Writer writer = new Writer();
//        try {
//            writer.writeToFile(broadway.getBirdList());
//        } catch (Exception e) {
//            assertFalse(false, "Unexpected exception was thrown");
//        }
//    }
//
//}
