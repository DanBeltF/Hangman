package hangman.model.dictionary;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class TestDictionary {

	@Test
	public void testFrech() {
		FrenchDictionaryDataSource fd=new FrenchDictionaryDataSource();
		List<String> lista=fd.getAvailableWords();
		
		for (String s:lista)
			System.out.println(s);		
		List<Character> lis=fd.getCharacterSet();
		for(Character c:lis)
			System.out.println(c);		
	}
	@Test
	public void testSpanish(){
		SpanishDictionaryDataSource fd=new SpanishDictionaryDataSource();			
		List<String> lista=fd.getAvailableWords();				
		for (String s:lista)
			System.out.println(s);		
		List<Character> lis=fd.getCharacterSet();
		for(Character c:lis)
			System.out.println(c);		
	}
}

