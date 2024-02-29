package Sem2HomeWork;

class Expr {
    public static String expr(char a) throws Exception {
        // Введите свое решение ниже
        String str;
        if (a == ' ') throw  new IllegalArgumentException("Пустая строка введена.");
        else{ 
            str = "Your input was - " + a;
            return str;
        }
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Task4 {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = 'J'; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
