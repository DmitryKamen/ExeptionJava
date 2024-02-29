package Sem2HomeWork;

class Expr {

    public static double expr(int a, int b) {
        // Введите свое решение ниже
        double result;
        if (b != 0) {
            result = (double)a/(double)b;
            return result;
        } else {
            return (double)b;
        }
}
    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        System.out.println( a + b );
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Task3 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 3; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } 

        double result = Expr.expr(a, b);
        Expr.printSum(a,b);
        System.out.println(result);
        
    }
}
