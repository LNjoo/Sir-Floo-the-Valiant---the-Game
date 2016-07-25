public class Hero extends Person {
	//this makes a subclass of the superclass person. this subclass is a hero, which is a person, but a specific kind of person.
	int tSkills = 0;
	int tGoodness = 0;
	int tFoodLevel = 0;
	int tAmountEaten = 0;
	int tDistanceAway = 100;
	int tDistanceTravelled = 0;

	//SKILL LEVEL
	void increaseSkills(int increment) {
		tSkills = tSkills + increment;
	}
	void decreaseSkills(int decrement) {
		tSkills = tSkills - decrement;
	}
	void getSkills(){
		System.out.println("Your skill level is now " + tSkills + ".");
	}

	//GOODNESS LEVEL IDK LOL
	void increaseGoodness(int increment) {
		tGoodness = tGoodness + increment;
	}
	void decreaseGoodness(int decrement) {
		tGoodness = tGoodness - decrement;
	}
	void getGoodness(){
		System.out.println("Your goodness is now " + tGoodness + ".");
	}

	//FOOD LEVEL
	void increaseFood(int increment) {
		tFoodLevel = tFoodLevel + increment;
	}
	void eatFood(int decrement) {
		tFoodLevel = tFoodLevel - decrement;
		tAmountEaten = tAmountEaten + decrement;
	}
	void getFoodLevel(){
		System.out.println("Your amount of food is now " + tFoodLevel + " lbs.");
	}
	void getAmountEaten(){
		System.out.println("You have eaten " + tAmountEaten + " lbs of food today.");
	}
	boolean satisfiesDailyFood(){
		if (tAmountEaten>=2) {
			return true;
		}
		else{
			return false;
		}
	}

	//DISTANCE TRAVELLED
	void increaseDistanceTravelled(int increment) {
		tDistanceTravelled = tDistanceTravelled + increment;
		tDistanceAway = tDistanceAway - increment;
	}
	void getDistanceAway(){
		System.out.println("You are now " + tDistanceAway + " miles from Floodlewarts.");
	}
	void getDistanceTravelled(){
		System.out.println("You have travelled a total of " + tDistanceTravelled + " miles.");
	}

	//PRINT ALL STATES
	void printStates(){
		System.out.println("Health: " + tHealth + "%\nMorale: " + tMorale + "%\nAmount of Food: " + tFoodLevel + "lbs\nPower: " + tPower + "\nDistance to Travel: " + tDistanceAway);
	}

	boolean heroHasWon(int goodness) {
		if (goodness>100) {
			return true;
		}
		return false;
	}

	boolean heroIsDepressed(){
		if(tMorale<=0) {
			return true;
		}
		return false;
	}

	boolean hasReachedCity(){
		if (tDistanceAway<=0) {
			return true;
		}
		return false;
	}

	int tStrength = (tHealth + tPower)/2;
}