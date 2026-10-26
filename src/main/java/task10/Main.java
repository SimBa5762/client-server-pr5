package task10;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void clear() {
        this.value = null;
    }

    public boolean isEmpty() {
        return value == null;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Java");
        System.out.println("Значення: " + stringBox.get());
        stringBox.clear();
        System.out.println("Чи порожній контейнер: " + stringBox.isEmpty());

        System.out.println("\n--- Робота з Box<Integer> ---");
        Box<Integer> intBox = new Box<>();
        intBox.set(2026);
        System.out.println("Значення: " + intBox.get());
        intBox.clear();
        System.out.println("Чи порожній контейнер? " + intBox.isEmpty());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(99.99);
        System.out.println("Значення: " + doubleBox.get());
        doubleBox.clear();
        System.out.println("Чи порожній контейнер? " + doubleBox.isEmpty());

        // Демонстрація типобезпеки (Type Safety)
        //stringBox.set(100);
    }
}