// Last updated: 7/14/2026, 2:08:35 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');

            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }    
        return stack.isEmpty();
        }
}