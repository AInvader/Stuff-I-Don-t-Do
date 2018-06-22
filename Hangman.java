import java.util.*;
public class Hangman {
static StringBuilder guesses = new StringBuilder();  
static int remaining = 6;							 
static Random rnd = new Random();			
static boolean overYet = false;
static StringBuilder correct=new StringBuilder();
static String word;							
static String guess;
private static Scanner askguess;
public static String generateWord(){		
	String word;
	String[] wordlist = {"awkward","bagpipes","banjo","croquet","crypt","dwarves","fervid","fishhook","fjord","gazebo","gypsy","haphazard","hyphen","ivory","jazzy","jiffy","jinx","jukebox","kayak","kiosk","klutz","memento","mystify","numbskull","oxygen","pajama","phlegm","pixel","polka","quad","quip","rhythymic","rogue","sphinx","squawk","swivel","today","twelfth","waxy","yacht","zealous","zigzag","zippy","zombie"};
	word = wordlist[rnd.nextInt(wordlist.length)];
	return word;}
public static void showman(){						
	switch (remaining){
	case 0: 
		System.out.println(" O ");
		System.out.println("-|-");
		System.out.println("/ \\ ");
		System.out.println("GAME OVER!");
		break;
	case 1: 
		System.out.println(" O ");
		System.out.println("-|-");
		System.out.println("/  ");
		break;
	case 2: 
		System.out.println(" O ");
		System.out.println("-|-");
		break;
	case 3: 
		System.out.println(" O ");
		System.out.println("-|");
		break;
	case 4: 
		System.out.println(" O ");
		System.out.println(" |");
		break;
	case 5: 
		System.out.println(" O ");
		break;
	case 6: 
		System.out.println("Looking good!");
		break;
 			
	}
}
	
public static void getGuess(){


	askguess = new Scanner(System.in);
	guess = askguess.nextLine().toLowerCase();
	if (guess.length()>1){ 
		System.out.println("only one at a time please!");
		System.out.println("Please enter ONE letter: ");
		guess = askguess.next();}
		else if (guess.length()== 0){
			System.out.println("I need at least one letter!");
			System.out.println("Please enter a letter: ");
			guess = askguess.next();
	}
	else {System.out.println("your guess is " + guess);}
}
	
public static void checkGuess(){
	if (!word.contains(guess)){
		System.out.println("My word does not have the letter " + guess);
		guesses= guesses.append(guess);
		remaining = remaining - 1;
		showman();
		System.out.println("correct guesses:  " +correct);
		System.out.println("You have guessed: " +guesses);}

		else {
			System.out.println("Whew, that was a good guess!");
					for (int i=0; i <word.length();i++){
						if (word.charAt(i)==guess.charAt(0)){      
							 correct.replace(i, i+1,guess);}
					}  System.out.println("That's all of them"); showman(); System.out.println("Correct guesses:  " +correct); System.out.println("You have guessed:  " + guesses);}
}	



public static void main (String args[]){


System.out.println("Welcome to the Hangman Game, I hope you're Ready.  Let me think of a word");	
System.out.println("Thinking....");
System.out.println("Hmmmmmm......");
System.out.println("Got it!");
 word = generateWord();
System.out.println("I hope you're ready to play, my word has " + word.length() + " letters in it");
for (int i=word.length(); i>0; i--){
	correct = correct.append("-");
	}
System.out.println(correct);

	System.out.println("");
	System.out.println("lets make our first guess: ");
getGuess();
checkGuess();
while (!overYet){
	System.out.println("let’s go again: ");
	getGuess();
	checkGuess();
	if (remaining == 0){ overYet = true; System.out.println("Well that Didn't last long, maybe next time!"); System.out.println(" In case you were wondering my word was " +word);}
	else if (word.equals(correct.toString())){ overYet = true; System.out.println("Congrats, you did it! you beat me!");}}}}


