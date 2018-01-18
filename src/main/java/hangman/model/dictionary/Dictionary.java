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
public abstract class Dictionary {
    
    protected List<Character> characterSet;
 
    public abstract List<String> getAvailableWords();

    public abstract List<Character> getCharacterSet();
    
    
    public List<Character>  createCharacterSet() {
        List<Character> result = new ArrayList<>();
        char begin = 65;
        char end = 65+26;
        for(char c = begin;c < end;c++) {
            result.add(c);
        }
        return result;
    }

}
