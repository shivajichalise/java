class Stack{
  static final int MAX = 6;
  int top;
  int[] stack = new int[MAX];

  Stack(){
    top = -1;
  }

  boolean isEmpty(){
    if(top == -1){
      return true;
    }
    return false;
  }

  boolean isFull(){
    if(top == 5){
      return true;
    }
    return false;
  }

  boolean push(int item){
    if(isFull()){
      System.out.println("Stack Overflow");
      return false;
    }
    stack[++top] = item;
    return true;
  }

  boolean pop(){
    if(isEmpty()){
      System.out.println("Stack Underflow");
      return false;
    }
    stack[top] = 0;
    top--;
    return true;
  }

  int topValue(){
    return stack[top];
  }

  public static void main(String[] args){
    Stack s = new Stack();
    s.push(10);
    System.out.println(s.topValue() + " is in the top.");
    s.push(20);
    System.out.println(s.topValue()+" is in the top.");
    s.pop();
    System.out.println(s.topValue()+" is in the top.");
  }
}
