package task5;

public class Main {
    public static void main(String[] args) {
        // Створення банківського рахунку
        BankAccount account1 = new BankAccount("Богдан Ситник", 1000.0);

        // Створення AccountOperations для цього рахунку
        // Синтаксис створення внутрішнього нестатичного класу вимагає об'єкта зовнішнього класу
        BankAccount.AccountOperations ops1 = account1.new AccountOperations();

        System.out.println("--- Операції рахунку 1 ---");
        // Внесення коштів
        ops1.deposit(500.0);

        // Виконання зняття
        ops1.withdraw(200.0);

        // Додатково: ситуація недостатнього балансу
        ops1.withdraw(2000.0);

        // Внесення залишку
        ops1.printBalance();

        // Створення другого рахунку
        BankAccount account2 = new BankAccount("Олена Петрівна", 5000.0);
        BankAccount.AccountOperations ops2 = account2.new AccountOperations();

        System.out.println("\n--- Операції рахунку 2 ---");
        // Внутрішній об'єкт працює зі станом свого зовнішнього об'єкта
        ops2.withdraw(1500.0);
        ops2.printBalance();

        System.out.println("\n--- Фінальна перевірка незалежності ---");
        ops1.printBalance(); // Баланс Богдана залишився 1300
        ops2.printBalance(); // Баланс Олени став 3500
    }
}