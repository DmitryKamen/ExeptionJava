// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
// возвращающий новый массив, каждый элемент которого равен сумме элементов двух
// входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task5 {
    public static void main(String[] args) {
            int[] array0 = {1, 2, 3};
            int[] array1 = {4, 5, 6};
            for (int i: sumElementsArrays(array0, array1))
                System.out.print(i + " ");
            int[] array2 = {1, 2};
            int[] array3 = {4, 5, 6};
            sumElementsArrays(array2, array3);
    
        }
    
        public static int[] sumElementsArrays(int[] arrayFirst, int[] arraySecond){
            if (arrayFirst.length != arraySecond.length)
                throw new RuntimeException("Длины масивов не равны");
            int[] resultArray = new int[arrayFirst.length];
            for (int i = 0; i < arrayFirst.length; i++){
                resultArray[i] = arrayFirst[i] + arraySecond[i];
            }
            return resultArray;
        }
    }

