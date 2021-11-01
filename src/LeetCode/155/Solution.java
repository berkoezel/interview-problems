// 155. Min Stack
import java.util.Stack;

class MinStack {
    Stack<Integer> stk;
		Stack<Integer> minValues;
	  public MinStack() {
			stk = new Stack<>();
			minValues = new Stack<>();
    }
    
    public void push(int val) {
       stk.push(val);
			 if(minValues.isEmpty()) minValues.push(val);
			 else if(val <= minValues.peek()) minValues.push(val);
    }
    
    public void pop() {
       int popped = stk.pop();
			 if(popped == minValues.peek()) minValues.pop();
    }
    
    public int top() {
       return stk.peek(); 
    }
    
    public int getMin() {
        return minValues.peek(); 
    }
}

