public class Villain extends Person {
	boolean heroHasWon(int power) {
		if (power<=0) {
			return true;
		}
		return false;
	}	
	boolean heroHasLost(int power) {
		if (power>100) {
			return true;
		}
		return false;
	}
}