package task7;

enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

class Order {
    public int id;
    public String product;
    public OrderStatus status;

    public Order(int id, String product, OrderStatus status) {
        this.id = id;
        this.product = product;
        this.status = status;
    }
}

public class Main {

    // Метод з використанням switch для обробки enum
    static void printStatusMessage(OrderStatus status) {
        switch (status) {
            case NEW:
                System.out.println("Замовлення створено");
                break;
            case PROCESSING:
                System.out.println("Замовлення обробляється");
                break;
            case SHIPPED:
                System.out.println("Замовлення передано службі доставки");
                break;
            case DELIVERED:
                System.out.println("Замовлення доставлено");
                break;
            case CANCELLED:
                System.out.println("Замовлення скасовано");
                break;
            default:
                System.out.println("Невідомий статус");
        }
    }

    public static void main(String[] args) {
        // Створення декількох замовлень із різними статусами
        Order order1 = new Order(101, "Смартфон", OrderStatus.NEW);
        Order order2 = new Order(102, "Ноутбук", OrderStatus.SHIPPED);
        Order order3 = new Order(103, "Навушники", OrderStatus.DELIVERED);
        Order order4 = new Order(104, "Чохол", OrderStatus.CANCELLED);

        System.out.println("--- Обробка конкретних замовлень ---");
        System.out.print("Замовлення №" + order1.id + " (" + order1.product + "): ");
        printStatusMessage(order1.status);

        System.out.print("Замовлення №" + order2.id + " (" + order2.product + "): ");
        printStatusMessage(order2.status);

        System.out.print("Замовлення №" + order3.id + " (" + order3.product + "): ");
        printStatusMessage(order3.status);

        System.out.print("Замовлення №" + order4.id + " (" + order4.product + "): ");
        printStatusMessage(order4.status);

        System.out.println("\n--- Всі можливі статуси в системі ---");
        // Використання OrderStatus.values() для виведення всіх статусів
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println("- " + status);
        }
    }
}