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
public class EnglishDictionaryDataSource {

    private List<Character> characterSet;

    static private String words[] = {
            "PLAYER",
            "BALL",
            "SOCCER",
            "RAGE",
            "GAME"
    };

    private List<String> availableWords;

    public EnglishDictionaryDataSource() {
        characterSet = createCharacterSet();
        availableWords = Arrays.asList(words);
    }

    public List<String> getAvailableWords(){
        return Arrays.asList(words);
    }

    public List<Character> getCharacterSet() {
        return characterSet;
    }

    private List<Character> createCharacterSet() {
        List<Character> result = new ArrayList<>();
        char begin = 65;
        char end = 65+26;
        for(char c = begin;c < end;c++) {
            result.add(c);
        }
        return result;
    }
}
