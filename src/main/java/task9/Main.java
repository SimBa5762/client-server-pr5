package task9;

import java.util.Scanner;

enum Operation {
    ADD {
        @Override
        double calculate(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        double calculate(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        double calculate(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        double calculate(double a, double b) {
            if (b == 0) {
                System.out.println("Помилка: Ділення на нуль!");
                return Double.NaN;
            }
            return a / b;
        }
    };

    // Абстрактний метод, який гарантує, що кожна константа матиме свою реалізацію
    abstract double calculate(double a, double b);
}

public class Main {

    static void execute(Operation operation, double a, double b) {
        System.out.print("Виконується " + operation.name() + " для " + a + " та " + b + " -> ");
        double result = operation.calculate(a, b);
        if (!Double.isNaN(result)) {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        execute(Operation.ADD, 15, 5);
        execute(Operation.SUBTRACT, 15, 5);
        execute(Operation.MULTIPLY, 15, 5);
        execute(Operation.DIVIDE, 15, 5);
        execute(Operation.DIVIDE, 15, 0); // Перевірка ділення на нуль

        //Текстове меню для користувача
        System.out.println("\n--- Текстове меню ---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доступні операції:");
        for (int i = 0; i < Operation.values().length; i++) {
            System.out.println((i + 1) + ". " + Operation.values()[i]);
        }

        System.out.print("Виберіть номер операції (1-4): ");
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= Operation.values().length) {
                Operation selectedOp = Operation.values()[choice - 1];

                System.out.print("Введіть перше число: ");
                double num1 = scanner.nextDouble();

                System.out.print("Введіть друге число: ");
                double num2 = scanner.nextDouble();

                System.out.println("\nРезультат з меню:");
                execute(selectedOp, num1, num2);
            } else {
                System.out.println("Невірний вибір. Програму завершено.");
            }
        }
        scanner.close();
    }
}