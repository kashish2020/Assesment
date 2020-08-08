package traineemgt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TraineeMain {

	Map<Integer, Trainee> traineemap = new HashMap<>();
	Set<CStrainee> cStraineeSet = new HashSet<>();
	Set<ECETrainee> eceTrainees = new HashSet<>();

	public static void main(String[] args) {
		TraineeMain Traineemain = new TraineeMain();
		Traineemain.runApp();
	}

	public void runApp() {

		Trainee trainee1 = new ECETrainee(1, "kashish", "ammeter");
		Trainee trainee2 = new ECETrainee(2, "singh", "semiconductor");
		Trainee trainee3 = new CStrainee(3, "shanu", 1);
		Trainee trainee4 = new CStrainee(4, "Abc", 4);
		traineemap.put(trainee1.getId(), trainee1);
		traineemap.put(trainee2.getId(), trainee2);
		traineemap.put(trainee3.getId(), trainee3);
		traineemap.put(trainee4.getId(), trainee4);
		for (Trainee trainee : traineemap.values()) {
			//Trainee typeTrainee = (Trainee) trainee;
			boolean iscs = trainee instanceof CStrainee;
			if (iscs) {
				set1.add((CStrainee) trainee);
			} else {
				set2.add((ECETrainee) trainee);
			}
		}
		System.out.println("Displaying Cse Trainee");
		for (CStrainee csset : cStraineeSet) {
			int id = csset.getId();
			int language = csset.getLanguages();
			String name = csset.getName();
			System.out.println("The name=" + name + " Id=" + id + " Languages=" + language);
		}

		System.out.println("Displaying Ece Trainee");
		for (ECETrainee eceset : eceTrainees) {
			int id = eceset.getId();
			String devices = eceset.getDevices();
			String name = eceset.getName();
			System.out.println("The name=" + name + " Id=" + id + " devices=" + devices);
		}

	}
}
