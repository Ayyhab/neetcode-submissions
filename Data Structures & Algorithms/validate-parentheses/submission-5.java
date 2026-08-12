class Solution {
    public boolean isValid(String s) {
        Deque <Character> stack = new ArrayDeque<>();

        for(int i =0 ; i<s.length() ;i++){
            if ( s.charAt(i) == '('|| s.charAt(i) == '[' || s.charAt(i) == '{')
                {
            
                    if (s.charAt(i)== '('){
                        stack.push(')');
                    }
                    else if(s.charAt(i)== '['){
                        stack.push(']');
                    }
                    else if(s.charAt(i)== '{'){
                        stack.push('}');
                    }
                }
            else{
               if (stack.isEmpty() || stack.pop() != s.charAt(i) ){ /// if the current closing bracket doesn't match what we expected (top of stack),
// the string is invalid — we saw ')' but were expecting ']' for example.
                    return false;
               }

            }
              
        }
       return stack.isEmpty();


    }
 }

