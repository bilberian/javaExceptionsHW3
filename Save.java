package Exceptions3;

import java.io.FileWriter;
import java.io.IOException;

public class Save {

    public static void saveContact(String[] info){

        try (FileWriter writer = new FileWriter(info[0] +".txt", true)){
            writer.write(
                "Фамилия: " + info[0] + ";\n" +
                "Имя, Отчество: " + info[1] + " " + info[2] + ";\n" +
                "Пол: " + info[5] + ";\n" +
                "Тел.:" + info[4] + ";\n" +
                "Дата Рождения: " + info[3]);
                writer.close();
            System.out.println("Контакт сохранен");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
}
