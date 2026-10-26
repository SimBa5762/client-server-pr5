package task5;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Нестатичний внутрішній клас
    public class AccountOperations {

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(owner + " -> Внесено: " + amount + " ₴");
            }
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println(owner + " -> ПОМИЛКА: Недостатньо коштів для зняття " + amount + " ₴. Доступно: " + balance + " ₴");
            } else if (amount > 0) {
                balance -= amount;
                System.out.println(owner + " -> Знято: " + amount + " ₴");
            }
        }

        public void printBalance() {
            System.out.println("Залишок на рахунку [" + owner + "]: " + balance + " ₴");
        }
    }
}