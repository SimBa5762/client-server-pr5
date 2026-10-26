package task4;

public class Main {
    public static void main(String[]args)
    {
        // Створення об'єктів статичного вкладеного класу без створення об'єкта University
        University.Department dep1 = new University.Department("Кафедра програмування", "Шевченко О.В.");
        University.Department dep2 = new University.Department("Кафедра комп'ютерних наук", "Коваленко І.М.");

        // Звичайний вивід через метод класу Department
        dep1.printInfo();
        dep2.printInfo();

        System.out.println();

        // Використання статичного методу з класу University
        University.displayDepartmentInfo(dep1);
        University.displayDepartmentInfo(dep2);
    }

}

