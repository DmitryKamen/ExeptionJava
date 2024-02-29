package Sem1HomeWork;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
      int [] array = new int [10];
      array[11] = 0;
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10/0;
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
       String str = "123fm";
       double d = Double.valueOf(str);
 }
}

public class Task1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}