import java.util.Scanner;
import java.lang.*;
public class StoryTrial {
	public static void main (String args[]) {
		Scanner user_input = new Scanner(System.in);

		Hero floo = new Hero();
		Villain floodemort = new Villain();

		System.out.println("\n\n\t\t\tSIR FLOO THE VALIANT: THE GAME\n");
		userContinue();
		System.out.println("Welcome to the kingdom of Floodlewarts. You, Sir Floo the Valiant, are a brave young knight on a trip away from the castle. However, your evil uncle Lord Floodemort wants to take over the throne.");
		System.out.println("You've received word that Lord Floodemort plans to destroy the city in five days. Your friends, family, and kingdom are at stake. You have to make it back in time to save your city.");
		System.out.println("Can you make it to Floodlewarts in time?");
		userContinue();
		System.out.println("INSTRUCTIONS: To win the game, make it to Floodlewarts and defeat Floodemort. The levels of your health, morale, and fighting ability depend on the choices you make. Choose wisely!");
		System.out.println("Sleeping and eating increases your health and morale. For every day that you do not sleep or eat, your health will decrease. You can find supplies on your way.");
		System.out.println("Be careful! There will be dangers along the way that will threaten your health, but might just make you stronger.");
		userContinue();

			//DAY 1 Part 1
			System.out.println("\n\t\t\t\t\tDAY 1\n");
			floo.printStates();
			System.out.println("You wake before the sun does. It is the morning of the first day of your journey. What do you do first? Press 1 to travel north. Press 2 to collect food first.");
			int userChoice = user_input.nextInt();
			if (userChoice==2) {
				chooseToCollectFood(floo);
			}
			else{
				chooseToTravel(floo);
			}
			//DAY 1 Part 2
			System.out.println("\nIt is now mid-day. What do you do next? Press 1 to continue travelling. Press 2 to collect food. Press 3 to eat. Press 4 to take a nap.");
			standardScenario(floo);
			//DAY 1 Part 3		
			System.out.println("\nIt is the middle of the afternoon and quite hot. If you travel, you might get heatstroke. But you hear a pack of coyotes nearby and you\'re afraid they might attack you if you let down your guard.");
			System.out.println("What do you do next? Press 1 to continue travelling. Press 2 to collect food. Press 3 to eat. Press 4 to take a nap.");
			userChoice = user_input.nextInt();
			if (userChoice==1) {
				floo.decreaseHealth(25);
				chooseToTravel(floo);
				System.out.println("Though you covered some miles, you got a bad case of heatstroke, leaving you weak and dizzy.");
				floo.getHealth();
				checkIfDead(floo);
			}
			if (userChoice==2) {
				floo.tFoodLevel = 0;
				System.out.println("While you were gone looking for food, the coyotes came and got your pack! Dangit. At least you have what you collected just now.");
				chooseToCollectFood(floo);
			}
			if (userChoice==3) {
				chooseToEat(floo);
			}
			if (userChoice==4) {
				System.out.println("You startle awake to to the sound of growls and claws tearing at your face. You scramble up and beat away the coyotes frantically, but the damage is already done. Oh well, at least you took a cat nap.");
				floo.decreaseHealth(25);
				checkIfDead(floo);
				chooseToSleep(floo);
			}
			//DAY 1 Part 4
			System.out.println("\nNight has fallen. There\'s only time to do one more thing today. You\'re tired and don\'t want to walk anymore, but time is ticking. It\'s cooled down again, but it\'s also gotten pretty dark. What do you do next? If you chance the darkness and travel onward, press 1. Press 2 if you want to collect food. Press 3 to eat. Press 4 to take a nap.");
			userChoice = user_input.nextInt();
			if (userChoice==1) {
				System.out.println("Though the way was rocky and dangerous, somehow you made it out without injury. A good way to end the day, you think to yourself.");
				chooseToTravel(floo);
			}
			if (userChoice==2) {
				System.out.println("As you grope around in the dark for edible things, a snake darts out and bites your hand. It\'s not poisonous, thank goodness, but it hurts nonetheless.");
				floo.decreaseMorale(10);
				floo.decreaseHealth(10);
				floo.getHealth();
				checkIfDead(floo);
				chooseToCollectFood(floo);
			}
			if (userChoice==3) {
				chooseToEat(floo);
			}
			if (userChoice==4) {
				chooseToSleep(floo);
			}
			System.out.println("\n\t\t\t\tEND OF DAY 1");
			endOfDay(floo);

			//DAY 2 Part 1
			System.out.println("\n\t\t\t\t\tDAY 2\n");
			floo.tAmountEaten = 0;
			int enemyStrength = 0;
			floo.printStates();
			System.out.println("\nYou startle awake to the sound of shouts nearby. A few seconds later, masked men burst into your clearing. It\'s Lord Floodemort's minions! What do you do next? Press 1 to go hide until they pass. Press 2 to step out and fight them.");
			userChoice = user_input.nextInt();
			if (userChoice==1) {
				chooseToHide(floo);
			}
			if (userChoice==2) {
				enemyStrength = 40; 
				chooseToFight(floo, enemyStrength);
			}
			//DAY 2 Part 2
			System.out.println("\nBy the time that whole ordeal is over, it\'s mid-day. What do you do next? Press 1 to continue travelling. Press 2 to collect food. Press 3 to eat. Press 4 to take a nap.");
			standardScenario(floo);
			//DAY 2 Part 3
			System.out.println("\nIn the distance, you hear footsteps and the sounds of many people. You aren\'t sure if they are friend or foe. What do you do next? Press 1 to continue travelling. Press 2 to go investigate.");
			userChoice = user_input.nextInt();
			if (userChoice==1) {
				chooseToTravel(floo);
			}
			if (userChoice==2) {
				System.out.println("When you get to them, you realize the people are more of Floodemort\'s evil soldiers. Press 1 to hide. Press 2 to engage them in battle.");
				userChoice = user_input.nextInt();
				if (userChoice==1) {
					chooseToHide(floo);
				}
				if (userChoice==2) {
					enemyStrength = 40; 
					chooseToFight(floo, enemyStrength);
				}
			}
			//DAY 2 Part 4
			System.out.println("\nNight has fallen and you\'re getting pretty tired. There isn\'t much longer left in today. What do you want to do? Press 1 to continue travelling. Press 2 to collect food. Press 3 to eat. Press 4 to go to sleep.");
			standardScenario(floo);
			System.out.println("\n\t\t\t\tEND OF DAY 2");
			endOfDay(floo);

			//DAY 3 Part 1
			System.out.println("\n\t\t\t\t\tDAY 3\n");
			floo.tAmountEaten = 0;
			floo.printStates();
			System.out.println("\nYou\'ve received word that Lord Floodemort is going to destroy the city in four days instead of five. Time is precious. What do you want to do? Press 1 to continue travelling. Press 2 to collect food. Press 3 to eat. Press 4 to take a nap.");
			standardScenario(floo);
			//DAY 3 Part 2
			System.out.println("\nSuddenly black-armored knights burst out of the forest. Lord Floodemort seems to have upped his game. These foes are more powerful that those you have faced before. What do you do next? Press 1 to go hide until they pass. Press 2 to step out and fight them.");
			userChoice = user_input.nextInt();
			if (userChoice==1) {
				chooseToHide(floo);
			}
			if (userChoice==2) {
				enemyStrength = 60; 
				chooseToFight(floo, enemyStrength);
			}
			//DAY 3 Part 3
			System.out.println("\nThankful that that\'s over, you look around and find that in all the commotion you\'ve accidentally entered a barren desert with seemingly nothing all around you. What do you do next? Press 1 to continue travelling. Press 2 to try and collect food. Press 3 to eat. Press 4 to take a nap.");
			userChoice = user_input.nextInt();
			if (userChoice==1) {
				chooseToTravel(floo);
			}
			if (userChoice==2) {
				System.out.println("Though you search everywhere for hours, there\'s no food to be found in the barren wasteland. What a waste of effort.");
				floo.decreaseMorale(10);
				floo.getMorale();
			}
			if (userChoice==3) {
				chooseToEat(floo);
			}
			if (userChoice==4) {
				chooseToSleep(floo);
			}
			//DAY 3 Part 4
			System.out.println("\nMoving on, you realize that you only have one day left to reach Floodlewarts, but it\'s starting to get dark. What do you do next? Press 1 to continue travelling. Press 2 to try and collect food. Press 3 to eat. Press 4 to take a nap.");
			standardScenario(floo);
			System.out.println("\n\t\t\t\tEND OF DAY 3");
			endOfDay(floo);

			//DAY 4 Part 1
			System.out.println("\n\t\t\t\t\tDAY 4\n");
			floo.tAmountEaten = 0;
			floo.printStates();
			System.out.println("\nYou MUST get to Floodlewarts before nightfall. There isn\'t much time left, and you can tell you\'re going to have a trying day. How do you prepare for your day? Press 1 to continue travelling. Press 2 to collect food. Press 3 to eat. Press 4 to take a nap.");
			standardScenario(floo);
			//DAY 4 Part 2
			System.out.println("\nYou notice a strange-looking fog coming from the north. Press 1 to go investigate. Press 2 to evade it.");
			userChoice = user_input.nextInt();
			if (userChoice==1) {
				System.out.println("The fog turns out to be an enchanted healing fog that makes you feel a lot better, a lot faster.");
				floo.increaseHealth(15);
				floo.getHealth();
			}
			if (userChoice==2) {
				System.out.println("\nWhen you go out of your way to evade the weird fog, you run straight into a camp of Floodemort\'s minions (the standard kind, not the terrifying knights). Press 1 to hide. Press 2 to fight.");
				userChoice = user_input.nextInt();
				if (userChoice==1) {
					chooseToHide(floo);
				}
				if (userChoice==2) {
					enemyStrength = 40; 
					chooseToFight(floo, enemyStrength);
				}
			}
			//DAY 4 Part 3
			System.out.println("\nYou only have half the day left to get to Floodlewarts. You know you\'re about to have a battle of epic proportions with Lord Floodemort. What do you want to do? Press 1 to continue travelling. Press 2 to try and collect food. Press 3 to eat. Press 4 to take a nap.");
			standardScenario(floo);
			//DAY 4 Part 4
			System.out.println("You\'ve run out of time. Lord Floodemort has destroyed the entire city of Floodlewarts, including all your friends and family.");
			System.out.println("\n\t\t\t\tGAME OVER!");
	}

