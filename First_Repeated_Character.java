Given a string s. The task is to find the first repeated character in it. 
We need to find the character that occurs more than once and whose index 
of second occurrence is smallest. s contains only lowercase letters.

Examples :

Input: s ="geeksforgeeks"
Output: "e"
Explanation: 'e' repeats at third position.
Input: s ="hellogeeks"
Output: "l"
Explanation: 'l' repeats at fourth position.
Input: s ="abc"
Output: "-1"
Explanation: There is no repeated character.




  // User function Template for Java
class Solution {
    String firstRepChar(String s) {
        
        int mask = 0;
        int index = -1;
        
        for(int i = 0; i < s.length(); i++){
            int asci = s.charAt(i);
            asci = asci - 97;
            
            
            if((mask &  (1 << asci)) > 0){
                index = i;
                break;
            }
            
            
            mask = mask | (1 << asci);
        }
        
        if(index == -1){
            return "-1";
        }
        
        return ("" + s.charAt(index));
        
        
        
    }
}
