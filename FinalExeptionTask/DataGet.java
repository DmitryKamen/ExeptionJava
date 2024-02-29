package FinalExeptionTask;

import java.io.IOException;
import java.util.Scanner;

public class DataGet {
    public static void getData() throws EmptyStringException, ArrayCountElementException, IncorrectValueException, IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в порядке указанном ниже латиницей:\n" +
                " <Фамилия> <Имя> <Отчество> <Дата рождения> <Телефон> <Пол>\n " +
                "Пример:\n" +
                "Ivanov Ivan Ivanovich 01.01.1981 911456876 m");
        String inputData;
        inputData = scanner.nextLine();
        if (inputData.isEmpty()){
            throw new EmptyStringException("Строка является пустой");
        }

        inputData = inputData.replaceAll("\\s+", " ");
        inputData = inputData.trim();
        String[] bufferArray = inputData.split(" ");
        if (bufferArray.length == 6){
            CheckInput.checkDateFormat(bufferArray[3]);
            CheckInput.checkPhoneNumberFormat(bufferArray[4]);
            CheckInput.checkGenderFormat(bufferArray[5]);
            DataWrite.createFile(bufferArray);

        } else {
            throw new ArrayCountElementException("Вы ввели не все данные или\n" +
                    "Вы пропустили пробел");
        }
    }
}
