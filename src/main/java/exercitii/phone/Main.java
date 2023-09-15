package exercitii.phone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        PhoneBook phoneBook = new PhoneBook();
//
//        List<String> allContacts = new ArrayList<>();
//        allContacts.add("23");
//        allContacts.add("34");
//        allContacts.add("56");
//
//        List<String> blackList = new ArrayList<>();
//        blackList.add("25");
//        blackList.add("34");
//        blackList.add("78");
//
//        phoneBook.setContacts(allContacts);
//        phoneBook.setBlackList(blackList);
//
//        PhoneBook phoneBook1 = new PhoneBook(allContacts, blackList);


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.getContacts().add("23");
        phoneBook.getContacts().add("34");
        phoneBook.getContacts().add("56");
        //List<String> blackList = new ArrayList<>();
        phoneBook.getBlackList().add("23");
        phoneBook.getBlackList().add("33");
        phoneBook.getBlackList().add("34");
       // System.out.println(Phoneook.filterContacts(allContacts,blackList));
        try {
            phoneBook.addToBlacklist("78");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(phoneBook.getContacts());
        System.out.println(phoneBook.getBlackList());


    }
}
