package task3;

public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();

        // Анонімний обробник для журналювання з внутрішнім лічильником
        EventHandler loggerHandler = new EventHandler() {
            // Внутрішній стан анонімного класу
            private int eventCount = 0;

            @Override
            public void handle(String event) {
                eventCount++;
                System.out.println("Виконується журналювання події.");
                System.out.println("Лічильник логера: оброблено подій - " + eventCount);
            }
        };

        // Анонімний обробник для сповіщень
        EventHandler notificationHandler = new EventHandler() {
            @Override
            public void handle(String event) {
                System.out.println("Виконується надсилання сповіщення.");
            }
        };

        // Анонімний обробник для оновлення
        EventHandler updateHandler = new EventHandler() {
            @Override
            public void handle(String event) {
                System.out.println("Виконується оновлення системи.");
            }
        };

        // Виклик обробників для різних подій
        manager.trigger("Помилка авторизації користувача", loggerHandler);
        // Викликаємо вдруге, щоб перевірити лічильник
        manager.trigger("Втрата з'єднання з базою даних", loggerHandler);
        manager.trigger("Завершення формування звіту", notificationHandler);
        manager.trigger("Завантажено новий патч безпеки", updateHandler);
    }
}