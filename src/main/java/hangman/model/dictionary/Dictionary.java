/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model.dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 2104784
 */
public interface  Dictionary {	
 
    public abstract List<String> getAvailableWords();
      
    public abstract List<Character> getCharacterSet();
    
    public abstract List<Character> createCharacterSet();    
   
}
