
package Manager;

import java.util.LinkedList;
import java.util.List;

import Birds.Bird;

public class ZooManager {

    private List<Bird> parameterBirdList = new LinkedList<>();

    public final void setBird(final List<Bird> bird) {
        this.bird = bird;
    }
    private List<Bird> bird = new LinkedList<>();

    public  ZooManager() {
    }

//    public ZooManager(final List<Bird> bird) {
//        super();
//        this.bird = bird;
//    }
//
//    public ZooManager(final List<Bird> decorations, final List<Bird> parameterBirdList) {
//        super();
//        this.parameterBirdList = parameterBirdList;
//    }

    public final List<Bird> getBird() {
        return bird;
    }

//    public final List<Bird> getParameterBirdList() {
//        return parameterBirdList;
//    }

    public final List<Bird> searchDepartingBirds(final List<String> departingBirds) {
        for (Bird bird : bird) {

            for (String string : departingBirds) {
                if (bird.getDepartingBirds().equalsIgnoreCase(string)) {
                    parameterBirdList.add(bird);
                }
            }
        }
        return parameterBirdList;
    }

//    public final List<Bird> searchDepartingBirds(final String departingBirds) {
//        for (Bird bird : bird) {
//            if (bird.getDepartingBirds().equalsIgnoreCase(departingBirds)) {
//                parameterBirdList.add(bird);
//            }
//        }
//        return parameterBirdList;
//    }

//    public final void setWeight(final List<Bird> bird) {
//        this.bird = bird;
//    }
//
//    public final void setParameterBirdList(final List<Bird> parameterBirdList) {
//        this.parameterBirdList = parameterBirdList;
//    }

    public final void sortByWeight(final List<Bird> parameterBirdList) {
        parameterBirdList.sort((Bird o1, Bird o2)->o1.getWeight() - o2.getWeight());
    }

//    public final void addBird(final Bird bird) {
//        this.bird.add(bird);
//    }

    public static void printList(final List<Bird> List) {
        List.forEach((Bird x) -> {
            System.out.println(List.toString());
        });
    }

}
