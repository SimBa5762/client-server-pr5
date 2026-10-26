package task11;

import java.util.ArrayList;
import java.util.List;


public class Main {

    // Узагальнений метод
    static <K, V> void printPair(Pair<K, V> pair) {
        System.out.println("Ключ: " + pair.getKey());
        System.out.println("Значення: " + pair.getValue());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Створення пар із різними комбінаціями типів
        System.out.println("--- Демонстрація різних типів ---");
        Pair<Integer, String> student = new Pair<>(101, "Марія");
        Pair<String, Double> product = new Pair<>("Ноутбук", 25999.50);
        Pair<String, Boolean> setting = new Pair<>("isDarkMode", true);

        printPair(student);
        printPair(product);
        printPair(setting);

        // Робота зі списком студентів
        System.out.println("--- Список студентів ---");
        List<Pair<Integer, String>> students = new ArrayList<>();
        students.add(new Pair<>(101, "Марія"));
        students.add(new Pair<>(102, "Олександр"));
        students.add(new Pair<>(103, "Олена"));
        students.add(new Pair<>(104, "Іван"));

        for (Pair<Integer, String> s : students) {
            printPair(s);
        }

        // Пошук студента за ключем
        int searchKey = 103;
        System.out.println("--- Пошук студента за ключем: " + searchKey + " ---");

        Pair<Integer, String> foundStudent = null;
        for (Pair<Integer, String> s : students) {
            if (s.getKey().equals(searchKey)) {
                foundStudent = s;
                break; // Зупиняємо пошук, якщо знайшли
            }
        }

        if (foundStudent != null) {
            System.out.println("Знайдено! Студент: " + foundStudent.getValue());
        } else {
            System.out.println("Студента з таким ключем не знайдено.");
        }
    }
}