package TaskThree;

import java.util.ArrayList;
import java.util.List;

public class Inbox {
    private List<Mail> mails;

    public Inbox() {
        this.mails = new ArrayList<>();
    }
    public void addMail(Mail mail) {
        mails.add(mail);
    }
    public void printHeaders() {
        for (Mail mail : mails) {
            System.out.println((mail.isRead() ? "Read" : "Unread") + " | " + mail.getSubject() + " | " + mail.getSenderAddress() + " | " + mail.getDateTime());
        }
    }
        public void open(int index){
            if (index >= 0 && index < mails.size()) {
                Mail mail = mails.get(index);
                mail.markAsRead();
                mail.printMail();
            }else{
                System.out.println("Invalid, Mail not found");
            }
        }

        public int countUnread() {
            int count = 0;
            for (Mail mail : mails) {
                if (!mail.isRead()) {
                    count++;
                }
            }
            return count;
        }


}
