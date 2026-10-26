package task6;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Робота з Configuration (Статичний клас) ---");
        // Створюємо конфігурацію
        Computer.Configuration config1 = new Computer.Configuration(16, 512, "Windows 11");
        Computer.Configuration config2 = new Computer.Configuration(32, 1024, "macOS Sequoia");

        config1.printConfig();
        config2.printConfig();

        // Порівняння за обсягом RAM
        Computer.Configuration.compareRAM(config1, config2);

        System.out.println("\n--- Робота з Processor (Внутрішній клас) ---");
        // Створюємо два комп'ютери
        Computer comp1 = new Computer("Dell", "Inspiron");
        Computer comp2 = new Computer("Apple", "MacBook Pro");

        Computer.Processor proc1 = comp1.new Processor();
        Computer.Processor proc2 = comp2.new Processor();

        proc1.start();
        proc2.start();
    }
}