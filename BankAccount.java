public class BankAccount {
     private double balance;
     private int accountID;
     private String password;
     public BankAccount(double bal, int id, String pw) {
          balance = bal;
          accountID = id;
          password = pw;
     }
     public double getBalance() {
          return balance;
     }
     public int getID() {
          return accountID;
     }
     public void setPassword(String pw) {
          password = pw;
     }
     public String toString() {
          return accountID + "\t" + balance;
     }
     public boolean deposit(double deposit) {
          if (deposit >= 0) {
               balance += deposit;
               return true;
          }
          else {
               return false;
          }
     }
     public boolean withdraw(double withdrawal) {
          if (balance - withdrawal >= 0 && withdrawal > 0) {
               balance -= withdrawal;
               return true;
          }
          else {
               return false;
          }
     }
}