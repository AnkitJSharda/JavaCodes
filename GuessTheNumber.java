// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Game{
    public int randNum,guessNum,NumOfGuesses=0;
    public Game()
    {
        Random rd = new Random();
        randNum = rd.nextInt(50);
    }
    
    public void getUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number: ");
        guessNum = sc.nextInt();
        NumOfGuesses++;
    }
    
    public boolean isCorrect()
    {
        //System.out.println(randNum + " " + guessNum);
        if(guessNum==randNum)
            return true;
        else if(guessNum>randNum)
            System.out.println("To high...Guess again!!");
        else
            System.out.println("To low...Guess again!!");
        return false;
    }
}


class GuessTheNumber {
    public static void main(String[] args) {
        Game obj = new Game();
        boolean flag=false;
        while(!flag){
            obj.getUserInput();
            flag = obj.isCorrect();
        }
        System.out.println("Correct!! You guessed correct ans in "+obj.NumOfGuesses+" guesses!!");
    }
}
