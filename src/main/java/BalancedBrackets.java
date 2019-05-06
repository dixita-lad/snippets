import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    //check if the brackets are balance.  i.e. {[]} is balanced but {[}] and {][} is not
//valid brackets are {} [] and ()
    public static void main(String[] args) {
        String S ="That Cat(Aria) is cool { to sit } and play";
        boolean balanced = isBalanced(S);
        System.out.println(balanced);
    }

    public static boolean isBalanced(String S) {
        HashMap<Character, Character> map= new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < S.length(); i++) {
            if(map.containsKey(S.charAt(i))) {
                stack.push(S.charAt(i));
            }
            else {
                for(Character c: map.values()) {
                    if(S.charAt(i) == c) {
                        if(stack.empty()) {
                            return false;
                        }
                        Character lastValue = stack.peek();
                        if(map.get(lastValue)!=S.charAt(i)) {
                            return false;
                        }else {
                            stack.pop();
                        }
                    }
                }

            }

        }

        if(stack.empty()) {
            return true;
        }
        return false;
    }

}


