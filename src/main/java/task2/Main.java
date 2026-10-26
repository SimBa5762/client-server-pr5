package task2;


public class Main {

    static void testCalculator(Calculator calculator, double a, double b) {
        // Виклик методу через інтерфейсне посилання
        double result = calculator.calculate(a, b);
        System.out.println("Результат для (" + a + ", " + b + ") = " + result);
    }

    public static void main(String[] args)
    {


        Calculator addition = new Calculator()
        {
            @Override
            public double calculate(double a, double b)
            {
                return a+b;
            }
        };
        Calculator multiplication = new Calculator()
        {
            @Override
            public double calculate(double a, double b)
            {
                return a*b;
            }
        };

        Calculator max = new Calculator()
        {
            @Override
            public double calculate(double a, double b)
            {
                return Math.max(a, b);
            }
        };

        System.out.println("Операція: Додавання");
        testCalculator(addition, 10.5, 4.5);
        testCalculator(addition, 20.0, -5.0);

        System.out.println("\nОперація: Множення");
        testCalculator(multiplication, 10.0, 4.5);
        testCalculator(multiplication, 3.0, 3.0);

        System.out.println("\nОперація: Максимум");
        testCalculator(max, 10.5, 42.0);
        testCalculator(max, -5.0, 0.0);
    }
}
