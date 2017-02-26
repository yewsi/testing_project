/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Random;

/**
 *
 * @author Yewsi
 */
public class Service implements ServiceInterface{
    
    private Random random = new Random();
    private MagicEightBall eightBall = new MagicEightBall();
    
    public Service(){
        
    }
    
    @Override
    public int randomNumber(int max) {
        if(max<0){
            throw new IllegalArgumentException("Please give a positive number instead");
        }

        return random.nextInt(max)+1;
    }

    @Override
    public String shakeMagicEightBall() {
        return eightBall.answer();
    }

    @Override
    public String headOrTails() {
        int rand = random.nextInt(2);
        
        if(rand == 0)
            return "Heads";
        
        return "Tails";
    }

    @Override
    public String rockPaperSciccors(String play) {
        
        if(play==null || play.equals("")){
            throw new IllegalArgumentException("Choose Rock, Paper or Sciccors");
        }
        
        if(!play.toUpperCase().equals("PAPER")||!play.toUpperCase().equals("ROCK")||!play.toUpperCase().equals("SCICCORS")){
            throw new IllegalArgumentException("Choose Rock, Paper or Sciccors");
        }
        
        int rand = random.nextInt(3);
        
        if(rand == 0)
            return "You Win!";
        
        if(rand == 1)
            return "Tie!";
        
        return "You Lose";
    }
    
}
