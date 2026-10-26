package task4;

import javax.xml.namespace.QName;

public class University {
    static class Department{
        public  String name = "";
        public String head = "";

        public Department(String name, String head) {
            this.name = name;
            this.head = head;
        }

        void printInfo() {
            System.out.println("Назва кафедри: " + name + " | Завідувач: " + head);
        }
    }
    // Статичний метод, що приймає об'єкт Department
    public static void displayDepartmentInfo(Department dep) {
        System.out.println("Виклик через статичний метод University");
        dep.printInfo();
    }
}
