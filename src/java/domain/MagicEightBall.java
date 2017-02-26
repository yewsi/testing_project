/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Yewsi
 */
public class MagicEightBall {
    private String[] array = {"Yes", "No", "It is certain", "Most likely", "Without a doubt", "You'll see", "You may rely on it", "My sources say no", "Don't count on it", "Ask again later", "Better not tell you now", "Concentrate and ask again"};
    private ArrayList<String> answers = new ArrayList<>(Arrays.asList(array));
    
    public MagicEightBall(){
        
    }
    
    public String answer(){
        return answers.get(new Random().nextInt((array.length)));
    }
}
