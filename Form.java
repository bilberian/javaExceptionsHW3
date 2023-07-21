package Exceptions3;

import java.util.Scanner;

public class Form {
   
    public static String[] formContact() {
        System.out.println("Введите через пробел: \n(1) фамилию, \n(2) имя, \n(3) отчество, \n(4) дату рождения в формате dd.mm.yyyy, \n(5) номер телефона без разделителей, \n(6) пол(f / m)");
        System.out.println("Ввод: ");
        
        try (Scanner console = new Scanner(System.in)) {
            String contact = console.nextLine();
            String[] array = contact.split(" ");
                        
            return array;
        }
    }
}
