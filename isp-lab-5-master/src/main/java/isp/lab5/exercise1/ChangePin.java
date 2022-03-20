package isp.lab5.exercise1;

public class ChangePin extends Transaction {
    private final String oldPin;
    private final String newPin;

    public ChangePin(String oldPin, String newPin, Account account) {
        super(account);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }
    @Override
    public String execute() {
        if (this.account.getCard().getPin().equals(oldPin)) {
            this.account.getCard().setPin(newPin);
            return "Pin changed successfully";
        } else {
            return "The old pin do not match the existing pin";
        }
    }
}