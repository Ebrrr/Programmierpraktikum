package blatt3.a1.Acc;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote; // package-private

    public Account(String owner, double balance, int pin, String internalNote) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = internalNote;
    }

    public double getBalance() {
        return balance;
    }

    public boolean changePin(int currentPin, int newPin) {
        if (this.pin == currentPin) {
            this.pin = newPin;
            return true;
        } else {
            return false;
        }
    }
}