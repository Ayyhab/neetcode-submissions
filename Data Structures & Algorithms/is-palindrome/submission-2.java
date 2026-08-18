class Solution {
    public boolean isPalindrome(String s) {
    String lower= s.toLowerCase().replaceAll(
        "[^a-zA-Z0-9]", ""
    );
    System.out.println(lower);
    int left = 0;
    int right = lower.length()-1;


    while( left < right ){
    char first= lower.charAt(left); //w
    char last = lower.charAt(right); //w

        if( first!= last){
            return false;
        }
        else{
        left ++;
        right --;
        }


    }
   
    if( left>= right){
        return true;
    }

    return false;
    }
  

}
