package isp.lab5.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account( "Student " + i, 1000D * i,new Card(String.valueOf(i), String.valueOf(2 * i)));
        }
        Bank bank = new Bank(accounts);
        ATM ATM = new ATM(bank);
        ATM.checkMoney();
        ATM.withdraw(500.00);
        ATM.changePin("123", "21");

        if (ATM.insertCard(new Card("1", "2"), "2")) {
            ATM.checkMoney();
            ATM.withdraw(500.00);
            ATM.withdraw(2000.00);
            ATM.checkMoney();
            ATM.changePin("asd", "as");

            ATM.changePin("2", "as");

            ATM.removeCard();

            ATM.checkMoney();
            ATM.withdraw(500.00);
            ATM.changePin("asd", "as");
        }
    }


}