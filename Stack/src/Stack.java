
public class Stack {
    int arr[];
    int capacity;
    int top;
  Stack (int size)
  {
      arr = new int [size];
      capacity = size;
      top = -1;
  }
  public Boolean isFull()
  {
      return top == capacity-1;
  }
  public Boolean isEmpty()
  {
      return top == -1;
  }
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("OverflowTerminated");
            //System.exit(1);
        }
        System.out.println("Inserting Item :"+x);
        arr[++top] = x;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
         //   System.exit(1);
        }
        System.out.println(peek());
      return  arr[top--];
    }
       public int peek() 
       {
           if(!isEmpty())
              return arr[top];
           else 
               System.exit(1);
           return -1;
       }
    int size()
    {
        return top+1;
    }
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(5);
        s.push(6);
        s.pop();
        s.pop();
        
        s.push(90);
        System.out.println(s.peek());
        System.out.println(s.size());
        
        s.pop();
        
        if(s.isEmpty())
        {
            System.out.println("Empty");
        }
        else 
            System.out.println("full");
        
        
    }
    
}
