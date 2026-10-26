package task1;

public class Main {

    public static void main(String[] args)
    {
        Notification notification = new Notification()
        {
            @Override
            public void send(String message)
            {
              System.out.print("Надсилання повідомлення:" + message + "\n");
            }
        };

        notification.send("The first notification text");
        notification.send("The second text");
    }
}
