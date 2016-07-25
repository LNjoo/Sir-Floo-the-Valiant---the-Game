public class Person {
	int tHealth = 100;
	int tMorale = 100;
	int tPower = 0;
	
	void increaseHealth(int increment) {
		tHealth = tHealth + increment;
	}
	void decreaseHealth(int decrement) {
		tHealth = tHealth - decrement;
	}
	void getHealth(){
		System.out.println("Your health is now " + tHealth + "%.");
	}

	void increaseMorale(int increment) {
		tMorale = tMorale + increment;
	}
	void decreaseMorale(int decrement) {
		tMorale = tMorale - decrement;
	}
	void getMorale(){
		System.out.println("Your morale is now " + tMorale + "%.");
	}

	void increasePower(int increment) {
		tPower = tPower + increment;
	}
	void decreasePower(int decrement) {
		tPower = tPower - decrement;
	}
	void getPower(){
		System.out.println("Your power is now " + tPower + ".");
	}

	void printStates(){
		System.out.println("Health: " + tHealth + "\nMorale: " + tMorale + "\nPower: " + tPower);
	}

	
	boolean checkIfDead() {
		if (tHealth > 0) {
			return false;
		}
		return true;
	}

	boolean hasNotLostAllHope() {
		if (tMorale>0) {
			return true;
		}
		return false;
	}

}