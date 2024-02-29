package Sem3;

import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) {
        
    }
}

public class NullPointerArray extends NullPointerException {
    public NullPointerArray(){
        super("Элемент пустой");
    }
    public NullPointerArray(int count){
        super("Элемет на это индексе "+ count + " пустой");
    }
}

public class FIleNotExistsException extends FileNotFoundException {
    public FIleNotExistsException(){
        super("Файл не найден");
    }
    public FIleNotExistsException(String baf){
        super("Файла по пути "+ baf +" не найден");
    }

}
public class DiveByZero extends ArithmeticException{
    public DiveByZero(){
        super("Нельзя делить на ноль");
    }
}