package Exceptions3;


public class Main {
     public static void main(String[] args)  {
        
        String[] newContact = Form.formContact();
        Check.checkData(newContact);
        Check.checkChar(newContact[0]);
        Check.checkChar(newContact[1]);
        Check.checkChar(newContact[2]);
        Check.checkBirthday(newContact[3]);
        Check.checkPhone(newContact[4]);
        Check.checkSex(newContact[5]);
        Save.saveContact(newContact);
     }
}