	public static void chooseToTravel(Hero floo){
		floo.increaseDistanceTravelled(10);
		floo.getDistanceAway();
		floo.getDistanceTravelled();
		if (floo.hasReachedCity()) {
			finalBattle(floo);
			System.exit(0);
		}
	}

	public static void chooseToCollectFood(Hero floo){
		floo.increaseFood(2);
		floo.getFoodLevel();
	}

	public static void chooseToEat(Hero floo){
		if (floo.tFoodLevel>0) {
			floo.eatFood(1);
			floo.getFoodLevel();
			floo.getAmountEaten();
			if (floo.tHealth<100) {
				floo.increaseHealth(5);
			}
			if (floo.satisfiesDailyFood()) {
				System.out.println("You have satisfied your daily food intake requirement.");
			}
			floo.getHealth();
		}
		else {
			System.out.println("You spend two hours trying to find anything among your supplies to eat, but unfortunately, there is nothing. Tough luck.");
		}
	}

	public static void chooseToSleep(Hero floo){
		if(floo.tHealth<100) {
			floo.increaseHealth(10);
		}
		else{}
		floo.getHealth();
	}

	public static void userContinue(){
		Scanner user_input = new Scanner(System.in);
		System.out.println("\n\t\t\t   Press enter to continue.\n");
		user_input.nextLine();
	}

