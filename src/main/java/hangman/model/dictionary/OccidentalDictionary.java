package hangman.model.dictionary;

import java.util.*;

public abstract class OccidentalDictionary implements Dictionary{
	private List<Character> characterSet;
	private List<String> availableWords;
	
	public OccidentalDictionary(){
		characterSet = createCharacterSet();
	}

	public List<Character> createCharacterSet() {		
        List<Character> result = new ArrayList<>();
        char begin = 65;
        char end = 65+26;
        for(char c = begin;c < end;c++) {
            result.add(c);
        }
        return result;
	}
	
	public void setCharactersSet(List<Character> add){
		characterSet=add;		
	}
	
	 public List<Character> getCharacterSet() {
	        return characterSet;
	 }
	
	
	public void setAvalariableWords(List<String> nWords){
		availableWords=nWords;		
	}
}
