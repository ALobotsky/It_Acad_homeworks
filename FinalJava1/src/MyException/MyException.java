package MyException;


public class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }

    public String getRussianMessage() {
        return super.getMessage();
    }
}