public class dynamicStack  extends customStack{
    public dynamicStack(){
        super(); //it will call customstack()


    }
    public dynamicStack(int size){
        super(size);
    }

//    override the push method

    @Override
    public boolean push(int item) {
        if (this.isFull()){
//            double the array size
            int [] temp = new int[data.length*2];

//            copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];

            }
            data = temp;
        }

//        insert item (as now stack size is doubled every time it gets full)
        return super.push(item);
    }
}
