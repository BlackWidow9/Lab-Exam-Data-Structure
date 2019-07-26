import java.util.*;
public class PostFix {
   static int postfix(String exp)
    {
      Stack <Integer> stack = new Stack<>();
      for(int i= 0;i<exp.length();i++)
      {
          char c = exp.charAt(i);
          if(Character.isDigit(c))
          {
              stack.push(c - '0');
          }
          else
          {
              int v1 = stack.pop();
              int v2 = stack.pop();
              switch (c)
              {
                  case '+':
                  stack.push(v1+v2);
                  break;
                  case '-':
                      stack.push(v2-v1);
                      break;
                  case '/':
                  stack.push(v2/v1);
                  break;
                  case '*':
                      stack.push(v1*v2);
                      break;
                  
                
              }
          }
      }
      return stack.pop();
    }
    
    public static void main(String[] args) {
       
       String exp = "124*5/+7-36/+";
        System.out.println(postfix(exp));
    }
    
}
