import java.util.Stack;

public class Stack {

    private int size;
    private int[] intStack;
    private int top;

    public Stack(int size){
        this.size = size;
        intStack = new int[size];
        top = -1;
    }

}

public void push(int data){
    if(!isfull){
        intStack[++top] = data;
    }
    else{
        System.out.print("Cannot add data coz the stack is full");
    }
}

public int pop(){
    return intStack[top--];
}

public int peek(){
    return intStack[top];
}

public boolean isfull(){
    return(top == size-1);
}

public boolean isEmpty() {
    return(top == -1);
}