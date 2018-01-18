/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model.dictionary;


import java.util.*;

/**
 *
 * @author hcadavid
 * Modified by fchaves
 */
public class SpanishDictionaryDataSource extends Dictionary{


    static private String words[] = {
            "GENERAL",
            "PRESIDENTE",
            "HOMBRE",
            "SEÑOR",
            "PROGRAMA"
    };

    private List<String> availableWords;

    public SpanishDictionaryDataSource() {
        characterSet = createCharacterSet();
        availableWords = Arrays.asList(words);
    }

    public List<String> getAvailableWords(){
        return Arrays.asList(words);
    }

    public List<Character> getCharacterSet() {
        return characterSet;
    }

    @Override
    public List<Character> createCharacterSet() {
        List<Character> result=super.createCharacterSet();
        result.add((char) 165);
        return result;
    }
}
