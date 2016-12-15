/*
Connie Lei
APCS1 pd1
HW#47 -- Keep Guessing
2016-12-18
*/

import cs1.Keyboard;

public class GuessNumber{
    private int number;
    private int nguess;
    private int lower;
    private int upper;
    private int userIn;

    public GuessNumber{
	lower = 1;
	upper = 100;
	nguess = 0;
	number = (int) (Math.random() * 101); //Math.random() returns [0,1)
	userIn = -1;
    }
    
    public void game(){
	while(userIn != number){
	    System.out.println("Guess a number from " + lower + "-" + upper + ":");
	    userIn = Keyboard.readInt();
	    nguess += 1;
	}
	System.out.println("Correct! It took " + nguess + "guesses.");	
    }
    
}
