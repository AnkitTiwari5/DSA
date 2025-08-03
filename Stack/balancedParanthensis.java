package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class balancedParanthensis {

      private static boolean isBalanced(String str) {

        Deque <Character> s=new ArrayDeque<>();
        for(char ch: str.toCharArray())
{
    if(ch=='{' || ch=='[' || ch=='(')
    s.push(ch);

    else
    {
        if (s.isEmpty()) 
            return false;

        else if (matching(s.peek(),ch)==false)
        return false;

        else
        s.pop();
        }
}
return(s.isEmpty());
    }


    private static boolean matching(char a, char b) {
       return ((a=='{' && b=='}')) || ((a=='[' && b==']'))  || ((a=='(' && b==')')) ;
    }


    public static void main(String[] args) {
        

        String str="{([])}";

        System.out.println(isBalanced(str));
    }

  
}
