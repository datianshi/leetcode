package palindromic;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/2/14
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        if(s.isEmpty()){
            return "";
        }
        String longestString = String.valueOf(chars[0]);
        for(int index= 0; index < s.length(); index++){
            int leftIndex = index;
            int rightIndex = index;

            while(leftIndex >= 0 && chars[leftIndex] == chars[index]){
                leftIndex --;
            }

            while(rightIndex < s.length() && chars[rightIndex] == chars[index]){
                rightIndex ++;
            }

            while(leftIndex >=0 && rightIndex < chars.length && chars[leftIndex] == chars[rightIndex]){
                leftIndex--;
                rightIndex++;

            }
            if(rightIndex - leftIndex -1 > longestString.length()){
                longestString = s.substring(leftIndex + 1, rightIndex);
            }
        }
        return longestString;
    }
}
