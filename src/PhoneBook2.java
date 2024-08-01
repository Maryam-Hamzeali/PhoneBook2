import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook2 {
    //static ArrayList<String> names = new ArrayList<>();
    //static ArrayList<String> numbers = new ArrayList<>();
   private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int choice;
        do {
            printmenu();
            System.out.println("please choice  your option:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addcontact();
                    break;
                case 2:
                    printcontacs();
                    break;
                case 3:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("invalied");
            }
        } while (choice != 3);
        scanner.close();
    }


    private static void printmenu() {
        System.out.println("Menu");
        System.out.println("1.add contact");
        System.out.println("2.print all contact");
        System.out.println("3.exit \n");
    }

    private static void printcontacs() {
        if (contacts.isEmpty()) {
            System.out.println("PhoneBook is empty");
        } else {
            System.out.println("print all contacts");
            for (Contact contact : contacts) {
                System.out.println("name: " + contact.getName());
                System.out.println("number: " + contact.getNumber());

            }
        }
    }

    private static void addcontact() {
        Contact newContact = new Contact();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = scanner.nextLine();
        newContact.setName(name);
       //newContact.setName(scanner.nextLine());
        System.out.println("enter your number as number only without zero at start: ");
        String number = scanner.nextLine();
        newContact.setNumber(number);
        contacts.add(newContact);
        System.out.println("cantact save successfully");

    }
}
