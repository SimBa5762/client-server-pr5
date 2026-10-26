package task3;

public class EventManager {
    public void trigger(String event, EventHandler handler)
    {
        System.out.println("Подія отримана:" + event);
        handler.handle(event);
    }

}
