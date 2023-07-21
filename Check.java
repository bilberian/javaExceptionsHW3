package Exceptions3;

public class Check {

    public static void checkData(String[] array){
        if (array.length != 6){
            throw new RuntimeException("Введено неверное количество данных");
        }
    }

    public static void checkChar(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)))
                throw new RuntimeException("Некорректный ввод в ФИО: введены числа");
        }
    }

    public static void checkBirthday(String birthday) {
        String[] date = birthday.split("\\.");
        if ((date.length != 3 || date[2].length() != 4) ||
                (!isStringInt(date[0]) || !isStringInt(date[1]) || !isStringInt(date[2])))
            throw new RuntimeException("Неккоретная дата");
    }

    public static void checkPhone(String phone){
        try {
            Long.parseLong(phone);
        } catch(NumberFormatException e) {
            throw new RuntimeException("Некорректный ввод (введены не числа)");
        }
    }

    public static void checkSex(String sex){
        if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("f")){
            throw new RuntimeException("Неверно введен пол");
        }
    }

    public static boolean isStringInt(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

