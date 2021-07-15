package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CheckNonRep {

	//Given a string, find the first non-repeating character in it.
	//For example, if the input string is “GeeksforGeeks”, then the 
	//output should be ‘f’ and if the input string is “GeeksQuiz”, then the output should be ‘G’. 
	
	public static void main(String[] args) {
		
		String s = "GeeksfofffpoklgGeeks";
		//nonRepeatChar(s);	
		//System.out.println("Non Repeating char  " + nonRepeatChar(s));
		System.out.println("Non Repeating char  is the " + firstNonRepeatedCharacter(s));
		//System.out.println("Non Repeating char using linkedhashmap  is the " + firstNonRepeatedCharacterUsingLinkedHashMap(s));


	}

	public static char firstNonRepeatedCharacter(String word) {
        HashMap<Character,Integer> scoreboard = new HashMap<>();
        // build table [char -> count]
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            if (scoreboard.containsKey(c)) {
//                scoreboard.put(c, scoreboard.get(c) + 1);
//            } else {
//                scoreboard.put(c, 1);
//            }
//        }
        
        for(char c : word.toCharArray()) {
        	scoreboard.put(c,scoreboard.containsKey(c) ? scoreboard.get(c) + 1 : 1);
    }	
        // since HashMap doesn't maintain order, going through string again
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }

	public static char firstNonRepeatedCharacterUsingLinkedHashMap(String word) {
        Map<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        // build table [char -> count]
        for(char c : word.toCharArray()) {
        		linkedHashMap.put(c,linkedHashMap.containsKey(c) ? linkedHashMap.get(c) + 1 : 1);
        }	
        for(Entry<Character,Integer> entry :linkedHashMap.entrySet() ) {
        	if(entry.getValue() == 1) {
        		return entry.getKey();
        	}
        }
        throw new RuntimeException("didn't find any non repeated Character");

	}
}
        				
        				
        				
        				
        				