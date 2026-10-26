package task8;

enum EmployeePosition {
    INTERN(0, 10000),
    JUNIOR(1, 20000),
    MIDDLE(2, 40000),
    SENIOR(3, 70000),
    MANAGER(4, 90000);

    private final int level;
    private final int minSalary;

    // Конструктор enum завжди є приватним за замовчуванням
    EmployeePosition(int level, int minSalary) {
        this.level = level;
        this.minSalary = minSalary;
    }

    public int getLevel() {
        return level;
    }

    public int getMinSalary() {
        return minSalary;
    }
}

public class Main {

    // Метод для виведення повної інформації про позицію
    static void printPositionInfo(EmployeePosition position) {
        System.out.println("Посада: " + position.name());
        System.out.println("Рівень: " + position.getLevel());
        System.out.println("Мінімальна зарплата: " + position.getMinSalary());
    }

    // Метод для перевірки відповідності фактичної зарплати
    static void checkSalaryMatch(EmployeePosition position, int actualSalary) {
        System.out.println("Посада: " + position.name());
        System.out.println("Мінімальна зарплата: " + position.getMinSalary());
        System.out.println("Фактична зарплата: " + actualSalary);

        if (actualSalary >= position.getMinSalary()) {
            System.out.println("Результат: відповідає\n");
        } else {
            System.out.println("Результат: НЕ відповідає (нижче мінімуму)\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Інформація про всі посади в компанії ---");
        // Перебір усіх значень enum
        for (EmployeePosition position : EmployeePosition.values()) {
            printPositionInfo(position);
            System.out.println("------------------------------------");
        }

        System.out.println("\n--- Перевірка фактичної зарплати співробітників ---");

        // Перевірка 1: Зарплата вища за мінімальну
        checkSalaryMatch(EmployeePosition.JUNIOR, 25000);

        // Перевірка 2: Зарплата дорівнює мінімальній
        checkSalaryMatch(EmployeePosition.MANAGER, 90000);

        // Перевірка 3: Зарплата нижча за мінімальну
        checkSalaryMatch(EmployeePosition.SENIOR, 65000);
    }
}