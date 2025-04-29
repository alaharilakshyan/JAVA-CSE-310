import java.util.*;

 public class WhatsAppContacts{
    public static void main(String args[]){
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Lucky", "+919876543210");
        contacts.put("John", "+919876543211");
        contacts.put("Alice", "+919876543212");
        System.out.println(contacts);
        String search = "Lucky";
        if(contacts.containsKey(search)){
            System.out.println("Contact found: " + search + " - " + contacts.get(search));
        } else {
            System.out.println("Contact not found: " + search);
        }
        System.out.println("All contacts:");
        for(Map.Entry<String, String> entry : contacts.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
 }