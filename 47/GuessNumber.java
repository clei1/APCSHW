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
	while(userIn != number){ //Runs the loop while the userIn is not equal to the number
	    System.out.println("Guess a number from " + lower + "-" + upper + ":"); //Prints statement letting user know boundaries
	    userIn = Keyboard.readInt(); //Input will be changed into an integer
	    if( userIn >= lower && userIn <= upper){ //This checks for numbers outside of the range
		nguess += 1; //Updates the guess count, includes the correct guess
		if(userIn > number){ //Updates the upper bound
		    upper = userIn-1;
		}
		else{
		    lower = userIn+1; //Updates the lower bound
		}
	    }
	    else{
		System.out.println("Number is not within range."); //Follow up message so the number of guesses isn't updated and allows user to know their guess was invalid.
	    }				 
	}
	System.out.println("Correct! It took " + nguess + " guesses.");	
    }

    public static void main(String[] args){
	GuessNumber test = new GuessNumber();
	test.game();

	/* Best Way To Play
	   The maximum you can get rid of is half. If you choose a number near the end, you could potentially get rid of a larger amount of numbers or 
	   you could be left with a larger amount of numbers. By choosing a number in half, you ensure you always get rid of half of the numbers possible.
	   You will only need 7 guesses till the right guess. 2 to the 7th power is 128, which is more than 100.
	*/
    }
    
}
