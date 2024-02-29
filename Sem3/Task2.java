package Sem3;

import java.io.IOException;

public class Task2 {
    private Integer count;

    public Task2(){
        this.count = 0;
        }


    public static void main(String[] args) throws IOException {
        
        main2();

    }

    public static void main2() throws IOException{
        Task2 task2 = new Task2();
        task2.add();
        task2.add();
        task2.add();
        System.out.println(task2.getCount());
        task2.closeTerminate();
        task2.add();
    }

    public void add() throws IOException {
        checked();
        this.count++;
    }

    public void checked() throws IOException {
        if (this.count == null) {
            throw new IOException("Не возможно сложить");
        }     
    }

    public Integer getCount() throws IOException {
        checked();
        return count;
    }

    // @Override
    public void closeTerminate() {
        this.count = null;
    }
}    