	public static void chooseToFight(Hero floo, int enemyStrength){
		if (floo.tStrength>=enemyStrength) {
			System.out.println("You\'re tired, but you win the fight! You give yourself a pat on the back. The fight has also improved your skills.");
			if (floo.tMorale<100) {
				floo.increaseMorale(10);
			}
			floo.decreaseHealth(5);
			floo.getHealth();
			if (floo.checkIfDead()) {
				System.out.println("\n\t\t\t\tGAME OVER!");
				return;
			}
			floo.getMorale();
			floo.increaseSkills(2);
			floo.getSkills();
		}
		else {
			System.out.println("You don\'t have enough strength to beat this opponent. You lose the fight.");
			floo.decreaseHealth(25);
			floo.getHealth();
			if (floo.checkIfDead()) {
				System.out.println("\n\t\t\t\tGAME OVER!");
				return;
			}
			floo.decreaseMorale(25);
			floo.getMorale();
		}
	}

	public static void chooseToHide(Hero floo) {
		System.out.println("You feel ashamed to sit in the bushes as the opposition passes by. You are supposed to be a brave knight, dammit.");
		floo.decreaseMorale(15);
		floo.getMorale();
	}

	public static void finalBattle(Hero floo) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("\nYou have arrived at Floodlewarts in time for your showdown with Lord Floodemort. You have a few precious moments to prepare yourself for your battle. Press 1 to stuff yourself with the rest of your food. Press 2 to take a power nap. Press 3 to sneak to the castle library and learn battle tactics.");
		int userChoice = user_input.nextInt();
		if (userChoice==1) {
			while (floo.tFoodLevel>0) {
				floo.eatFood(1);
				if (floo.tHealth<100) {
					floo.increaseHealth(5);
				}
			}
			floo.getFoodLevel();
			floo.getAmountEaten();
			floo.getHealth();
		}
		if (userChoice==2) {
			chooseToSleep(floo);

		}
		if (userChoice==3) { 
			floo.increaseSkills(4);
			floo.getSkills();
		}
		int battleAbility = ((4*floo.tSkills) + floo.tHealth + floo.tPower)/3;
		System.out.println("It\'s now or never. You must face Lord Floodemort.");
		userContinue();
		if (battleAbility>80) {
			System.out.println("The skills you gained on your journey and all your hard work have paid off. You defeat Lord Floodemort and bring victory to the entire kingdom of Floodlewarts.");
			System.out.println("\n\t\t\t\tYOU WIN!!!");
			return;
		}
		else{
			System.out.println("Lord Floodemort cackles.\"Really?\" he says. \"You thought you could defeat me?\" ");
			System.out.println("You lose the fight. Lord Floodemort is too powerful. Oh well, at least you tried.");
			System.out.println("\n\t\t\t\tGAME OVER!");
			return;
		}
	}

	public static void standardScenario(Hero floo){
		Scanner user_input = new Scanner(System.in);
		int userChoice = user_input.nextInt();
		if (userChoice==1) {
			chooseToTravel(floo);
		}
		if (userChoice==2) {
			chooseToCollectFood(floo);
		}
		if (userChoice==3) {
			chooseToEat(floo);
		}
		if (userChoice==4) {
			chooseToSleep(floo);
		}
	}

	public static void checkIfDead(Hero floo) {
		if (floo.checkIfDead()) {
			System.out.println("\n\t\t\t\tGAME OVER!");
			System.exit(0);
		}
	}

	public static void endOfDay(Hero floo) {
		if (floo.satisfiesDailyFood()) {
			System.out.println("You satisfied your daily food requirement.");
		}
		else {
			System.out.println("You did not satisfy your daily food intake requirement.");
			floo.decreaseHealth(10);
			floo.getHealth();
		}
		checkIfDead(floo);
		if (floo.heroIsDepressed()) {
			System.out.println("You're getting discouraged, and it\'s affecting your health.");
			floo.decreaseHealth(10);
			floo.getHealth();
		}
		checkIfDead(floo);
		userContinue();
	}
 }

 //use riddles as problems
 //fights decrease health, but if you win, they increase power. power helps you open artifacts that allow you to level up
 //if they reach the end of the game without dying they win
 // if health = 0 they die
 //health increases when you sleep or eat
 //health decreases in fights or when you do not eat or sleep for a day

 //health starts at 100
 //floodemort has taken over the city, you must get there in time to defeat him
 //fights with floodemort minions along the way
 //if you choose to fight, lose health but gain power
 //winning fight depends on strength = health + power
 //if you choose to hide, health stays up but won't have enough power to defeat stronger minions
 //there's only 5 days to get to the city before floodemort destroys everything
 //if you run out of time, game over; if health = 0, game over
 //amount of strength needed for each fight increasess