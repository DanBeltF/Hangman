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
public class FrenchDictionaryDataSource extends Dictionary{


    static private String words[] = {
            "TOUS",
            "AVOIR",
            "APRÈS",
            "TRÈS",
            "VOILÀ"
    };

    private List<String> availableWords;

    public FrenchDictionaryDataSource() {
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
        result.add((char) 183);
        result.add((char) 212);
        //el de la Ì result.add((char) );
        result.add((char) 227);
        result.add((char) 235);
        return result;
    }
}
