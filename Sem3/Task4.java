package Sem3;

import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
    }

    public static int sumElementsArray(String[][] array){
        if (array.length  != 4 && array[0].length != 4)
            throw new MyArraySizeException(array.length, array[0].length);
        int resultSum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                try{
                    resultSum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new  MyArrayDataException(i, j);
                }
            }
        }
        return resultSum;
    }
}

class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int row, int columns){
        super("Массив должен иметь размеры 4х4, у Вас (" + row + ", " + columns + ")");
    }
    public MyArraySizeException(){
        super("Массив должен иметь размеры 4х4");
    }
}


class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int i, int j){
        super("Не удалось преобразовать элемент, находящийся на позиции (" + i + ", " + j + ")");
    }
    public MyArrayDataException(){
        super("Не удалось преобразовать элемент");
    }
}
