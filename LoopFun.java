public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public int factorial(int number){
          int fact = 1;
          for (int x = 1; x <= number; x++){
            fact = fact * x;
            }
          return fact;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case of the first letter of each word
       */
      public String acronym(String phrase) {
          String result = "";
          char[] acron = phrase.toCharArray();
          for(char x = 0; x < acron.length; x++){
            if (x == 0){
            result += acron[x];
            }
            if (acron[x] == ' '){
            result += acron[x+1];    
            }
          
      }
            return result.toUpperCase();
    }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will not be readable by anyone except it
       * intended audience. This method encrypt the message by shifting the character by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char [] crypted = word.toCharArray();
          for (int x = 0; x < crypted.length-1; x++){
              if ( 'a' == crypted[x] || 'w'== crypted[x]|| 'x'== crypted[x] || 'y' == crypted[x]){
                if (crypted[x+3] > crypted.length-1){
                char temp = crypted[x];
                crypted[x] = crypted[0];
                crypted[0] = temp;
                }  
                char temp = crypted[x];
                crypted[x] = crypted[x+3];
                crypted[x+3] = temp;
                
                }
            
            }
          return crypted.toString();
      }
    }

