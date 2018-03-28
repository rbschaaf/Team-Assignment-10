public class Vowels{

  /**
  * Method to find the number of vowels in a string (not including 'y').
  * @param: aString any string.
  * @return: numberVowels the number of vowels in the last letter of the current string.
  * @return: numOfVowels(aString.substring(0, lastChar)) a recursive call to the Method
  * with the current string, but the last letter being removed.
  */
  public static int numOfVowels(String aString){
    /*The method terminates if a null valued string is passed or once the string has
    been fully iterated through and has a length of 0. Each recursion call shortens the
    current string by removing the last letter until there are no longer any more letters. */
    if(aString == null || aString.length() == 0) return 0;
    int numberVowels = 0;
    int lastChar = aString.length()-1;
    if(aString.charAt(lastChar) =='a'||aString.charAt(lastChar)=='e'
    ||aString.charAt(lastChar)=='i'||aString.charAt(lastChar)=='o'
    ||aString.charAt(lastChar)=='u') numberVowels+=1;
    /*The recursive call passes on the current string, as a substring, but with the
    last letter excluded. This causes the string to shorten one character at a time
    until it reaches 0 (the terminating condition).
    The recursive call is successful because it checks the last letter and then removes
    this letter until the string/substrings have entirely been checked. If the letter
    checked and removed is a vowel, a value of 1 will be added by the current
    recursion call to the sum of the previous recrusion calls when it return when it unwinds.
    The previous recursion values, plus the current recursion call value will be summed
    and returned when unwinding down the stack. */
    return numberVowels + numOfVowels(aString.substring(0, lastChar));
  }
}
