
package Manager;

import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

import Birds.Bird;

public class ZooManager {

	List<Bird> parameterBirdList = new LinkedList<>();

	private List<Bird> bird = new LinkedList<>();

	public ZooManager() {
	}

	public ZooManager(List<Bird> bird) {
		super();
		this.bird = bird;
	}

	public ZooManager(List<Bird> decorations, List<Bird> parameterBirdList) {
		super();
		this.parameterBirdList = parameterBirdList;
	}

	public List<Bird> getBird() {
		return bird;
	}

	public List<Bird> getParameterBirdList() {
		return parameterBirdList;
	}

	public List<Bird> searchDepartingBirds(List<String> departingBirds) {
		for (Bird bird : bird) {
			
			for (String string : departingBirds) {
				if (bird.getDepartingBirds().equalsIgnoreCase(string)) {
					parameterBirdList.add(bird);
				}
			}
		}
		return parameterBirdList;
	}

	public List<Bird> searchDepartingBirds(String departingBirds) {
		for (Bird bird : bird) {
			if (bird.getDepartingBirds().equalsIgnoreCase(departingBirds)) {
				parameterBirdList.add(bird);
			}
		}
		return parameterBirdList;
	}

	public void setWeight(List<Bird> bird) {
		this.bird = bird;
	}

	public void setParameterBirdList(List<Bird> parameterBirdList) {
		this.parameterBirdList = parameterBirdList;
	}

	public void sortByWeight(List<Bird> list) {
		parameterBirdList.sort((Bird o1, Bird o2)->o1.getWeight().compareTo(o2.getWeight()));
	}
	public void addBird(Bird bird) {
		this.bird.add(bird);
		
	}

}
