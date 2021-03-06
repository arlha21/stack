public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public MyStack(int a) {
      maxSize = a;
      stackArray = new long[maxSize];
      top = -1;
   }
   // stack operations
    public void push(long b) {
      stackArray[++top] = b;
   }

    public long pop() {
      return stackArray[top--];
   }

    public long peek() {
      return stackArray[top];
   }
    ////////////////////////////////////////////////////
    public boolean isEmpty() {
      return (top == -1);
   }

    public boolean isFull() {
      return (top == maxSize - 1);
   }


    public static void main(String[] args) {
      MyStack theStack = new MyStack(10);
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);
      while (!theStack.isEmpty()) {
         long value = theStack.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
