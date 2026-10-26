package task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    // Generic-метод для виведення будь-якої колекції
    static <T> void printAll(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    // Метод з Upper Bounded Wildcard
    static double calculateAverage(List<? extends Number> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0.0;

        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue(); // Number дозволяє безпечно отримати double
        }
        return sum / numbers.size();
    }

    // 4. Метод з Lower Bounded Wildcard
    static void addScores(List<? super Integer> scores) {
        scores.add(95);
        scores.add(88);
        scores.add(100);
        System.out.println("Оцінки успішно додано.");
    }

    public static void main(String[] args) {
        System.out.println("--- Робота з Repository ---");
        Repository<Student> studentRepo = new Repository<>();
        studentRepo.add(new Student("Олександр"));
        studentRepo.add(new Student("Марія"));

        Repository<Teacher> teacherRepo = new Repository<>();
        teacherRepo.add(new Teacher("Петро Іванович"));

        printAll(studentRepo.getAll());
        printAll(teacherRepo.getAll());

        System.out.println("\n--- Робота з <? extends Number> ---");
        List<Integer> intList = Arrays.asList(10, 20, 30, 40);
        List<Double> doubleList = Arrays.asList(5.5, 4.5, 10.0);

        System.out.println("Середнє для Integer: " + calculateAverage(intList));
        System.out.println("Середнє для Double: " + calculateAverage(doubleList));

        System.out.println("\n--- Робота з <? super Integer> ---");
        List<Integer> myInts = new ArrayList<>();
        List<Number> myNumbers = new ArrayList<>();
        List<Object> myObjects = new ArrayList<>();

        addScores(myInts);
        addScores(myNumbers);
        addScores(myObjects);

        System.out.println("myInts: " + myInts);
        System.out.println("myNumbers: " + myNumbers);
        System.out.println("myObjects: " + myObjects);
    }
}