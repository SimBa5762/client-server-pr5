package task6;

public class Computer {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Статичний вкладений клас (не потребує об'єкта Computer)
    public static class Configuration {
        private int RAM;
        private int storage;
        private String operatingSystem;

        public Configuration(int RAM, int storage, String operatingSystem) {
            this.RAM = RAM;
            this.storage = storage;
            this.operatingSystem = operatingSystem;
        }

        public int getRAM() {
            return RAM;
        }

        public void printConfig() {
            System.out.println("ОС: " + operatingSystem + " | RAM: " + RAM + " ГБ | Диск: " + storage + " ГБ");
        }

        // Метод порівняння конфігурацій
        public static void compareRAM(Configuration c1, Configuration c2) {
            if (c1.RAM > c2.RAM) {
                System.out.println("Перша конфігурація має більше оперативної пам'яті (" + c1.RAM + " ГБ проти " + c2.RAM + " ГБ).");
            } else if (c1.RAM < c2.RAM) {
                System.out.println("Друга конфігурація має більше оперативної пам'яті (" + c2.RAM + " ГБ проти " + c1.RAM + " ГБ).");
            } else {
                System.out.println("Обидві конфігурації мають однаковий обсяг оперативної пам'яті (" + c1.RAM + " ГБ).");
            }
        }
    }

    // Нестатичний внутрішній клас (завжди прив'язаний до конкретного Computer)
    public class Processor {
        public void start() {
            // Має прямий доступ до полів brand та model зовнішнього об'єкта
            System.out.println("Процесор комп'ютера " + brand + " " + model + " запускається.");
        }
    }
}