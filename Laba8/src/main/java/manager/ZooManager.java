
package manager;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import birds.Bird;
import enums.BirdType;

public class ZooManager {

    public final void setBirds(final List<Bird> birds) {
        this.birds = birds;
    }

    private List<Bird> birds = new LinkedList<>();

    public ZooManager() {
    }

    public final List<Bird> getBirds() {
        return birds;
    }

    public final List<Bird> searchDepartingBirds(final BirdType... birdTypes) {
        List<BirdType> birdsToSearch = Arrays.asList(birdTypes);
        List<Bird> result = new LinkedList<>();
        for (Bird bird : birds) {
            if(birdsToSearch.contains(bird.getDepartingBirds())) {
                result.add(bird);
            }
        }
        return result;
    }

    public final void sortByWeight(final List<Bird> parameterBirdList) {
        parameterBirdList.sort((Bird o1, Bird o2) -> o1.getWeight() - o2.getWeight());
    }

    public final void addBird(final Bird bird) {
        this.birds.add(bird);
    }

}
