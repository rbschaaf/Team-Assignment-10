/* This class is used primarily as a means to find the amount of vowels
* in a given string.
* Completed by Dayan Jayasuriya, Nicki Lindstrom, and Riley Schaaf.
* Last edited March 30, 10:29 pm by Nicki.
*/
public class Vowels{

  /**
  * Static method that finds the number of vowels in a given String.
  * @param: toSearch a String.
  * @return: (vowelCount + numOfVowels(newString)) recursive return giving the
  * current vowel count in addition to all future vowel counts of the
  * first character of the newString.
  */
  public static int numOfVowels(String toSearch){
    int vowelCount = 0;
    String newString = " ";
    /* Method will return 0 upon finding a null String or a String of zero
    * length.
    */
    if(toSearch == null || toSearch.length()==0) return 0;
    /* If the String has a length equal to 1, if it is a vowel return 1
    * otherwise return 0. This provides an account of cases where the String returned
    * is only length of 1.
    */
    if(toSearch.length()==1){
      if(toSearch.equals("a") || toSearch.equals("e") || toSearch.equals("i")
      || toSearch.equals("o")|| toSearch.equals("u")){
      return 1;
      }else{
      return 0;
      }
    }
    /* If the given String has a length greater than 1, check the character at
    * index 0. If this is a vowel, increase the count by 1.
    * Then remove the first character from the string by making a new substring
    * that includes index 1 through the remainder of the string.
    */
    if(toSearch.length() >1){
      char letter = toSearch.charAt(0);
      if(letter == 'a' || letter == 'e' || letter =='i' || letter=='o'
      || letter =='u'){
        vowelCount+=1;
      }
      newString = toSearch.substring(1,toSearch.length());
    }
    /*
    * The recursive call takes the new string and checks the number of vowels. If
    * the string is length 0 it returns 0, if it is length 1 it checks to see
    * if it is a vowel or not and adjusts the count accordingly. In this way,
    * the recursive call takes us one step closer to the base step, whether import junit.framework.TestCase;
    * be a return 1 or a return 0.
    * This is always the case, as the string will continue to get shorter as the
    * recursive calls are made due to the substring method.
    * The result of the call is used to get the correct solution by adding calls
    * to the stack and gradually removing them until the base case is met. Each call
    * provides a count and sum of these counts is returned as the number of vowels.
    */
    return (vowelCount + numOfVowels(newString));
  }



}
