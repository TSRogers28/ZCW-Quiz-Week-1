public class StringUtilities {
   public Character getMiddleCharacter(String word){
       char [] mid = word.toCharArray();
       int solve = mid.length / 2;
       return mid[solve];
   }
   
   public String removeCharacter(String value, char charToRemove){
     String result = "";
     char [] valueToChar = value.toCharArray();
     for (int x= 0; x < valueToChar.length; x++){
        if (valueToChar[x] != charToRemove){
        result += valueToChar[x];    
        }
     
     
   }
   return result;
}
   
   public String getLastWord(String value) {
       return value.substring(value.lastIndexOf(" ")+1);
   }
}
