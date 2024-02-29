package Sem3;

import java.io.IOException;

class Task1 
{
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void doSomething() throws IOException {
        throw new IOException("Какое-то исключение");
    }
}