import java.util.Scanner;
import java.lang.*; 
import java.io.*; 
import java.util.*;
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue +  valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
       /*Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = valueToBeReversed.length() - 1; i >= 0; i--)
        {
            reverse = reverse + valueToBeReversed.charAt(i);
        }
        
        return reverse; */
        /*Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        
        return sb.reverse().toString();  */
        StringBuilder input1 = new StringBuilder(); 
          input1.append(valueToBeReversed); 
          input1 = input1.reverse(); 
          return input1;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
         /* Scanner in = new Scanner(System.in);
          String s = in.next();
          int position;
          int length;
          
          if (word.length()% 2 == 1) {
              position = s.length()/ 2; 
              length = 1;
            } else{ 
                position = s.length()/ 2 -1; 
              length = 2;
            } */
            return null; 
        } 

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        //return value.replace(charToRemove, "");
        StringBuffer r = new StringBuffer( value.length() );
  r.setLength( value.length() );
  int current = 0;
  for (int i = 0; i < value.length(); i ++) {
     char cur = value.charAt(i);
     if (cur != charToRemove) r.setCharAt( current++, cur );
  }
  return r.toString();
       
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return sentence.substring(sentence.lastIndexOf(" ")+1);
    }
}
