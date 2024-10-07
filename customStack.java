public class customStack {
//    custom implementation of stack
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full ");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;

    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        return data[pointer--];
    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[pointer];
    }


    public boolean  isFull(){
      return pointer == data.length-1;   //pointer is at last index
    }

    private boolean  isEmpty(){
        return pointer == -1;
    }
    public customStack(){
        this(DEFAULT_SIZE);
    }

    public customStack(int size){
        this.data = new int[size];
    }
}
