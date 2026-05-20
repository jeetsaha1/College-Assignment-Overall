class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class prog1{
    public static void main(String[] args) throws MyException{
        int a = 20;
        if(a > 10)
            throw new MyException("It can't be more than 10");
        
    }
}
// Convering a primitive datatype to objects is called Boxing.
// 