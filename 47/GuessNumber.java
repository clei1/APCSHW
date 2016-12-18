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

    public GuessNumber(){
	lower = 1;
	upper = 100;
	nguess = 0;
	number = (int) (Math.random() * 100) + 1; //Math.random() returns [0,1)
	userIn = -1;
    }
    
    public void game(){
	while(userIn != number){
	    System.out.println("Guess a number from " + lower + "-" + upper + ":");
	    userIn = Keyboard.readInt();
	    if( userIn >= lower && userIn <= upper){
		nguess += 1;
		if(userIn > number){
		    upper = userIn-1;
		}
		else{
		    lower = userIn+1;
		}
	    }
	    else{
		System.out.println("Number is not within range.");
	    }				 
	}
	System.out.println("Correct! It took " + nguess + " guesses.");	
    }

    public static void main(String[] args){
	GuessNumber test = new GuessNumber();
	test.game();
    }
    
}
