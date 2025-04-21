package TaskThree;

public class Mail {
    private String senderAddress;
    private String subject;
    private String message;
    private String dateTime;
    private boolean isRead;


    public Mail(String senderAddress, String subject, String message, String dateTime, boolean isRead){
        this.senderAddress = senderAddress;
        this.subject = subject;
        this.message = message;
        this.dateTime = dateTime;
        this.isRead = isRead;
    }


    public void markAsRead(){
        this.isRead = true;
    }

    public void printMail() {
        System.out.println(subject + " from " + senderAddress + " on " + dateTime + ": " + message);
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
