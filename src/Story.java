import java.io.IOException;
import java.util.Scanner;
public class Story {
	static Scanner in = new Scanner (System.in);
	public static void main(String[] args) throws IOException {
		
		/**
		 * This is a game called The Search for Karl. Although the goal is to follow your heart, you are encouraged to track down your friend Karl.
		 */
		// TODO Auto-generated method stub
		Child child=new Child (15, 8, 7, 6, 0, 1);//This will act as one of the possible playable characters
		//                     hp,friend,attack,heal,level,limit
		Warrior warrior=new Warrior (15, 6, 8, 6, 0, 1, 1);//This will act as one of the possible playable characters
		//                           hp,friend,attack,heal,level,TLimit,RLimit
		int x=0;//this int will be used throughout the game when choices are offered to the player
		int i=0;//This is used for loops throughout the game
		System.out.println("-----------------Welcome to The Search for Karl-----------------\nChoose your playable character\n\nPress\n1)Warrior: Not so great at communication but he has a big axe and a sword (stronger attack score but only one chance to talk things out)\n2)Child: A real go getter but not that tough, he's great at talking things out though (Weaker in battle but can try to work things out verbally an unlimited number of times per fight)");
		int playableCharacter=in.nextInt();//This variable is the players choice for which character they would like to use, I didn't use X for this I need the choice to be saved 
		//this is to find out which character would like to be
		if(playableCharacter==2) {
			System.out.println("You have chosen Child!\nPress Enter");
			System.in.read();
		}
		if(playableCharacter==1) {
			System.out.println("You have chosen Warrior!\nPress Enter");
			System.in.read();
		}
		System.out.println("\n\nNote: Each charcter has a special move in combat that can only be used once per fight");
		System.in.read();
		//This Loop is for a gag. It repeats until the player decides to leave the house or until the player decides to go back inside after a few loops
		while(x!=1) {
			//Player choice (Go back inside)
			if(x==3) {
				WIN();//Wins Game
			}
			System.out.println("\n----------------------------------\nYou sit on the front steps of your humble home, waiting for your friend Karl\nKarl seems to be taking longer than normal to meet with you\n\nSelect\n1)Go out in search of Karl\n2)Wait for Karl just like always");
			x=in.nextInt();
			//has the player waited long enough to go back inside
			if((x==2)&&(i>=6)) {
				System.out.println("3)Go back inside, Karl's clearly busy today");
				x=in.nextInt();
			}
			//Player choice (Keep waiting)
			else if(x==2) {
				i++;
			}
			else {
				break;
			}
		}
		System.out.println("\n----------------------------------\nYou head off into the woods to Karls house\nAs you journey you see a group of children\nYou move toward them to ask if they have seen Karl\n\nYou see a goon near them\nYou charge the goon\nGoon-\"Whoa there buddy\nIm no ordinary Goon, \nI've taken to watching over these kids and given up my gooning\"\nJust then one of the children lights a fire\nGoon-\"Jimmy! What did I say about playing with fire\"\nHe turns to you\nGoon-\"Could you hand me that bucket of water?\"\n\nSelect\n1)Grab a bucket and throw it's contents on the children\n2)Walk away");
		x=in.nextInt();
		//Player choice (Pour Gasoline on the children
		if(x==1) {
			System.out.println("\n----------------------------------\nThe children burst into flame\nThey scream run around, their faces express true horror and fear\nMy god the horror...the horror\nGoon-\"You Fool... that was my gasoline bucket\nThis is the second most tragic thing to happen in my life\nThis is your fault\"\nThe Goon turns to fight");
			System.in.read();
			//Which character did the player choose
			if(playableCharacter==1) {
				goonFight(20, 4, 1, warrior);//A fight with a Goon
			}
			if(playableCharacter==2) {
				goonFight(20, 4, 1, child);//A fight with a Goon
			}
			endFight(warrior, child, 4);//each time this method is used is to reset the players stats for the next fight, the Hp value given is based on my best play throughs of the game to reset the player health to 40
			System.out.println("\n----------------------------------\nExcellent, you made quick work of that Goon. Time to get Karl");
			System.in.read();
			
		}
		else {
			System.out.println("\n----------------------------------\nYou leave to find the bucket of water, You quickly grab it and splash the flames\nGreat work...Who knows what would have happened if you had grabbed that other bucket");
		}
		System.out.println("You follow a path through the woods in hopes that it will lead you to Karl\nAs you walk you get the sense that you are being followed\nYou turn and spot a ghost following you.\nGhosts are spooky as heck and it's flying right at you");
		System.in.read();
		//Which Character did the player choose
		if(playableCharacter==1) {
			ghostFight(20, 6, 3, warrior);//A fight with a Ghost
		}
		if(playableCharacter==2) {
			ghostFight(20, 6, 3, child);//A fight with a Ghost
		}
		System.in.read();
		endFight(warrior, child,6);
		System.out.println("\n----------------------------------\nNarrator-\"Listen buddy, ghosts and goons are the least of your worries out here.\"\nHe's right. There are all kinds of troublesome creatures out in these woods\nJust then a troll waddles out from a bush\nTrolls are such butts\n");
		System.in.read();
		//Which Character did the player choose
		if(playableCharacter==1) {
			trollFight(30, 8, 4, warrior);//A fight with a Troll
		}
		if(playableCharacter==2) {
			trollFight(30, 8, 4, child);//A fight with a Troll
		}
		System.in.read();
		endFight(warrior, child,8);
		System.out.println("\n----------------------------------\nNow that your finished with the troll you return to your quest\nyou look back to your path and see Ashish Gauba walking toward you\nCrap\nYou've heard of this guy...he is unbearable all he does is talk and talk");
		Ashish();//This method is used as a gag for the sake of belittling Ashish (I have his approval)
		System.out.println("Gald you are done with that loser");
		System.in.read();
		System.out.println("\n----------------------------------\nYou continue down the wooded path that you beleive will lead you to Karls house\n Of course you have no way of knowing that for sure\nAs you walk you see a hut\nPerhaps it is Karls house\nyou knock on the door of the hut but just as you do you hear a loud craking noise behind you\nYou turn and spot an elderly man wearing a tall purple hat\n\nA Wizard\n\nWizards are just the worst");
		System.in.read();
		//Which Character did the player choose
		if(playableCharacter==1) {
			wizardFight(25, 5, 3, warrior);//A fight with a Wizard
		}
		if(playableCharacter==2) {
			wizardFight(25, 5, 3, child);//A fight with a Wizard
		}
		endFight(warrior, child,3);
		System.in.read();
		System.out.println("\n----------------------------------\nTrying to forget that horrible encounter with the wizard you return to your quest\nAs you follow the dark path you come across a fork in the road\none path goes left and the other goes right\n\nYou decide to go left\n\nSelect\n1)Go Left\n2)Go Right");
		x=in.nextInt();
		if(x==2) {
			LeftRight();//Another joke method
		}
		System.out.println("\n----------------------------------\nYou go left\n\n\nAs you walk you come to a large cliff. The cliff appears to have a ladder attached to it");
		System.in.read();
		System.out.println("\n\nSelect\n1)Climb the ladder\n2)Ignore the ladder");
		x=in.nextInt();
		Ladder(x);//This is a method that is also used for a joke.
		System.out.println("\n----------------------------------\nYou walk away from a ladder and into a feild\nYou stumble over something\nA goon sleeping peacfully in a feild");
		if(playableCharacter==1)
			sleepFight(6,100,4,warrior);
		else
			sleepFight(6,100,4,child);
		System.out.println("\n----------------------------------\nYou continue down the forest path but then you remember the hut from earlier\nYou never checked if karl was in there!\nYou rush back and find that it is burning \nYou see a charred and disfigured boy laughing at the flames\nupon further inspection you realize it's Jimmy\nOne of the boys living with that Goon");
		System.in.read();
		System.out.println("\n\n\nJimmy-\"O hey there buddy\"\nHe has clearly lost his mind\nHe gets up to fight you");
		//Which Character did the player choose
		if(playableCharacter==1) {
			goonFight(40, 6, 3, warrior);//A fight with a Goon
		}
		if(playableCharacter==2) {
			goonFight(40, 6, 3, child);//A fight with a Goon
		}
		System.in.read();
		endFight(warrior, child,6);
		System.out.println("\n----------------------------------\nYou search through the wreckage of the hut for Karl\nYou find a skeleton but it couldn't possibly be karl's\nHis skull is in one peice");
		System.in.read();
		System.out.println("\n\nYou drop the skeleton and walk away from the runied hut\nKarls house must be further down the path");
		System.in.read();
		System.out.println("As you make your way back to the path when a goon jumps out of the ashes of the hut\n\nUltra Pirate-\"Yar! I'm the Ultra Pirate\"\nUpon further inspection you find that he is wearing 2 eyepatchs\nUltra Pirate-\"Give me all yerr loot!\"");
		System.in.read();
	//Which Character did the player choose
		if(playableCharacter==1) {
			pirateFight(18, 3, 3, warrior);//A fight with a pirate
		}
		if(playableCharacter==2) {
			pirateFight(18, 3, 3, child);//A fight with a pirate
		}
		System.out.println("\n----------------------------------\nO well back to the path I suppose");
		System.in.read();
		System.out.println("You pass that ladder from before...but we've already been over that.");
		System.in.read();
		System.out.println("You see a witch doing some evil work in a clearing of the woods.\nShe must know where karl is\nYou-\"Hey...Where's Karl\"\nWitch-\"Huh\"\n\nThe witch wants to fight");
		//Which Character did the player choose
		if(playableCharacter==1) {
			witchFight(30, 6, 3, warrior);//A fight with a Witch
		}
		if(playableCharacter==2) {
			witchFight(30, 6, 3, child);//A fight with a Witch
		}
		endFight(warrior, child, 6);
		System.in.read();
		System.out.println("\n----------------------------------\nDarn! now that the witch is gone you can't ask about Karl\n");
		System.in.read();
		System.out.println("I suppose it's time for you to go home\n Karls probably just busy today\nYou make your way home");
		System.in.read();
		System.out.println("\n-----------------a few hours later-----------------\nYou return to your humble home but when get inside there is an indruder\nKarl-\"Hey bud, Where have you been?\"\nSomeone has broken into your house!\nYou better kill him\n");
		//Which Character did the player choose
		if(playableCharacter==1) {
			karlFight(30, 6, 3, warrior);//A fight with Karl
		}
		if(playableCharacter==2) {
			karlFight(30, 6, 3, child);//A fight with Karl
		}
		endFight(warrior, child,2);
		System.out.println("\n----------------------------------\nOk now that thats done with you can relax.\nIt's a shame you couldn't find karl today but your sure you will find him tomorrow\n\nJust like everyday");
		System.in.read();
		WIN();//Wins game
	}
	/**
	 * This Method is employed for situations where the player wins the game
	 */
	public static void WIN() {
			System.out.println("\n\n\nYOU WIN");
			System.exit(0);
	}
	/**
	 * This Method is used for if the player loses the game
	 */
	public static void LOSS() {
			System.out.println("\n\n\nYOU LOSE");
			System.exit(0);
	}
	/**
	 * This Method is to run a fight with a Goon NPC
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param p
	 * @throws IOException
	 */
	public static void goonFight(int hp, int attack, int heal, Being p) throws IOException {
		int x=0;//Player Choice
		int eMove=0;//Enemy Choice
		Goon goon= new Goon(hp,attack,heal);//The goon that will be fought
		//Loops while the fight is happening
		while(true) {
			System.out.println("\n\nYour Stats: HP "+p.getHp()+", Attack "+p.getAttack()+", Heal ability "+p.getHeal()+"\nEnemy Stats: HP "+goon.getHp()+", Attack "+goon.getAttack()+", Heal ability "+goon.getHeal()+"\n\nSelect\n1)Attack\n2)Heal your wounds\n3)Special Move\n4)Try to talk things out");
			x=in.nextInt();
			//Player choice
			if(x==1) {
				p.Strike(goon);//Hits the Goon
			}
			//Player choice
			else if(x==2){
				p.Mend();//Heals the player
			}
			//Player choice
			else if(x==3) {
				p.specialMove(goon);//Use special move on Goon
			}
			//Player choice
			else if(x==4) {
				if(p.Talk(goon)) {//Talks with goon to try and work things out
					System.in.read();
					break;
				}
			}
			//If goon dies
			if(goon.getHp()<=0) {
				goon.loss();//Goon loss script
				System.in.read();
				break;
			}
			eMove=(int)(Math.random()*2+1);//Enemies choice
			//Goon chooses to strike
			if(eMove==1) {
				goon.Strike(p);
			}
			//Goon chooses to heal
			else {
				goon.Mend();
			}
			//Player lost all health
			if(p.getHp()<=0) {
				LOSS();//loss screen
				System.in.read();
				break;
			}
			
		}
		
	}
	/**
	 * This method runs a fight with a Ghost NPC
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param p
	 * @throws IOException
	 */
	public static void ghostFight(int hp, int attack, int heal, Being p) throws IOException {
		int x=0;//Player choice
		int eMove=0;//Enemy Choice
	    Ghost ghost= new Ghost(hp,attack,heal);//creates the ghost that is to be fought
	  //Runs until fight ends
		while(true) {
			System.out.println("\n\nYour Stats: HP "+p.getHp()+", Attack "+p.getAttack()+", Heal ability "+p.getHeal()+"\nEnemy Stats: HP "+ghost.getHp()+", Attack "+ghost.getAttack()+", Heal ability "+ghost.getHeal()+"\n\nSelect\n1)Attack\n2)Heal your wounds\n3)Special Move\n4)Try to talk things out");
			x=in.nextInt();
			//did the player choose to strike
			if(x==1) {
				p.Strike(ghost);//strikes ghost
			}
			//did the player choose to mend wounds
			else if(x==2){
				p.Mend();//mends wounds
			}
			//did the player choose to use a special move
			else if(x==3) {
				p.specialMove(ghost);//uses special moves
			}
			//Did the player choose to Talk to the ghost
			else if(x==4) {
				if(p.Talk(ghost)) {//talks to ghost
					System.in.read();
					break;
				}
			}
			//did the ghost die
			if(ghost.getHp()<=0) {
				ghost.loss();//ghost lost script
				System.in.read();
				break;
			}
			eMove=(int)(Math.random()*3+1);//Ghosts choice of move
			//Did the ghost choose to attack
			if(eMove==1) {
				ghost.castDamage(p);//attack
			}
			//Did the ghost choose to use damage heal
			if(eMove==2) {
				ghost.damageHeal(p);//damage heal
			}
			//did the ghost choose to heal itself
			else {
				ghost.castHeal();//heal
			}
			//did the player die
			if(p.getHp()<=0) {
				LOSS();//loss screen
			}
			
		}
	}
	/**
	 * This method is a fight between the player and a Troll NPC
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param p
	 * @throws IOException
	 */
	public static void trollFight(int hp, int attack, int heal, Being p) throws IOException {
		int x=0;//Player choice
		int eMove=0;//Enemy choice
		Troll troll= new Troll(hp,attack,heal);//Creates troll that is to be fought
		//Runs until fight ends
		while(true) {
			System.out.println("\n\nYour Stats: HP "+p.getHp()+", Attack "+p.getAttack()+", Heal ability "+p.getHeal()+"\nEnemy Stats: HP "+troll.getHp()+", Attack "+troll.getAttack()+", Heal ability "+troll.getHeal()+"\n\nSelect\n1)Attack\n2)Heal your wounds\n3)Special Move\n4)Try to talk things out");
			x=in.nextInt();
			//Did the player choose strike
			if(x==1) {
				p.Strike(troll);//strike troll
			}
			//did the player choose mend
			else if(x==2){
				p.Mend();//Mend 
			}
			//did the player choose special move
			else if(x==3) {
				p.specialMove(troll);//Special move
			}
			//did the player choose to Talk it out
			else if(x==4) {
				//did talking it out work
				if(p.Talk(troll)) {//talk it out
					System.in.read();
					break;
				}
			}
			//did troll die
			if(troll.getHp()<=0) {
				troll.loss();//troll death script
				System.in.read();
				break;
			}
			eMove=(int)(Math.random()*2+1);//Troll move choice
			//did troll choose to strike
			if(eMove==1) {
				troll.Strike(p);//troll strike
			}
			//did troll choose to mend
			else {
				troll.Mend();//Troll Mend
			}
			//did player die
			if(p.getHp()<=0) {
				LOSS();//Death screen
				System.in.read();
				break;
			}
			
		}
	}
	/**
	 * This Method is for a joke where Ashish tells you the script of The Bee Movie unless you kill him (I have Ashish's approval)
	 */
	public static void Ashish() {
		int x=0;//player choice
		System.out.println("\n----------------------------------\nAshish-\"Hello Stranger! I'm Ashish\"\n\nSelect\n1)Try to get around him\n2)Kill him");
		x=in.nextInt();
		//Did player choose to try and avoid Ashish
		if(x==1) {
			//loops until Ashish is done talking or he is killed
			for(int i=0;i<5;i++) {
				//First script section
				if(i==0) {
					System.out.println("he says:\nAccording to all known laws\n" + 
							"of aviation,\n" + 
							"\n" + 
							"  \n" + 
							"there is no way a bee\n" + 
							"should be able to fly.\n" + 
							"\n" + 
							"  \n" + 
							"Its wings are too small to get\n" + 
							"its fat little body off the ground.\n" + 
							"\n" + 
							"  \n" + 
							"The bee, of course, flies anyway\n" + 
							"\n" + 
							"  \n" + 
							"because bees don't care\n" + 
							"what humans think is impossible.");
				}
				//second script section
				if(i==1) {
					System.out.println("Yellow, black. Yellow, black.\n" + 
							"Yellow, black. Yellow, black.\n" + 
							"\n" + 
							"  \n" + 
							"Ooh, black and yellow!\n" + 
							"Let's shake it up a little.\n" + 
							"\n" + 
							"  \n" + 
							"Barry! Breakfast is ready!\n" + 
							"\n" + 
							"  \n" + 
							"Ooming!\n" + 
							"\n" + 
							"  \n" + 
							"Hang on a second.\n" + 
							"\n" + 
							"  \n" + 
							"Hello?\n" + 
							"\n" + 
							"  \n" + 
							"- Barry?\n" + 
							"- Adam?\n" + 
							"\n" + 
							"  \n" + 
							"- Oan you believe this is happening?\n" + 
							"- I can't. I'll pick you up.\n" + 
							"\n" + 
							"  \n" + 
							"Looking sharp.");
				}
				//third script section
				if(i==2) {
					System.out.println("Use the stairs. Your father\n" + 
							"paid good money for those.\n" + 
							"\n" + 
							"  \n" + 
							"Sorry. I'm excited.\n" + 
							"\n" + 
							"  \n" + 
							"Here's the graduate.\n" + 
							"We're very proud of you, son.\n" + 
							"\n" + 
							"  \n" + 
							"A perfect report card, all B's.\n" + 
							"\n" + 
							"  \n" + 
							"Very proud.\n" + 
							"\n" + 
							"  \n" + 
							"Ma! I got a thing going here.\n" + 
							"\n" + 
							"  \n" + 
							"- You got lint on your fuzz.\n" + 
							"- Ow! That's me!\n" + 
							"\n" + 
							"  \n" + 
							"- Wave to us! We'll be in row 118,000.\n" + 
							"- Bye!\n" + 
							"\n" + 
							"  \n" + 
							"Barry, I told you,\n" + 
							"stop flying in the house!");
				}
				//fourth script section
				if(i==3) {
					System.out.println("Hey, Adam.\n" + 
							"- Hey, Barry.\n" + 
							"\n" + 
							"  \n" + 
							"- Is that fuzz gel?\n" + 
							"- A little. Special day, graduation.\n" + 
							"\n" + 
							"  \n" + 
							"Never thought I'd make it.\n" + 
							"\n" + 
							"  \n" + 
							"Three days grade school,\n" + 
							"three days high school.\n" + 
							"\n" + 
							"  \n" + 
							"Those were awkward.\n" + 
							"\n" + 
							"  \n" + 
							"Three days college. I'm glad I took\n" + 
							"a day and hitchhiked around the hive.\n" + 
							"\n" + 
							"  \n" + 
							"You did come back different.\n" + 
							"\n" + 
							"  \n" + 
							"- Hi, Barry.\n" + 
							"- Artie, growing a mustache? Looks good.\n" + 
							"\n" + 
							"  \n" + 
							"- Hear about Frankie?\n" + 
							"- Yeah.\n" + 
							"\n" + 
							"  \n" + 
							"- You going to the funeral?\n" + 
							"- No, I'm not going.\n" + 
							"\n" + 
							"  \n" + 
							"Everybody knows,\n" + 
							"sting someone, you die.\n" + 
							"\n" + 
							"  \n" + 
							"Don't waste it on a squirrel.\n" + 
							"Such a hothead.\n" + 
							"\n" + 
							"  \n" + 
							"I guess he could have\n" + 
							"just gotten out of the way.\n" + 
							"\n" + 
							"  \n" + 
							"I love this incorporating\n" + 
							"an amusement park into our day.\n" + 
							"\n" + 
							"  \n" + 
							"That's why we don't need vacations.");
				}
				//final script section
				if(i==4) {
					System.out.println("Boy, quite a bit of pomp...\n" + 
							"under the circumstances.\n" + 
							"\n" + 
							"  \n" + 
							"- Well, Adam, today we are men.\n" + 
							"- We are!\n" + 
							"\n" + 
							"  \n" + 
							"- Bee-men.\n" + 
							"- Amen!\n" + 
							"\n" + 
							"  \n" + 
							"Hallelujah!\n" + 
							"\n" + 
							"  \n" + 
							"Students, faculty, distinguished bees,\n" + 
							"\n" + 
							"  \n" + 
							"please welcome Dean Buzzwell.\n" + 
							"\n" + 
							"  \n" + 
							"Welcome, New Hive Oity\n" + 
							"graduating class of...\n" + 
							"\n" + 
							"  \n" + 
							"...9:15.\n" + 
							"\n" + 
							"  \n" + 
							"That concludes our ceremonies.\n" + 
							"\n" + 
							"  \n" + 
							"And begins your career\n" + 
							"at Honex Industries!\n" + 
							"\n" + 
							"  \n" + 
							"Will we pick ourjob today?\n" + 
							"\n" + 
							"  \n" + 
							"I heard it's just orientation.\n" + 
							"\n" + 
							"  \n" + 
							"Heads up! Here we go.\n" + 
							"\n" + 
							"  \n" + 
							"Keep your hands and antennas\n" + 
							"inside the tram at all times.\n" + 
							"\n" + 
							"  \n" + 
							"- Wonder what it'll be like?\n" + 
							"- A little scary.\n" + 
							"\n" + 
							"  \n" + 
							"Welcome to Honex,\n" + 
							"a division of Honesco\n" + 
							"\n" + 
							"  \n" + 
							"and a part of the Hexagon Group.\n" + 
							"\n" + 
							"  \n" + 
							"This is it!\n" + 
							"\n" + 
							"  \n" + 
							"Wow.");
				}
				System.out.println("\n----------------------------------\nPlease make this stop\n\nSelect\n1)Keep Listening\n2)Kill Him");
				x=in.nextInt();
				//was ashish killed
				if(x==2) {
					break;
				}
			}
		}
	}
	/**
	 * This method runs a fight between the player and a Wizard NPC
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param p
	 * @throws IOException
	 */
	public static void wizardFight(int hp, int attack, int heal, Being p) throws IOException {
		int x=0;//player choice
		int eMove=0;//enemy choice
	    Wizard wizard= new Wizard(hp,attack,heal);//creates wizard for fighting
	    //Loops while fight is happening
		while(true) {
			System.out.println("\n\nYour Stats: HP "+p.getHp()+", Attack "+p.getAttack()+", Heal ability "+p.getHeal()+"\nEnemy Stats: HP "+wizard.getHp()+", Attack "+wizard.getAttack()+", Heal ability "+wizard.getHeal()+"\n\nSelect\n1)Attack\n2)Heal your wounds\n3)Special Move\n4)Try to talk things out");
			x=in.nextInt();
			//did player choose strike
			if(x==1) {
				p.Strike(wizard);//strike wizard
			}
			//did player choose mend
			else if(x==2){
				p.Mend();//mend player
			}
			//did player choose special move
			else if(x==3) {
				p.specialMove(wizard);//Special Move
			}
			//Did player choose non-violence
			else if(x==4) {
				if(p.Talk(wizard)) {//talk it out
					System.in.read();
					break;
				}
			}
			//Did wizard die
			if(wizard.getHp()<=0) {
				wizard.loss();//wizard death script
				System.in.read();
				break;
			}
			eMove=(int)(Math.random()*3+1);//wizard move choice
			//did wizard choose to attack
			if(eMove==1) {
				wizard.castDamage(p);//attack
			}
			//did wizard choose damage heal
			if(eMove==2) {
				wizard.damageHeal(p);//damage heal
			}
			//did wizard choose heal
			else {
				wizard.castHeal();//wizard heal
			}
			//did player die
			if(p.getHp()<=0) {
				LOSS();//player death screen
				System.in.read();
				break;
			}
			
		}
	}
	/**
	 * This method resets the players stats at the end of a fight so that the player can keep at it. The player has a set amount of health that they can get back from each fight
	 * @param warrior
	 * @param child
	 * @param hp
	 */
	public static void endFight(Warrior warrior, Child child, int hp) {
		warrior.setHp(warrior.getHp()+hp);//gives warrior his health back
		child.setHp(child.getHp()+hp);//gives child his health back
		warrior.setRLimit(1);//warrior resets special move limit
		warrior.setTLimit(1);//warrior resets talk limit
		child.setLimit(1);//resets child special move limit
		
	}
	/**
	 * Another joke method. It is used to have the player either climb at ladder to nowhere or feel bad that they didn't do it
	 * @param x
	 */
	public static void Ladder(int x) {
		// \n\nSelect\n1)Continue Climbing\n2)Give up and climb back down
		int z=0;//Secondary player choice
		//did the player choose to climb the ladder
		if(x==1) {
			//loops until the player reaches the top of the ladder
			for(int i=0; i<5; i++) {
				//first climbing script
				if(i==0) {
					System.out.println("\n\nYou climb the ladder, Its quite high, looks like the top is above the clouds\n\nSelect\n1)Continue Climbing\n2)Give up and climb back down");
					z=in.nextInt();
				}
				//second climbing script
				if(i==1) {
					System.out.println("\n\nYou climb so high that your affraid to look down. You have never been this high up in your life\n\nSelect\n1)Continue Climbing\n2)Give up and climb back down");
					z=in.nextInt();
				}
				//third climbing script
				if(i==2) {
					System.out.println("\n\nNow your so high up that the atmosphere is to thin for birds to fly, but your not some weak bird\n\nSelect\n1)Continue Climbing\n2)Give up and climb back down");
					z=in.nextInt();
				}
				//fourth climbing script
				if(i==3) {
					System.out.println("\n\nWowiee you are sooo high up this ladder that you are passing the moon. Someone with less determiniation would have sufficated by now but not you\n\nSelect\n1)Continue Climbing\n2)Give up and climb back down");
					z=in.nextInt();
				}
				//fifth climbing script
				if(i==4) {
					System.out.println("\n\nHoly Moly! You can't even see the planet you started off on anymore!\n\nSelect\n1)Continue Climbing\n2)Give up and climb back down");
					z=in.nextInt();
				}
				//did the player ever chooses to climb back down
				if(z==2) {
					System.out.println("\n\nWhoa there buddy! This is a really important part of the game\nAnd you have already put in so much effort\nYou better keep climing\n\nSelect\n1)OK");
					z=in.nextInt();
				}
			}
			System.out.println("\n-----------------------------------\nGreat work you made it to the top! You look around and see a peice of paper on the gound.\nYou pick it up and read it\nPaper-\"You have waisted your time\" \n\nSelect\n1)Climb back down\n2)Jump (warning you will die)");
			x=in.nextInt();
			//did the player choose to jump
			if(x==2) {
				LOSS();
			}
			//loops until player reaches bottom of ladder
			for(int i=0; i<5;i++) {
				//is player at bottom
				if(i==4) {
					System.out.println("\n\nHoly Moly! You can't even see the planet you started off on anymore!\n\nSelect\n1)Continue Climbing\n2)Give up and climb back down");
				}
				else
					System.out.println("\n\nYou climb down the ladder");
				System.out.println("\n\nSelect\n1)Keep climbing down the ladder");
				x=in.nextInt();
			}
			System.out.println("\n\nGreat work you have made it to the bottom of the ladder\n\n");
		}
		else
			System.out.println("OK fine... It would have been really cool to check out what was on top of that ladder\nBut you have clearly made up your mind\n\nMOVING ON\n\n");
	}
	/**
	 * This method is for a fight with a witch
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param p
	 * @throws IOException
	 */
	public static void witchFight(int hp, int attack, int heal, Being p) throws IOException {
		int x=0;//player choice
		int eMove=0;//enemy choice
	    Which witch= new Which(hp,attack,heal);//creates witch to fight
	    //loops until fight ends
		while(true) {
			System.out.println("\n\nYour Stats: HP "+p.getHp()+", Attack "+p.getAttack()+", Heal ability "+p.getHeal()+"\nEnemy Stats: HP "+witch.getHp()+", Attack "+witch.getAttack()+", Heal ability "+witch.getHeal()+"\n\nSelect\n1)Attack\n2)Heal your wounds\n3)Special Move\n4)Try to talk things out");
			x=in.nextInt();
			//did player choose to strike
			if(x==1) {
				p.Strike(witch);//strike witch
			}
			//did player choose to mend 
			else if(x==2){
				p.Mend();//mend player
			}
			//did player choose special move
			else if(x==3) {
				p.specialMove(witch);//special move
			}
			//did the player choose talk
			else if(x==4) {
				if(p.Talk(witch)) {//talk
					System.in.read();
					break;
				}
			}
			//is witch dead
			if(witch.getHp()<=0) {
				witch.loss();
				System.in.read();
				break;
			}
			eMove=(int)(Math.random()*3+1);//enemy choice
			//did witch choose to attack
			if(eMove==1) {
				witch.castDamage(p);//attack
			}
			//did witch choose damage heal
			if(eMove==2) {
				witch.damageHeal(p);//damage heal
			}
			//did witch choose heal
			else {
				witch.castHeal();//heal
			}
			//did player die
			if(p.getHp()<=0) {
				LOSS();//loss screen
				System.in.read();
				break;
			}
			
		}
	}
	/**
	 * This method is a fight with Karl. The player has confused him for a goon and a robber
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param p
	 * @throws IOException
	 */
	public static void karlFight(int hp, int attack, int heal, Being p) throws IOException {
		int x=0;//player choice
		int eMove=0;//Karl Move
		Goon goon= new Goon(hp,attack,heal);//creates karl/goon NPC
		//loops until Karl is dead
		while(true) {
			System.out.println("\n\nYour Stats: HP "+p.getHp()+", Attack "+p.getAttack()+", Heal ability "+p.getHeal()+"\nKarl Stats: HP "+goon.getHp()+", Attack "+goon.getAttack()+", Heal ability "+goon.getHeal()+"\n\nSelect\n1)Attack\n2)Heal your wounds\n3)Special Move");
			x=in.nextInt();
			//did player choose to strike
			if(x==1) {
				p.Strike(goon);//strike
			}
			//did player choose to mend
			else if(x==2){
				p.Mend();//mend
			}
			//did player choose special move
			else if(x==3) {
				p.specialMove(goon);//special move
			}
			//did Karl die
			if(goon.getHp()<=0) {
				System.out.println("Karl-\"WHY?\"\nThe goon bleeds out slowly");
				System.in.read();
				break;
			}
			eMove=(int)(Math.random()*3+1);//karls choice of words
			//option 1
			if(eMove==1) {
				System.out.println("Karl-\"Please stop\"\nThe goon begs for his life");
			}
			//option 2
			else if(eMove==2){
				System.out.println("Karl-\"O it hurts\"\nYou sure are teaching him a lesson");
			}
			//option 3
			else {
				System.out.println("You-\"HA! You are weak\"\nKarl-\"WHY?\"");
			}
			
		}
		
	}
	/**
	 * This is a joke method about turning left or right\the game really wants you to turn left
	 * @throws IOException
	 */
	public static void LeftRight() throws IOException {
		int x=0;
		for(int i=0;i<3;i++) {//loops a couple times for comedic effect
			System.out.println("\nYou decide to go left\n\nSelect\n1)Go Left\n2)Go Right");
			x=in.nextInt();
			if(x==1);
				break;
		}
		//all of these if statements are to check if the player has finally decided to go left
		if(x==2) {
			System.out.println("\n----------------------------------\nListen buddy\nThere's nothing over to the right. Just go left\n\nSelect\n1)Go Left\n2)Go Right");
			x=in.nextInt();
			if(x==2){
				System.out.println("Are we gonna have a problem here?\n\nI very clearly said that you go left\nI put a lot of work in to making a good game and you are runing it\n\nSelect\n1)Go Left\n2)Go Right");
				x=in.nextInt();
					if(x==2) {
						System.out.println("Is this a joke to you?\n\nSelect\n1)Go Left!\n2)Go Right");
						x=in.nextInt();
						if(x==2) {
							System.out.println("You will be going left\n\nSelect\n1)LEFT\n2)right");
							x=in.nextInt();
							if(x==2) {
								System.out.println("Who do you think you are?\n1)left\n2)right");
								x=in.nextInt();
								if(x==2) {
									System.out.println("If you say right one more time I am talking away all your choices and you are just going to sit there like an idiot!\n1)left\n2)right");
									x=in.nextInt();
									if(x==2) {
										System.out.println("OK fine!\n\nSelect");
										System.in.read();
										System.out.println("\n\nAre you gonna work with me here and go Left?\n\nSelect\n1)Left\n2)Right");
										x=in.nextInt();
										if(x==2){
											System.out.println("I hate you\n\nSelect\n1)Left\n2)right");
											x=in.nextInt();
											if(x==2) {
												System.out.println("You are unblelivable\n\nSelect\n1)You are going left");
												x=in.nextInt();
											}
										}
									}
								}
							}
						}
					}
			}
		}
	}
	/**
	 * This is for a goofy little fight with a little fight with a sleeping goon
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param p
	 * @throws IOException
	 */
	public static void sleepFight(int hp, int attack, int heal, Being p) throws IOException {
		int x=0;
		Goon goon=new Goon(hp,attack,heal);//this is the goon
		while(goon.getHp()>0) {
		System.out.println("\n\nYour Stats: HP "+p.getHp()+", Attack "+p.getAttack()+", Heal ability "+p.getHeal()+"\nEnemy Stats: HP "+goon.getHp()+", Attack "+goon.getAttack()+", Heal ability "+goon.getHeal()+"\n\nSelect\n1)Attack\n2)Heal your wounds\n3)Special Move\n4)Try to talk things out");
		x=in.nextInt();
		//did player choose strike
		if(x==1) {
			p.Strike(goon);//strike goon
		}
		//did player choose mend
		else if(x==2){
			p.Mend();//mend player
		}
		//did player choose special move
		else if(x==3) {
			p.specialMove(goon);//Special Move
		}
		//Did player choose non-violence
		else if(x==4) {
			System.out.println("You can't talk to him\nYou'll wake him up");
			}
		}
		System.out.println("The goon wakes up as he dies\n\nGoon-\"What did I do wrong?\"");
		System.in.read();
	}
	/**
	 * This is for a goofy fight with a pirate
	 * @param hp
	 * @param attack
	 * @param heal
	 * @param p
	 * @throws IOException
	 */
	public static void pirateFight(int hp, int attack, int heal, Being p) throws IOException {
		int i=0;
		int x=0;
		Goon goon=new Goon(hp,attack,heal);//this is the pirate
		while(goon.getHp()>0) {//loops until pirate dies because you can't in this fight
		System.out.println("\n\nYour Stats: HP "+p.getHp()+", Attack "+p.getAttack()+", Heal ability "+p.getHeal()+"\nEnemy Stats: HP "+goon.getHp()+", Attack "+goon.getAttack()+", Heal ability "+goon.getHeal()+"\n\nSelect\n1)Attack\n2)Heal your wounds\n3)Special Move\n4)Try to talk things out");
		x=in.nextInt();
		//did player choose strike
		if(x==1) {
			p.Strike(goon);//strike goon
			i++;
		}
		//did player choose mend
		else if(x==2){
			p.Mend();//mend player
		}
		//did player choose special move
		else if(x==3) {
			p.specialMove(goon);//Special Move
			i++;
		}
		//Did player choose non-violence
		else if(x==4) {
			System.out.println("Ultra Pirate-\"I ain't interested in yerr land lubber talk\"\nHe is disinterested with your land lubber talk");
			}
		if(i==1)
			System.out.println("\nHe takes a swing at nothing\nUltra Pirate-\"Where are you ya scurvy dog\"");
		if((i==2)&&(goon.getHp()>0))
			System.out.println("\nUltra Pirate-\"Avast Yee Land Lubber\"");
	}
		System.out.println("You do one final dodge of the pirates attacks as he stumbles and breaks his neck");
		System.in.read();
}
}


