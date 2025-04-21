import TaskOne.Textbook;
import TaskThree.Inbox;
import TaskThree.Mail;

public class Main {
    public static void main(String[] args) {
       // Textbook tb = new Textbook("Data Structures", 2020, "Jane Doe", "Computer Science");
       // System.out.println(tb.getInfo());

        //Test
        Inbox inbox = new Inbox();
        inbox.addMail(new Mail("bla@gmail.com", "hello", "how are you?", "20.4.25  13.32", false));
        inbox.addMail(new Mail("bla2@gmail.com", "hey", "meh?", "21.4.25  15.32", false));
        inbox.open(0);


       int unread = inbox.countUnread();
       inbox.printHeaders();

    }
}